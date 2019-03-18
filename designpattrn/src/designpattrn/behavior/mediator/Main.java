package designpattrn.behavior.mediator;

/**
 * 中介者模式
 */
public class Main {

	/**
	 * 我们来实现一个简化版的数据同步方案，有三种数据库 Mysql、Redis、Elasticsearch，
	 * 其中的 Mysql 作为主数据库，当增加一条数据时需要同步到另外两个数据库中；
	 * Redis 作为缓存数据库，当增加一条数据时不需要同步到另外另个数据库；
	 * 而 Elasticsearch 作为大数据查询数据库，有一个统计功能，
	 * 当增加一条数据时只需要同步到 Mysql，所以它们之间的关系图如下所示。
	 * 
	 * es  <---> mysql --> redis
	 */
	
	public static void main(String[] args) {
		
		mediator();
		
		simpleMediator();
		
	}
	
	public static void simpleMediator() {
		
		// 1. 创建同事类
		AbstractSimpleDatabase es = new SimpleElasticsearchDatabase();
		AbstractSimpleDatabase mysql = new SimpleMysqlDatabase();
		AbstractSimpleDatabase redis = new SimpleRedisDatabase();
		
		// 2. 添加数据，并同步
		es.add("哈哈");
		mysql.add("毛毛球");
		redis.add("哦");
	}

	public static void mediator(){ 
		// 1. 创建中介者
		AbstractMediator mediator = new SyncMediator();
		
		// 2. 创建同事类
		 AbstractDatabase es = new ElasticsearchDatabase(mediator);
		 AbstractDatabase mysql = new MysqlDatabase(mediator);
		 AbstractDatabase redis = new RedisDatabase(mediator);
		 
		 // 3. 添加数据，并同步
		 es.add("哈哈");
		 mysql.add("毛毛球");
		 redis.add("哦");
	}

}
