package designpattrn.creation.singleton;

/**
 * 私有嵌套类
 * @author LQC
 *
 */
public class NestedClassSingleton {

	private NestedClassSingleton() {
		
	}
	
	private static class NestedClassSingletonHolder {
		private static NestedClassSingleton instance = new NestedClassSingleton();
	}
	
	public static NestedClassSingleton getInstance(){ 
		return NestedClassSingletonHolder.instance; 
	}
}
