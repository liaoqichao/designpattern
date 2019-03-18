package designpattrn.behavior.mediator;

public class SyncMediator extends AbstractMediator {

	@Override
	public void sync(String database, String data) {
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
		System.out.println(database+"同步到mysql："+data);
	}
	
	private void syncEs(String database, String data){ 
		System.out.println(database+"同步到elasticsearch："+data);
	}
	
	private void syncRedis(String database, String data){ 
		System.out.println(database+"同步到redis："+data);
	}

}
