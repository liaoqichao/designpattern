package designpattrn.behavior.command;

/**
 * 抽象命令
 */
public abstract class AbstractCommand implements Command {

	protected Receiver receiver;
	
	abstract public void execute(); // 抽象业务
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	
}
