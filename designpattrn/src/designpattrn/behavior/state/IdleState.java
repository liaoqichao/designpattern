package designpattrn.behavior.state;

/**
 * 空闲状态
 */
public class IdleState implements State {

	@Override
	public State insertCoin() {
		System.out.println("正在投入硬币...");
		return GashaponMachine.HAS_COIN_STATE;
	}

	@Override
	public State returnCoin(boolean hasCoin) {
		System.out.println("没有硬币退回");
		return this;
	}

	@Override
	public State turnCrank() {
		System.out.println("请投币");
		return this;
	}

	@Override
	public State dispense(boolean isEemty) {
		System.out.println("请投币");
		return this;
	}

}
