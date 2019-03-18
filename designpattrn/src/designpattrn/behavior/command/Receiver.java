package designpattrn.behavior.command;

/**
 * 命令的接收者
 */
public interface Receiver {

	void operation(Command command);
}
