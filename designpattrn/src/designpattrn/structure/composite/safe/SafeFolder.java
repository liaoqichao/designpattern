package designpattrn.structure.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class SafeFolder extends SafeAbstractFile {

	private List<SafeAbstractFile> subFile = new ArrayList<SafeAbstractFile>();
	
	public SafeFolder(String name) {
		super(name);
	}

	public void addFile(SafeAbstractFile file) {
		subFile.add(file);
	}

	public SafeAbstractFile getChild(int i) {
		return subFile.get(i);
	}

	public void removeFile(int i) {
		subFile.remove(i);
	}

	@Override
	public void killVirus() {
		
		System.out.println("****对文件夹'" + name + "'进行杀毒");
		
		for (SafeAbstractFile safeAbstractFile : subFile) {
			safeAbstractFile.killVirus();
		}
	}

}
