package designpattrn.behavior.mediator;

/**
 * 具体同事类
 */
public class ElasticsearchDatabase extends AbstractDatabase {

	public ElasticsearchDatabase(AbstractMediator mediator) {
		super(mediator);
	}
	
	@Override
	public void add(String data) {
		// add to es
		this.addData(data);
		// synchronize
		this.mediator.sync(AbstractDatabase.ELASTICSEARCH, data);
	}

	@Override
	public void addData(String data) {
		System.out.println("es添加数据：" + data);
	}

}
