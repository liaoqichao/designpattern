package designpattrn.behavior.observer;

/**
 * 孕妇，具体主题对象
 */
public class PregnantWoman extends Subject {

	public void increment(){ 
		this.setMoon(this.getMoon()+1);
		this.notifyObserver(); // 状态改变通知观察者
	}
	
}
