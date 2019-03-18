package designpattrn.behavior.mediator;

public class SimpleRedisDatabase extends AbstractSimpleDatabase {

	public SimpleRedisDatabase() {
		super();
		SimpleMediator.getMediator().regist(AbstractDatabase.REDIS, this);
	}

	@Override
	public void add(String data) {
		addData(data);
		SimpleMediator.getMediator().addData(AbstractDatabase.REDIS, data);
	}

	@Override
	protected void addData(String data) {
		System.out.println("redis添加数据：" + data);	
	}

}
