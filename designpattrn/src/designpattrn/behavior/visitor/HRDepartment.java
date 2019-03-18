package designpattrn.behavior.visitor;

/**
 * 具体访问者：人力资源部门
 */
public class HRDepartment implements IDepartment {

	@Override
	public void visit(FullTimeEmployee employee) {
		System.out.println("正式员工"+employee.getName()+"工作了"+employee.getWorkTime()+"周");
	}

	@Override
	public void visit(PartTimeEmployee employee) {
		System.out.println("临时工"+employee.getName()+"工作了"+employee.getWorkTime()+"小时");
	}

}
