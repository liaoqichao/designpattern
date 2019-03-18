package designpattrn.behavior.memento;

public class Main {

	public static void main(String[] args) {
//		blackMemento(); // 黑箱的备忘录模式，多重检查点
		historyOnSelf(); // 自述历史模式
	}

	/**
	 * Memento备忘录设计模式是一个保存另外一个对象内部状态拷贝的对象,这样以后就可以将该对象恢复到以前保存的状态。
	 * 本文中的场景: 有一款游戏可以随时存档, 存档完成后就可以读取档案里的数据, 然后下次开机就可以从那个时间点继续玩游戏了.
     * 有一个小孩通过存档的机制发现了一个窍门: 他每玩一会儿游戏, 就看看他在游戏中是挣钱了还是亏本了
     * 如果挣钱了那就赶紧存档; 如果赔钱了, 那就赶紧关机, 从上一个存档重新开始.
     * 这样, 这个小孩就做到了只赚不赔,哈哈哈, 接下来看看这个备忘录模式吧.
	 * 
	 */
	public static void blackMemento() {
		int base = 500;
		Player p = new Player(base);
		Caretaker caretaker = new Caretaker();
		// 初始备份
		IMemento initMemento = p.createMemento();
		// 接管
		caretaker.save(initMemento);
		for(int i = 0; i < 10; i++){
			int gain = p.bet();
			if(gain > 0){  // 赢了备份
				IMemento m = p.createMemento();
				caretaker.save(m);
			} else { // 输了还原
				IMemento m = caretaker.retrieve(); 
				p.restoreMemento(m);
			}
		}
	}
	
	public static void historyOnSelf() {
		int base = 500;
		Player p = new Player(base);
		// 初始备份
		IMemento m = p.createMemento();
		for(int i = 0; i < 10; i++){
			int gain = p.bet();
			if(gain > 0){  // 赢了备份
				// 这里Main充当负责人，如果备忘录也可以存在发起人Player里面，多个还原点就用list来存
				m = p.createMemento(); 
			} else { // 输了还原
				p.restoreMemento(m);
			}
		}
	}

}
