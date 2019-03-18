package designpattrn.structure.bridge;

public class OctaveSniperMirror extends SniperMirror {

	public OctaveSniperMirror(String name) {
		super(name);
	}

	@Override
	public void aim() {
		System.out.println(this.name+"装上，先调到3倍镜，再调到8倍镜，开始瞄准！");
	}

}
