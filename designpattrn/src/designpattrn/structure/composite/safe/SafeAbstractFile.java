package designpattrn.structure.composite.safe;

public abstract class SafeAbstractFile {

	protected String name;
	
	public SafeAbstractFile(String name) {
		super();
		this.name = name;
	}
	
	public abstract void killVirus();
}
