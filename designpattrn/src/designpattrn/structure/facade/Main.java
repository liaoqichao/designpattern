package designpattrn.structure.facade;

public class Main {

	public static void main(String[] args) {
		GeneratorFacade generator = GeneratorFacade.getInstance();
		String className = "com.User";
		String ddl = "CREATE TABLE USER (ID VARCHAR(36) NOT NULL PRIMARY KEY, NAME VARCHAR(100) DEFAULT '')";
		String daoFramework = "jdbcTemplate";
		generator.generator(className, ddl, daoFramework);
	}

}
