package designpattrn.behavior.observer;

/**
 * 观察者模式
 */
public class Main {

	public static void main(String[] args) {
//		observer();
		
		jdkObserver();
		
	}
	
	public static void jdkObserver() {
		// 主题对象
		Watched watched = new Watched();
		// 观察者
		java.util.Observer o = new Watcher();
		// 注册
		watched.addObserver(o);
		// 改变状态
		watched.func(5);
		// 状态不改变
		watched.func(5);
		
	}

	public static void observer(){ 
		// 主题
		PregnantWoman pregnantWoman = new PregnantWoman(); // 具体主题的引用
		
		// 观察者
		Observer prenatalEducation = new PrenatalEducationObserver();
		Observer babyThings = new BabyThingsObserver();
		
		// 注册
		pregnantWoman.attach(prenatalEducation);
		pregnantWoman.attach(babyThings);
		
		// 改变状态
		for(int i = 1 ; i<= 10 ; i++){ 
			System.out.println(i+"个月：");
			pregnantWoman.increment();
		}
	}

}
