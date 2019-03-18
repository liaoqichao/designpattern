package designpattrn.structure.bridge;

public class SniperRifle extends Gun {

	public SniperRifle(String name) {
		super(name);
	}

	public SniperRifle(String name, Aim sniperScope) {
		super(name, sniperScope);
	}

	@Override
	public void shoot() {
		if(sniperScope != null) { 
			sniperScope.aim();
		}
		System.out.println(this.name+"：biubiubiu...");
	}

}
