package designpattrn.behavior.command;

public class LowChannelCommand extends ChannelCommand {

	@Override
	public void execute() {
		this.receiver.operation(this);
	}

	@Override
	public ChannelCommand inverse() {
		ChannelCommand command = new HighChannelCommand();
		command.setReceiver(receiver);
		return command;
	}

}
