package designpattrn.behavior.mediator;

public class RedisDatabase extends AbstractDatabase {

	public RedisDatabase(AbstractMediator mediator) {
		super(mediator);
	}

	@Override
	public void add(String data) {
		// add to redis
		this.addData(data);
		// don't synchronize
	}

	@Override
	public void addData(String data) {
		System.out.println("redis添加数据：" + data);
	}

}
