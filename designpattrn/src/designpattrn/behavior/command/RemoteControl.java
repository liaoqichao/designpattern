package designpattrn.behavior.command;

public class RemoteControl extends Invoker {

	@Override
	void action() {
		if(this.command instanceof ChannelCommand){ 
			((ChannelCommand)this.command).exec();
		} else {
			command.execute();
		}
		
	}
	
	public void channelUndo() {
		if(this.command instanceof ChannelCommand){ 
			((ChannelCommand)this.command).undo();
		}
	}
	
	public void channelRedo() {
		if(this.command instanceof ChannelCommand){ 
			((ChannelCommand)this.command).redo();
		}
	}


}
