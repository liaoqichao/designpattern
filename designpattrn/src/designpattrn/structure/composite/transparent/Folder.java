package designpattrn.structure.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile {

	private List<AbstractFile> subFile = new ArrayList<AbstractFile>();
	
	public Folder(String name) {
		super(name);
	}

	@Override
	public void addFile(AbstractFile file) {
		subFile.add(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		return subFile.get(i);
	}

	@Override
	public void removeFile(int i) {
		subFile.remove(i);
	}

	@Override
	public void killVirus() {
		
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		
		for (AbstractFile abstractFile : subFile) {
			abstractFile.killVirus();
		}
	}

}
