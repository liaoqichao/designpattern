package designpattrn.behavior.strategy;

/**
 * 策略模式
 */
public class Main {

	public static void main(String[] args) {
		// 创建Context
		HRManager manager = new HRManager();
		// 读取配置、数据库反射获取策略、根据不同情况选择不同策略
		OvertimeAllowanceStrategy rest = OTAllowanceStrategyEnum.REST.getStrategy();
		OvertimeAllowanceStrategy doubleSalary = OTAllowanceStrategyEnum.DOUBLE_SALARY.getStrategy();
		// Context自由选择策略
		manager.setOtAllowance(rest);
		manager.setOtAllowance(doubleSalary);
		// Context调用方法
		manager.provideOTAllowance("张三");
	}

}
