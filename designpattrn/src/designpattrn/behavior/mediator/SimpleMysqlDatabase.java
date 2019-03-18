package designpattrn.behavior.mediator;

public class SimpleMysqlDatabase extends AbstractSimpleDatabase {

	public SimpleMysqlDatabase() {
		super();
		SimpleMediator.getMediator().regist(AbstractDatabase.MYSQL, this);
	}

	@Override
	public void add(String data) {
		addData(data);
		SimpleMediator.getMediator().addData(AbstractDatabase.MYSQL, data);
	}

	@Override
	protected void addData(String data) {
		System.out.println("mysql添加数据：" + data);			
	}

}
