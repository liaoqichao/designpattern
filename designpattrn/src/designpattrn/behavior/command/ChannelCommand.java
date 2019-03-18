package designpattrn.behavior.command;

public abstract class ChannelCommand extends AbstractUndoRedoCommand {

	abstract public ChannelCommand inverse();
}
