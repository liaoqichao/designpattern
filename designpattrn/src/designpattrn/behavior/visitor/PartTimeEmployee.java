package designpattrn.behavior.visitor;

/**
 * 具体元素：临时工
 */
public class PartTimeEmployee implements IEmployee {

	private String name;
	
	private int hourlyWage; // 时薪
	
	private int workTime;
	
	public PartTimeEmployee(String name, int hourlyWage, int workTime) {
		super();
		this.name = name;
		this.hourlyWage = hourlyWage;
		this.workTime = workTime;
	}

	@Override
	public void accept(IDepartment department) {
		department.visit(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

}
