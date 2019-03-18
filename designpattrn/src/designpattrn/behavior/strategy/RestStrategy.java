package designpattrn.behavior.strategy;

public class RestStrategy implements OvertimeAllowanceStrategy {

	@Override
	public String provideOvertimeAllowance() {
		// 可调休天数++
//		System.out.println("调休...");
		return "调休";
	}

}
