package designpattrn.structure.composite;

import designpattrn.structure.composite.safe.SafeAbstractFile;
import designpattrn.structure.composite.safe.SafeFolder;
import designpattrn.structure.composite.safe.SafeImageFile;
import designpattrn.structure.composite.safe.SafeTextFile;
import designpattrn.structure.composite.transparent.AbstractFile;
import designpattrn.structure.composite.transparent.Folder;
import designpattrn.structure.composite.transparent.ImageFile;
import designpattrn.structure.composite.transparent.TextFile;

public class Main {

	public static void main(String[] args) {
//		transparentComposite();
		safeComposite();
	}

	public static void transparentComposite() {
		
		/*
		 *  file1,file2,...都有addChild(),remove().getChild()方法，
		 *  违背了接口隔离原则
		 */
		
		AbstractFile root = new Folder("E盘");
		AbstractFile folder1 = new Folder("Java");
		AbstractFile folder2 = new Folder("C++");
		AbstractFile folder3 = new Folder("img");
		
		AbstractFile file1 = new TextFile("Hello.java");
		AbstractFile file2 = new TextFile("IfElse.java");
		
		AbstractFile file3 = new TextFile("Hello.cpp");
		AbstractFile file4 = new TextFile("Hello.h");
		AbstractFile file5 = new ImageFile("类加载过程.img");
		
		folder3.addFile(file5);
		folder2.addFile(file3);
		folder2.addFile(file4);
		folder1.addFile(file1);
		folder1.addFile(file2);
		folder1.addFile(folder3);
		
		root.addFile(folder1);
		root.addFile(folder2);
		root.addFile(folder3);
		
		root.killVirus();
	}
	
	public static void safeComposite() {
		/*
		 *  文件夹不能使用SafeAbstractFile引用，只能使用SafeFolder引用。
		 *  客户端调用不透明，不能统一使用SafeAbstractFile。
		 */
		SafeFolder root = new SafeFolder("E盘");
		SafeFolder folder1 = new SafeFolder("Java");
		SafeFolder folder2 = new SafeFolder("C++");
		SafeFolder folder3 = new SafeFolder("img");
		
		SafeAbstractFile file1 = new SafeTextFile("Hello.java");
		SafeAbstractFile file2 = new SafeTextFile("IfElse.java");
		
		SafeAbstractFile file3 = new SafeTextFile("Hello.cpp");
		SafeAbstractFile file4 = new SafeTextFile("Hello.h");
		SafeAbstractFile file5 = new SafeImageFile("类加载过程.img");
		
		folder3.addFile(file5);
		folder2.addFile(file3);
		folder2.addFile(file4);
		folder1.addFile(file1);
		folder1.addFile(file2);
		folder1.addFile(folder3);
		
		root.addFile(folder1);
		root.addFile(folder2);
		root.addFile(folder3);
		
		root.killVirus();
	}

}
