package designpattrn.behavior.mediator;

public class SimpleElasticsearchDatabase extends AbstractSimpleDatabase {

	public SimpleElasticsearchDatabase() {
		super();
		SimpleMediator.getMediator().regist(AbstractDatabase.ELASTICSEARCH, this);
	}

	@Override
	public void add(String data) {
		addData(data);
		SimpleMediator.getMediator().addData(AbstractDatabase.ELASTICSEARCH, data);
	}

	@Override
	protected void addData(String data) {
		System.out.println("es添加数据：" + data);			
	}

	
}
