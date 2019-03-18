package designpattrn.creation.abstractfactory;

public class BMWAbstractFactory implements AbstractFactory {

	@Override
	public CarEngine createEngine() {
		return new BMWCarEngine();
	}

	@Override
	public CarGearbox createCarGearbox() {
		return new BMWCarGearbox();
	}

}
