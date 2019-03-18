package designpattrn.behavior.visitor;

/**
 * 抽象元素：员工
 */
public interface IEmployee {

	public void accept(IDepartment department);
}
