package designpattrn.structure.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {

	private static ThreadPool instance;
	private final int fixedSize = 3;
	private final int threadListSize = 2;
	private List<Thread> pool;
	
	private ThreadPool(){ 
		if(pool == null){ 
			pool = new ArrayList<Thread>(fixedSize);
		}
		for(int i = 0 ; i < fixedSize ; i++){ 
			Thread t = new Thread("线程"+i); // 线程名字是线程享元的内蕴状态。
			pool.add(t);
		}
	}
	
	public static ThreadPool getInstance(){ 
		if(instance == null){ 
			synchronized (ThreadPool.class) {
				if(instance == null){ 
					instance = new ThreadPool();
				}
			}
		}
		return instance;
	}
	
	public Thread getThread(){ 
		if(pool.isEmpty()){ 
			throw new RuntimeException("线程用完了，本线程池不支持创建连接");
		}
		return pool.remove(0);
	}
	
	public void release(Thread thread){ 
		if(pool.size() > 2){ 
			System.out.println("线程池已爆满，不回收这个线程");
		} else { 
			pool.add(thread);
		}
	}
	
	public List<Thread> getDoubleThreadList(){ 
		/*
		 *  list不是共享的，因为外部可以改变它的内蕴状态，例如add(),remove()，
		 *  元素是共享的,外部无法改变它的内蕴状态
		 */
		List<Thread> list = new ArrayList<Thread>(threadListSize); 
		if(pool.size() < threadListSize){ 
			throw new RuntimeException("线程用完了，本线程池不支持创建连接");
		} else {
			for(int i = 0 ; i < threadListSize; i++){ 
				list.add(pool.get(i));
			}
			for(int i = 0 ; i < threadListSize; i++){ 
				pool.remove(0);
			}
		}
		return list;
	}
}
