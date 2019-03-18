package designpattrn.behavior.visitor;

import designpattrn.behavior.visitor.dispatch.BlackHorse;
import designpattrn.behavior.visitor.dispatch.Horse;
import designpattrn.behavior.visitor.dispatch.Mozi;
import designpattrn.behavior.visitor.dispatch.WhiteHorse;

public class Main {

	public static void main(String[] args) {
//		staticDispatch(); // Java通过函数重载实现静态分派
//		dynamicDispatch();	// Java通过子类覆写父类方法实现动态分派
		visitor();
	}

	public static void visitor() {
		FullTimeEmployee zhangSan = new FullTimeEmployee("张三", 2000, 4);
		PartTimeEmployee liSi = new PartTimeEmployee("李四", 180, 30);
		EmployeeList list = new EmployeeList();
		list.add(zhangSan); // 复杂元素有统一的接口
		list.add(liSi);
		
		IDepartment financeDepartment = new FinanceDepartment();
		IDepartment hrDepartment = new HRDepartment();
		
		list.accept(financeDepartment); // 访问者也有统一的接口
		list.accept(hrDepartment);
		
		
	}
	public static void staticDispatch() {
		/*
		 * Java通过函数重载实现静态分派
		 * Java的函数重载是通过对象的引用类型（变量类型）来判断是执行哪个方法。
		 * 
		 * 这里3个马的对象引用类型都是Horse，所以Mozi执行重载的方法都是ride(Horse)方法
		 */
		Mozi mozi = new Mozi();
		Horse h = new Horse();
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		mozi.staticRide(h); // 墨子在骑马
		mozi.staticRide(wh); // 墨子在骑马
		mozi.staticRide(bh); // 墨子在骑马
	}

	public static void dynamicDispatch() {
		Mozi mozi = new Mozi();
		Horse h = new Horse();
		Horse wh = new WhiteHorse();
		Horse bh = new BlackHorse();
		mozi.dynamicRide(h); // 墨子在骑马
		mozi.dynamicRide(wh); // 墨子在骑白马
		mozi.dynamicRide(bh); // 墨子在骑黑马
	}
}
