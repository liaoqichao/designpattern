package designpattrn.behavior.state;

/**
 * 状态模式
 */
public class Main {

	public static void main(String[] args) {
		// 同一个对象同一个方法，具有不同的行为，因为其内部状态发生了变化。
		GashaponMachine gashaponMachine = new GashaponMachine(); // 扭蛋机
		gashaponMachine.insertCoin();
		gashaponMachine.turnCrank(); 	// 正在旋转曲柄...
		gashaponMachine.dispense();		// 发放扭蛋
		
		gashaponMachine.insertCoin();
		gashaponMachine.turnCrank();	// 正在旋转曲柄...
		gashaponMachine.dispense();		// 退回硬币
		
		gashaponMachine.turnCrank();	// 请投币
		gashaponMachine.turnCrank();	// 请投币
		gashaponMachine.turnCrank();	// 请投币
	}

}
