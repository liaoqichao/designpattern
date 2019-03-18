package designpattrn.structure.adapter;

public abstract class DefaultDWheelApdater implements DWheel {

	/*
	 *  可以用控方法实现实现接口，具体适配器只需要重写指定方法即可，
	 *  不需要实现全部方法
	 */
//	public void setDeck(){ // 假设这个也是DWheel的方法
//		
//	}
	
	@Override
	public void rush() {
	}
	
}
