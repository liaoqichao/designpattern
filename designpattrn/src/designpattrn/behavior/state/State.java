package designpattrn.behavior.state;

public interface State {

	/**
	 * 投硬币
	 */
	public State insertCoin();
	
	/**
	 * 退回硬币
	 */
	public State returnCoin(boolean hasCoin);
	
	/**
	 * 旋转曲柄
	 */
	public State turnCrank();
	
	/**
	 * 发放扭蛋
	 */
	public State dispense(boolean isEmpty);
	
}
