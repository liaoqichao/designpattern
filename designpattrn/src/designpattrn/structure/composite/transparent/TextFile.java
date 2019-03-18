package designpattrn.structure.composite.transparent;

public class TextFile extends AbstractFile {

	public TextFile(String name) {
		super(name);
	}

	@Override
	public void addFile(AbstractFile file) {
		throw new RuntimeException("文件无此操作");
	}

	@Override
	public AbstractFile getChild(int i) {
		throw new RuntimeException("文件无此操作");
	}

	@Override
	public void removeFile(int i) {
		throw new RuntimeException("文件无此操作");
	}

	@Override
	public void killVirus() {
		System.out.println("----对文本文件'" + name + "'进行杀毒");
	}

}
