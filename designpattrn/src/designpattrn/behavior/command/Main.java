package designpattrn.behavior.command;

/**
 * 命令模式
 */
public class Main {

	public static void main(String[] args) {
		Television tv = new Television(); // 接受者：电视，负责执行命令
		RemoteControl rc = new RemoteControl(); // 调用者：遥控器，负责调用命令
		AbstractCommand volUp = new HighVolumeCommand(); // 命令
		
		AbstractCommand channelDown = new LowChannelCommand();
		
		// 调整音量
		volUp.setReceiver(tv);
		rc.setCommand(volUp);
		rc.action();
		
		channelDown.setReceiver(tv);
		rc.setCommand(channelDown);
		
		// 调整频道
		rc.action();
		rc.action();
		rc.action();
		rc.channelUndo();
		rc.channelUndo();
		rc.channelRedo();
		
	}

}
