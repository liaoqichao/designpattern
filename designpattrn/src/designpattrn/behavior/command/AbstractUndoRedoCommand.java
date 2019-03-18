package designpattrn.behavior.command;

import java.util.Stack;

public abstract class AbstractUndoRedoCommand extends AbstractCommand implements UndoRedoCommand {

	// 改成Map<Receiver, Stack<Command>> 可以应对多个接收器
	protected Stack<ChannelCommand> undoStack = new Stack<ChannelCommand>(); // 撤销命令栈，
	protected Stack<ChannelCommand> redoStack = new Stack<ChannelCommand>(); // 重复命令栈
	
	abstract public void execute(); // 抽象业务
	
	@Override
	public final void undo() {
		if(undoStack.isEmpty()) {
			throw new RuntimeException("你之前没命令，无法撤销。");
		} else {
			System.out.println("返回到上一个频道");
			ChannelCommand command = undoStack.pop();
			ChannelCommand inverseCommand = command.inverse();
			redoStack.push(inverseCommand);
			inverseCommand.execute();
		}
	}
	
	@Override
	public final void redo() {
		if(redoStack.isEmpty()){ 
			throw new RuntimeException("你之前没撤销命令，无法恢复。");
		} else { 
			System.out.println("撤销返回到上一个频道");
			ChannelCommand command = redoStack.pop();
			ChannelCommand inverseCommand = command.inverse();
			undoStack.push(inverseCommand);
			inverseCommand.execute();
		}
	}
	
	public void exec(){ 
		execute();
		if(ChannelCommand.class.isAssignableFrom(this.getClass())){ 
			undoStack.push((ChannelCommand)this);
			redoStack.clear(); // 清空恢复栈，没有清空不能返回。
		}
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}
