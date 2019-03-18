package designpattrn.behavior.observer;

public abstract class AbstractObserver implements Observer {

	public static final String IDLE = "idle";
	public static final String PREPARE = "prepare";
	public static final String WORK = "work";
	
	protected String observerState;

}
