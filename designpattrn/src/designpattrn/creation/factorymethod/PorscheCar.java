package designpattrn.creation.factorymethod;

public class PorscheCar extends AbstractCar {

	@Override
	public void run() {
		System.out.println("我开着保时捷的"+this.type);
	}

}
