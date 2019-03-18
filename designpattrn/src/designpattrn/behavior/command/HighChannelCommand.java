package designpattrn.behavior.command;

public class HighChannelCommand extends ChannelCommand {

	@Override
	public void execute() {
		this.receiver.operation(this);
	}

	@Override
	public ChannelCommand inverse() {
		ChannelCommand command = new LowChannelCommand();
		command.setReceiver(receiver);
		return command;
	}
	
}
