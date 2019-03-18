package designpattrn.behavior.observer;

import java.util.Observable;

/**
 * 具体主题对象，被观察者
 */
public class Watched extends Observable {

	private int state;
	
	public void func(int state){ 
		System.out.println("修改后状态" + state);
		if(this.state != state){ 
			this.setChanged(); // 标记，不然不会调用观察者
			this.notifyObservers(state); // 通知观察者
		}
		this.state = state;
	}
}
