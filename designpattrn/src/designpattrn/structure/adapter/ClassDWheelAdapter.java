package designpattrn.structure.adapter;

public class ClassDWheelAdapter extends Duelist implements DWheel {

	public ClassDWheelAdapter(String name) {
		super(name);
	}

	@Override
	public void rush() {
		System.out.println(this.name+"选手冲到了跑道！");
	}

}
