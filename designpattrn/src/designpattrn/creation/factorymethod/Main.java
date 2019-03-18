package designpattrn.creation.factorymethod;

public class Main {

	public static void main(String[] args) {
		simpleFactory(); // 简单工厂模式
		factoryMethod(); // 工厂方法模式
	}

	private static void factoryMethod() {
		AbstractCarMethodFactory factory = new PorscheCarFactory();
		factory.setType("SUV");
		Car macan = factory.create();
		macan.run();
		
		factory.setType("sport car");
		Car _911 = factory.create();
		_911.run();
	}

	private static void simpleFactory() {
		CarSimpleFactory factory = new CarSimpleFactory();
		Car audiCar = factory.create(CarSimpleFactory.AUDI);
		audiCar.run();
	}

}
