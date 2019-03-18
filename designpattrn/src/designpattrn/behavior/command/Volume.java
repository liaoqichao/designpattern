package designpattrn.behavior.command;

/**
 * 音量
 */
public class Volume implements HighLowable {

private int value = 0;
	
	public void high(){ 
		if(value < 10){
			value++;
		} 
	}
	
	public void low(){ 
		if(value >= 0){ 
			value--;
		}
	}

	public int getValue() {
		return value;
	} 
}
