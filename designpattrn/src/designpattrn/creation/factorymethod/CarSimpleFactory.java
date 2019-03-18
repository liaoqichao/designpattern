package designpattrn.creation.factorymethod;

public class CarSimpleFactory {

	public static final int BENZ = 1;
	public static final int BMW = 2;
	public static final int AUDI = 3;
	
	public Car create(int brand){
		if(brand == CarSimpleFactory.BENZ){
			return new BenzCar();
		} else if(brand == CarSimpleFactory.BMW){
			return new BMWCar();
		} else if(brand == CarSimpleFactory.AUDI){
			return new AudiCar();
		}
		return null;
	}
}
