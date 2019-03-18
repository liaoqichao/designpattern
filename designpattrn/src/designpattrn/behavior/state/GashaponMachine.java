package designpattrn.behavior.state;

/**
 * 扭蛋机，环境类Context
 */
public class GashaponMachine {

	private int num;
	
	private boolean hasCoin;

	private State state;
	
	public static final State IDLE_STATE = new IdleState();
	
	public static final State HAS_COIN_STATE = new HasCoinState();
	
	public static final State DISPENSE_STATE = new DispenseState();
	
	public GashaponMachine() {
		super();
		num = 1;
		hasCoin = false;
		state = IDLE_STATE;
	}
	
	public void insertCoin(){ 
		this.state = this.state.insertCoin();
		hasCoin = true;
	}
	
	public void turnCrank(){ 
		this.state = this.state.turnCrank();
	}
	
	public void dispense(){ 
		this.state = this.state.dispense(num-- <= 0);
		hasCoin = false;
	}
	
	public void returnCoin(){ 
		this.state = this.state.returnCoin(hasCoin); // 返回的状态有2种可能
		hasCoin = false;
	}
	
	
}
