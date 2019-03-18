package designpattrn.structure.bridge;

public class TripleSniperMirror extends SniperMirror{

	public TripleSniperMirror(String name) {
		super(name);
	}

	@Override
	public void aim() {
		System.out.println(this.name+"装上，开始瞄准！");
	}

}
