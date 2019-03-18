package designpattrn.behavior.visitor;

/**
 * 抽象访问者：部门
 */
public interface IDepartment {

	public void visit(FullTimeEmployee employee);
	
	public void visit(PartTimeEmployee employee);
}
