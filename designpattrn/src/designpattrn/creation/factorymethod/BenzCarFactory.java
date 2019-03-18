package designpattrn.creation.factorymethod;

public class BenzCarFactory extends AbstractCarMethodFactory {

	protected final String brand = "audi";
	
	@Override
	public Car create() {
		return new AudiCar();
	}

}
