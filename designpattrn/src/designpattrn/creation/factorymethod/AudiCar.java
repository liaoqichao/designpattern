package designpattrn.creation.factorymethod;

public class AudiCar implements Car {

	@Override
	public void run() {
		System.out.println("我又换灯了");
	}

}
