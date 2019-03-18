package designpattrn.behavior.command;

public class HighVolumeCommand extends AbstractCommand {

	@Override
	public void execute() {
		this.receiver.operation(this);
	}

}
