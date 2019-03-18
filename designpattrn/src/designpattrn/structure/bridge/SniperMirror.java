package designpattrn.structure.bridge;

public abstract class SniperMirror implements Aim {

	protected String name;

	public SniperMirror(String name) {
		super();
		this.name = name;
	}

}
