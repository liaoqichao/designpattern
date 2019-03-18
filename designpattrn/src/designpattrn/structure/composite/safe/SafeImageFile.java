package designpattrn.structure.composite.safe;

public class SafeImageFile extends SafeAbstractFile {

	public SafeImageFile(String name) {
		super(name);
	}

	@Override
	public void killVirus() {
		System.out.println("----对图像文件'" + name + "'进行杀毒");
	}

}
