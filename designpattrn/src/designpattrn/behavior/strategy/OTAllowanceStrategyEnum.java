package designpattrn.behavior.strategy;

public enum OTAllowanceStrategyEnum {

	REST(new RestStrategy()),
	DOUBLE_SALARY(new DoubleSalaryStrategy());
	
	private OvertimeAllowanceStrategy strategy;
	
	private OTAllowanceStrategyEnum(OvertimeAllowanceStrategy strategy) {
		this.strategy = strategy;
	}
	
	public OvertimeAllowanceStrategy getStrategy(){
		return strategy;
	}
	
	public String provideOTAllowance(){ 
		return this.strategy.provideOvertimeAllowance();
	}
	
}
