package designpattrn.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 复杂元素：聚合了多种具体元素
 */
public class EmployeeList {

	private List<IEmployee> list = new ArrayList<IEmployee>();
	
	public void add(IEmployee employee){ 
		list.add(employee);
	}
	
	public void accept(IDepartment department){ 
		for (IEmployee employee : list) {
			employee.accept(department); // 自动根据对象具体类型走不同的visit方法
		}
	}
}
