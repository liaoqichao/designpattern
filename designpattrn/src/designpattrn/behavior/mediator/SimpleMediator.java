package designpattrn.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单中介者
 */
public class SimpleMediator {

	private static SimpleMediator mediator;
	
	private Map<String, AbstractSimpleDatabase> map = new HashMap<String, AbstractSimpleDatabase>();
	
	private SimpleMediator() {
		super();
	}

	public static SimpleMediator getMediator() {
		if(mediator == null){ 
			mediator = new SimpleMediator();
		}
		return mediator;
	}
	
	// 绑定同事类
	public void regist(String name, AbstractSimpleDatabase database){ 
		map.put(name, database);
	}
	
	// 表示同事关联关系的方法
	public void addData(String database, String data){
		if(AbstractDatabase.ELASTICSEARCH.equals(database)){ 
			syncMysql(database, data);
			syncRedis(database, data);
		} else if(AbstractDatabase.MYSQL.equals(database)){
			syncEs(database, data);
			syncRedis(database, data);
		} else if(AbstractDatabase.REDIS.equals(database)){ 
			// 不同步
		}
	}
	
	private void syncMysql(String database, String data){ 
//		map.get(database).dosomething...
		System.out.println(database+"同步到mysql："+data);
	}
	
	private void syncEs(String database, String data){ 
//		map.get(database).dosomething...
		System.out.println(database+"同步到elasticsearch："+data);
	}
	
	private void syncRedis(String database, String data){ 
//		map.get(database).dosomething...
		System.out.println(database+"同步到redis："+data);
	}
	
}
