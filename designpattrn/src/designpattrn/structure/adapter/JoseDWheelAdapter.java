package designpattrn.structure.adapter;

public class JoseDWheelAdapter extends DefaultDWheelApdater {

	private Duelist duelist;
	
	public JoseDWheelAdapter(String name) {
		super();
		duelist = new Duelist(name);
	}

	@Override
	public void rush() {
		System.out.println(duelist.name+"选手冲到了跑道！");
	}

	
}
