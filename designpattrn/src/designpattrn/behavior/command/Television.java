package designpattrn.behavior.command;

public class Television implements Receiver {

	private HighLowable volume =  new Volume();
	private HighLowable channel =  new Channel();

	@Override
	public void operation(Command command) {
		hilo(command);
	}
	
	private void hilo(Command command){ 
		if(command instanceof HighVolumeCommand){ 
			volume.high();
			System.out.println("音量增加，当前音量为：" + volume.getValue());
		} else if(command instanceof LowVolumeCommand){
			volume.low();
			System.out.println("音量降低，当前音量为：" + volume.getValue());
		} else if(command instanceof LowChannelCommand){
			channel.low();
			System.out.println("当前频道为：" + channel.getValue());
		} else if(command instanceof HighChannelCommand){
			channel.high();
			System.out.println("当前频道为：" + channel.getValue());
		}
	}

}
