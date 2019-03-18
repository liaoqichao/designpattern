package designpattrn.behavior.visitor;

/**
 * 具体访问者：财务部
 */
public class FinanceDepartment implements IDepartment {

	@Override
	public void visit(FullTimeEmployee employee) {
		System.out.println("正式员工"+employee.getName()+"的工资为"+ employee.getWorkTime() * employee.getWeeklyWage());
	}

	@Override
	public void visit(PartTimeEmployee employee) {
		System.out.println("临时工"+employee.getName()+"的工资为"+ employee.getWorkTime() * employee.getHourlyWage());
	}

}
