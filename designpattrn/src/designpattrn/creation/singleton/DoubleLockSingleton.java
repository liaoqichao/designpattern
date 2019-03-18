package designpattrn.creation.singleton;

/**
 * 双重锁形式，jdk1.4以及之前无效
 * @author LQC
 *
 */
public class DoubleLockSingleton {

	private static DoubleLockSingleton instance;
	
	private DoubleLockSingleton(){ 
		
	}
	
	public static DoubleLockSingleton getInstance(){
		// 有实例直接返回实例，减少进入同步代码块的次数，提高性能
		if(instance != null){
			// 进入同步代码块
			synchronized (DoubleLockSingleton.class) {
				// 如果有实例直接返回实例，没有则创建
				if(instance != null){ 
					instance = new DoubleLockSingleton();
				}
			}
		}
		return instance;
	}
	
	public void func(){
		System.out.println("实例的具体方法...");
	}
}

/**
 * 在多线程开发中，为了解决并发问题，主要是通过使用synchronized来加互斥锁进行同步控制。但是在某些情况中，JVM已经隐含地为您执行了同步，这些情况下就不用自己再来进行同步控制了。这些情况包括：
 * 1.由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时
 * 2.访问final字段时
 * 3.在创建线程之前创建对象时
 * 4.线程可以看见它将要处理的对象时
 */

