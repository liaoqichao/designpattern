package designpattrn.behavior.visitor.dispatch;

/**
 * 墨子
 */
public class Mozi {

	public void staticRide(Horse h){ 
		System.out.println("墨子在骑马");
	}
	public void staticRide(WhiteHorse wh){ 
		System.out.println("墨子在骑白马");
	}
	public void staticRide(BlackHorse bh){ 
		System.out.println("墨子在骑黑马");
	}
	
	public void dynamicRide(Horse h){ 
		System.out.println("墨子在骑"+h.getName());
	}
	public void dynamicRide(WhiteHorse wh){ 
		System.out.println("墨子在骑"+wh.getName());
	}
	public void dynamicRide(BlackHorse bh){ 
		System.out.println("墨子在骑"+bh.getName());
	}
}
