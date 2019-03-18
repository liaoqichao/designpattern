package designpattrn.behavior.strategy;

/**
 * 人力资源主管
 */
public class HRManager {

	private OvertimeAllowanceStrategy otAllowance;

	public void provideOTAllowance(String name){ 
		System.out.println(name + otAllowance.provideOvertimeAllowance());
	}
	
	public OvertimeAllowanceStrategy getOtAllowance() {
		return otAllowance;
	}

	public void setOtAllowance(OvertimeAllowanceStrategy otAllowance) {
		this.otAllowance = otAllowance;
	}
	
}
