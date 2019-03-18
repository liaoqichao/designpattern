package designpattrn.structure.facade;

/**
 * SQL逆向工程生成代码外观类
 */
public class GeneratorFacade {

	private static GeneratorFacade instance;
	
	private GeneratorFacade(){ 
		
	}
	
	public static GeneratorFacade getInstance(){ 
		if(instance == null){ 
			synchronized (GeneratorFacade.class) {
				if(instance == null){ 
					instance = new GeneratorFacade(); 
				}
			}
		}
		return instance;
	}

	public void generator(String className, String ddl, String daoFramework){ 
		System.out.println("设置实体类的全限定名");
		System.out.println("设置ddl");
		System.out.println("设置生成框架");
		SQLExecutor sqlExecutor = new SQLExecutor();
		sqlExecutor.execute(); // 执行sql语句，建表
		sqlExecutor.queryTableStructure(); // 得到表的字段和sql类型map
		new TypeMapping().mapping(); // 映射Java类型和sql类型
		new EntityGenerator().generate();
		new DaoGenerator().generate();
		new ServiceGenerator().generate();
	}
}
