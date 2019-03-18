package designpattrn.creation.singleton;

/**
 * 恶汉式
 * @author LQC
 *
 */
public class EHSSingleton {

	private static EHSSingleton instance = new EHSSingleton();  // 类加载时初始化
	
	private EHSSingleton(){
		
	}
	
	public static EHSSingleton getInstance() {
		return instance;
	}
	
	public void func(){
		System.out.println("实例的具体方法...");
	}
}
