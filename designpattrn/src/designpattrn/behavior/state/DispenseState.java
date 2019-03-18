package designpattrn.behavior.state;

public class DispenseState implements State {

	@Override
	public State insertCoin() {
		System.out.println("请等待发放扭蛋");
		return this;
	}

	@Override
	public State returnCoin(boolean hasCoin) {
		if(hasCoin){ 
			System.out.println("退回硬币");
			return GashaponMachine.IDLE_STATE;
		} else { 
			System.out.println("没有硬币退回");
			return this;
		}
	}

	@Override
	public State turnCrank() {
		System.out.println("请等待发放扭蛋");
		return this;
	}

	@Override
	public State dispense(boolean isEmpty) {
		if(isEmpty){ 
			return returnCoin(true);
		}
		System.out.println("发放扭蛋");
		return GashaponMachine.IDLE_STATE;
	}
}
