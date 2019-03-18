package designpattrn.creation.singleton;

/**
 * 单例模式
 * @author LQC
 *
 */
public class Singleton {

	public static void main(String[] args) {
		
		// 饿汉式
		EHSSingleton ehs1 = EHSSingleton.getInstance();
		EHSSingleton ehs2 = EHSSingleton.getInstance();
		System.out.println(ehs1 == ehs2); // true
		
		// 懒汉式
		LHSSingleton lhs1 = LHSSingleton.getInstance();
		LHSSingleton lhs2 = LHSSingleton.getInstance();
		System.out.println(lhs1 == lhs2); // true
		
		// 双重锁形式
		DoubleLockSingleton dls1 = DoubleLockSingleton.getInstance();
		DoubleLockSingleton dls2 = DoubleLockSingleton.getInstance();
		System.out.println(dls1 == dls2); // true
		
		// 嵌套类形式
		NestedClassSingleton ncs1 = NestedClassSingleton.getInstance();
		NestedClassSingleton ncs2 = NestedClassSingleton.getInstance();
		System.out.println(ncs1 == ncs2); // true
		
		// 枚举
		EnumSingleton es1 = EnumSingleton.INSTANCE;
		EnumSingleton es2 = EnumSingleton.INSTANCE;
		System.out.println(es1 == es2);
	}
}
