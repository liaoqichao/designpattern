package designpattrn.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Watcher implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("我观察到你的状态啦：" + arg);
	}

}
