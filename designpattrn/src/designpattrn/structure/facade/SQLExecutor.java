package designpattrn.structure.facade;

public class SQLExecutor {

	public void execute(){
		System.out.println("执行ddl语句");
	}
	
	public void queryTableStructure(){
		System.out.println("得到表字段和类型map");
	}
}
