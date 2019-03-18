package designpattrn.structure.flyweight;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		flyWeight();
		compositeFlyWeight();
	}

	public static void flyWeight() {
		ThreadPool pool = ThreadPool.getInstance();
		Thread t1 = pool.getThread();
		Thread t2 = pool.getThread();
		Thread t3 = pool.getThread();
		pool.release(t1);
		pool.release(t2);
		Thread t4 = pool.getThread();
		System.out.println(t1.getName()+","+t3.getName()+","+ (t1 == t3));
		System.out.println(t1.getName()+","+t4.getName()+","+ (t1 == t4));
	}

	public static void compositeFlyWeight() {
		ThreadPool pool = ThreadPool.getInstance();
		List<Thread> tlist1 = pool.getDoubleThreadList(); // 把List<Thread>当做CompositeFlyWeight
		pool.release(tlist1.get(0));
		List<Thread> tlist2 = pool.getDoubleThreadList();
		System.out.println("tlist1 == tlist2 :" + (tlist1 == tlist2));
		for(int i = 0 ; i < tlist1.size() ; i++){ 
			for(int j = 0 ; j < tlist2.size() ; j++){ 
				System.out.println("list1"+tlist1.get(i).getName() + ", list2" + tlist2.get(j).getName()+","+(tlist1.get(i) == tlist2.get(j)));
			}
			
		}
	}

}
