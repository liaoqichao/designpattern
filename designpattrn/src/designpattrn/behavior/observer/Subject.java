package designpattrn.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private int moon = 0;
	
	private List<Observer> observerList = new ArrayList<Observer>();
	
	public final void attach(Observer observer){ 
		observerList.add(observer);
	}
	
	public final void detach(Observer observer){ 
		observerList.remove(observer);
	}
	
	protected void notifyObserver(){  // 拉模型，没有参数
		for (Observer observer : observerList) {
			// 拉模型主题对象的状态只能放在抽象类，update无法获取主题对象的具体类型
			observer.update(this); 
		}
	}

	public int getMoon() {
		return moon;
	}

	public void setMoon(int moon) {
		this.moon = moon;
	}

}
