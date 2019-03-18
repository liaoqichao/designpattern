package designpattrn.behavior.command;

public class LowVolumeCommand extends AbstractCommand {

	@Override
	public void execute() {
		this.receiver.operation(this);
	}

}
