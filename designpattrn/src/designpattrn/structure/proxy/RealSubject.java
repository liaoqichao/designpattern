package designpattrn.structure.proxy;

public class RealSubject implements Subject {

	@Override
	public void sayHi() {
		System.out.println("hi ~");
	}

	@Override
	public void sayBye() {
		System.out.println("bye ~");
	}

	
}
