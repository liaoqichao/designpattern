package designpattrn.creation.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	public void func(){
		System.out.println("实例的具体方法...");
	}
}
