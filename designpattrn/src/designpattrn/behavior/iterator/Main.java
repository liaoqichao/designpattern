package designpattrn.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		extrinsicIterator(); // 白箱聚集与外禀迭代子
		
		intrinsicIterator(); // 黑箱聚集与內禀迭代子
		
		failfast();
	}

	public static void failfast() {
		User u1 = new User("张三", 13);
		User u2 = new User("李四", 14);
		User u3 = new User("王五", 15);
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		java.util.Iterator<User> it = list.iterator();
		while(it.hasNext()) { 
			User user = it.next();
			if("张三".equals(user.getName())){ 
				it.remove(); // 不会fail fast
				// CopyOnWriterArrayList可以边增删，边遍历。
//				list.remove(user); // Exception in thread "main" java.util.ConcurrentModificationException
//				list.add(new User("赵六",16)); // Exception in thread "main" java.util.ConcurrentModificationException
			} else {
				System.out.println(user);
			}
		}
	}

	public static void extrinsicIterator() {
		User u1 = new User("张三", 13);
		User u2 = new User("李四", 14);
		User u3 = new User("王五", 15);
		User[] arr = {u1, u2, u3};
		
		// 1. 创建聚集元素
		Aggregate<User> agg = new ConcreteAggregate<User>(arr);
//		ConcreteAggregate<User> agg = new ConcreteAggregate<User>(arr);
		
		// 2. 创建迭代元素
		// 白箱聚集，迭代器可以脱离于聚集元素单独new
//		ExtrinsicIterator<User> it = new ConcreteExtrinsicIterator<User>(agg); // agg需要改为子类类型
		Iterator<User> it = agg.createIerator();
		
		// 3. 遍历
		for( ; !it.isDone() ; it.next()){ 
			User user = it.currentItem();
			System.out.println(user);
		}
		
		// 4. 重置游标，方便下次遍历
		it.first();
		
		/*
		 *  白箱聚集可以一个迭代器迭代多个元素。
		 *  1. 创建聚集元素
		 *  UserAggregate ua = new UserAggregate(userArr);
		 *  EmailAggregate ea = new EmailAggregate(emailArr);
		 *  
		 *  2. 创建迭代器
		 *  Iterator it = new ConcreteIterator();
		 *  
		 *  3. 设置聚集元素
		 *  it.setAgg(ua);
		 *  
		 *  4. 迭代
		 *  for(;!it.isDone();it.next()){ User user = it.currentItem();}
		 *  
		 *  5. 设置另外一个聚集元素并重置游标
		 *  it.setAgg(ea); it.first();
		 *  
		 *  6. 遍历另外一个聚集元素
		 *  for(;!it.isDone();it.next()){ Email email = it.currentItem();}
		 */
		
	}
	
	public static void intrinsicIterator() {
		User u1 = new User("张三", 13);
		User u2 = new User("李四", 14);
		User u3 = new User("王五", 15);
		User[] arr = {u1, u2, u3};
		
		// 1. 创建聚集元素
		Aggregate<User> agg = new ConcreteBlackAggregate<User>(arr);
		// agg.getElment(index) 外界窄接口，无法获取元素
		// 2. 创建迭代器
		// ConcreteInstrinsicIterator无法在外部被创建,因此叫內禀,因为是private class，
		Iterator<User> it = agg.createIerator(); 
		// 3. 遍历元素
		for(; !it.isDone() ; it.next()){ 
			User user = it.currentItem(); // 迭代器宽接口，可以获取元素
			System.out.println(user);
		}
		// 4. 重置游标
		it.first();
		
	}

}
