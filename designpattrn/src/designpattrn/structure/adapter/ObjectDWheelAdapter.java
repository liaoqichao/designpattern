package designpattrn.structure.adapter;

public class ObjectDWheelAdapter implements DWheel {

	private Duelist duelist;
	
	public ObjectDWheelAdapter(String name) {
		duelist = new Duelist(name);
	}

	@Override
	public void rush() {
		System.out.println(duelist.name+"选手冲到了跑道！");
	}

}
