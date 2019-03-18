package designpattrn.behavior.mediator;

/**
 * 抽象同事类
 */
public abstract class AbstractDatabase {

	public static final String MYSQL = "mysql";
	public static final String REDIS = "redis";
	public static final String ELASTICSEARCH = "elasticsearch";
	
	protected AbstractMediator mediator; // 抽象中介者引用
	
	public AbstractDatabase(AbstractMediator mediator){ 
		this.mediator = mediator;
	}
	
	// 添加数据到数据库
	abstract protected void addData(String data);
	
	// 添加数据到数据库，并同步数据库， 外部方法
	abstract public void add(String data);
}
