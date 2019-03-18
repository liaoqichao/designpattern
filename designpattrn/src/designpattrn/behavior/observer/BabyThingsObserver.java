package designpattrn.behavior.observer;

public class BabyThingsObserver extends AbstractObserver {

	@Override
	public void update(Subject subject) {
		if(subject.getMoon() < 8){ 
			this.observerState = AbstractObserver.PREPARE;
		} else if(subject.getMoon() >= 8){ 
			this.observerState = AbstractObserver.WORK;
		}
		
		babyThings();
	}
	
	private void babyThings(){ 
		if(AbstractObserver.PREPARE.equals(this.observerState)){ 
			saveMoney();
		} else if(AbstractObserver.WORK.equals(this.observerState)){ 
			buy();
		} 
	}

	private void saveMoney() {
		System.out.println("存钱...");
	}

	private void buy(){ 
		System.out.println("买婴儿床、衣服、纸尿片...");
	}

}
