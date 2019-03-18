package designpattrn.creation.abstractfactory;

public class BenzAbstractFactory implements AbstractFactory {

	@Override
	public CarEngine createEngine() {
		return new BenzCarEngine();
	}

	@Override
	public CarGearbox createCarGearbox() {
		return new BenzCarGearbox();
	}

}
