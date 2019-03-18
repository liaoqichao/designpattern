package designpattrn.structure.bridge;

public class Rifle extends Gun {

	public Rifle(String name) {
		super(name);
	}
	
	public Rifle(String name, Aim sniperScope) {
		super(name, sniperScope);
	}

	@Override
	public void shoot() {
		if(sniperScope != null){ 
			sniperScope.aim();
		}
		System.out.println(this.name+"：哒哒哒...");
	}

}
