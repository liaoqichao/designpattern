package designpattrn.creation.singleton;

public class LHSSingleton {

	private static LHSSingleton instance;
	
	private LHSSingleton() {
		
	}
	
	public synchronized static LHSSingleton getInstance(){ // 增加同步，处理多线程
		if(instance == null) {
			instance = new LHSSingleton();
		}
		return instance;
	}
	
	public void func(){
		System.out.println("实例的具体方法...");
	}
}
