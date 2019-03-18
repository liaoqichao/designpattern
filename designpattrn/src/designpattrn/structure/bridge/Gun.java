package designpattrn.structure.bridge;

public abstract class Gun {

	protected String name;
	
	protected Aim sniperScope; // 狙击镜
	
	
	public Gun(String name) {
		super();
		this.name = name;
	}
	
	public Gun(String name, Aim sniperScope) {
		super();
		this.name = name;
		this.sniperScope = sniperScope;
	}

	/**
	 * 开枪 
	 */
	abstract public void shoot();

	public Aim getSniperScope() {
		return sniperScope;
	}

	public void setSniperScope(Aim sniperScope) {
		this.sniperScope = sniperScope;
	}

}
