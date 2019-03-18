package designpattrn.creation.factorymethod;

public class PorscheCarFactory extends AbstractCarMethodFactory {

	protected final String brand = "Porsche";
	
	@Override
	public Car create() {
		AbstractCar car = new PorscheCar();
		car.setType(this.type);
		return car;
	}

}
