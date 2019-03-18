package designpattrn.behavior.visitor;

/**
 * 具体元素：正式员工
 */
public class FullTimeEmployee implements IEmployee {

	private String name;
	
	private int weeklyWage; // 周薪
	
	private int workTime;	
	
	public FullTimeEmployee(String name, int weeklyWage, int workTime) {
		super();
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}


	@Override
	public void accept(IDepartment department) {
		department.visit(this); // visit重载，静态分派
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeeklyWage() {
		return weeklyWage;
	}


	public void setWeeklyWage(int weeklyWage) {
		this.weeklyWage = weeklyWage;
	}


	public int getWorkTime() {
		return workTime;
	}


	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	
	

}
