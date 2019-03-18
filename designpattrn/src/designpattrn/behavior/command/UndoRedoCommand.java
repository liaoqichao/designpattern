package designpattrn.behavior.command;

public interface UndoRedoCommand extends Command{

	void exec();
	
	/**
	 * 撤销
	 */
	void undo();
	
	/**
	 * 恢复
	 */
	void redo();
}
