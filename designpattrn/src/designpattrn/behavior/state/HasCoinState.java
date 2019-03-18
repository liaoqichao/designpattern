package designpattrn.behavior.state;

/**
 * 已投入硬币状态
 */
public class HasCoinState implements State {

	@Override
	public State insertCoin() {
		System.out.println("请旋转曲柄");
		return this;
	}

	@Override
	public State returnCoin(boolean hasCoin) {
		if(hasCoin){ 
			return GashaponMachine.IDLE_STATE;
		} else { 
			return this;
		}
	}

	@Override
	public State turnCrank() {
		System.out.println("正在旋转曲柄...");
		return GashaponMachine.DISPENSE_STATE;
	}

	@Override
	public State dispense(boolean isEempty) {
		System.out.println("请旋转曲柄");
		return this;
	}

}
