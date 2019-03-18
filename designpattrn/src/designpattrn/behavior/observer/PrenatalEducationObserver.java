package designpattrn.behavior.observer;

/**
 * 胎教观察者
 */
public class PrenatalEducationObserver extends AbstractObserver {

	
	@Override
	public void update(Subject subject) { // 修改状态
		String oldState = this.observerState;
		if(subject.getMoon() < 3){ 
			this.observerState = AbstractObserver.PREPARE;
		} else if(subject.getMoon() >= 3){ 
			this.observerState = AbstractObserver.WORK;
		}
		
		// 判断状态是否改变
		if(!this.observerState.equals(oldState)){ 
			prenatalEducation(); // 具体事务
		}
	}
	
	private void prenatalEducation(){ 
		if(AbstractObserver.PREPARE.equals(this.observerState)){ 
			System.out.println("学习胎教知识...");
		} else if(AbstractObserver.WORK.equals(this.observerState)){ 
			System.out.println("开始胎教...");
		}
	}

}
