package designpattrn.behavior.command;

/**
 * 频道
 */
public class Channel implements HighLowable {

	private int value = 1;
	
	public void high(){ 
		value++; // 一共300个频道。1~300
		if(value > 300){ 
			value -= 300;
		}
	}
	
	public void low(){ 
		value--; // 一共300个频道。1~300
		if(value <= 0){ 
			value += 300;
		}
	}

	public int getValue() {
		return value;
	} 
	
}
