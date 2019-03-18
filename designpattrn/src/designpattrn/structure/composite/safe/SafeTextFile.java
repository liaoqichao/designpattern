package designpattrn.structure.composite.safe;

public class SafeTextFile extends SafeAbstractFile {

	public SafeTextFile(String name) {
		super(name);
	}

	@Override
	public void killVirus() {
		System.out.println("----对文本文件'" + name + "'进行杀毒");
	}

}
