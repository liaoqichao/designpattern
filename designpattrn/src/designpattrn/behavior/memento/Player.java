package designpattrn.behavior.memento;

/**
 * 发起人
 */
public class Player {
	/**
	 *  发起人的状态
	 */
	private int money; 

	public Player(int money) {
		super();
		this.money = money;
	}

	/**
	 * 私有备忘录
	 */
	private class Memento implements IMemento{

		private Memento() {
			super();
		}
		
		private Memento(int money) {
			super();
			this.money = money;
		}

		private int money;

		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
		
	}
	
	public IMemento createMemento(){ 
		Memento memento = new Memento();
		memento.setMoney(money);
		System.out.println("备份，现在有："+this.money+"金币");
		return (IMemento)memento;
	}
	
	public void restoreMemento(IMemento memento){ 
		Memento m = (Memento)memento;
		this.money = m.getMoney();
		System.out.println("还原，现在有："+this.money+"金币");
	}
	
	/**
	 * 修改状态的方法
	 */
	public int bet(){  
		int positive = Math.random() > 0.3 ? -1 : 1;
		int rand = (int)(Math.random() * 100);
		int gain = positive * rand;
		money = money > gain ? money + gain : 0;
		if(gain > 0){ 
			System.out.println("赢了"+gain+"金币，当前金币为"+money);
		} else { 
			System.out.println("输了"+gain+"金币，当前金币为"+money);
		}
		return gain;
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
