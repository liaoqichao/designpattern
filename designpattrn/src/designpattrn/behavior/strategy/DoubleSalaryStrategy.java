package designpattrn.behavior.strategy;

public class DoubleSalaryStrategy implements OvertimeAllowanceStrategy {

	@Override
	public String provideOvertimeAllowance() {
		// 当月月薪 += 合同月薪 / 本月工作日
//		System.out.println("当天双倍工资...");
		return "当天双倍工资";
	}

}
