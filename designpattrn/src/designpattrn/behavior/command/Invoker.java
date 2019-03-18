package designpattrn.behavior.command;

/**
 * 调用命令，客户端使用
 */
public abstract class Invoker {

	
	protected Command command;
	
	abstract void action();

	public void setCommand(Command command) {
		this.command = command;
	}
	
	
}
