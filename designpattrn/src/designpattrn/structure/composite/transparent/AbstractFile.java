package designpattrn.structure.composite.transparent;

public abstract class AbstractFile {

	protected String name;
	
	public AbstractFile(String name) {
		super();
		this.name = name;
	}

	public abstract void addFile(AbstractFile file);
	
	public abstract AbstractFile getChild(int i);
	
	public abstract void removeFile(int i);
	
	public abstract void killVirus();
}
