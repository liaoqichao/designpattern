package designpattrn.behavior.mediator;

/**
 * 具体同事类
 */
public class MysqlDatabase extends AbstractDatabase {

	public MysqlDatabase(AbstractMediator mediator) {
		super(mediator);
	}

	@Override
	public void add(String data) {
		// add to mysql
		this.addData(data);
		// synchronize
		this.mediator.sync(AbstractDatabase.MYSQL, data);
	}

	@Override
	public void addData(String data) {
		System.out.println("mysql添加数据：" + data);
	}

}
