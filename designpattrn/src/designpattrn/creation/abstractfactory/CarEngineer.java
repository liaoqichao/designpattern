package designpattrn.creation.abstractfactory;

import designpattrn.creation.factorymethod.BMWCar;
import designpattrn.creation.factorymethod.BenzCar;
import designpattrn.creation.factorymethod.Car;

public class CarEngineer {
	
	public Car mackCar(String brand){
		if("Benz".equalsIgnoreCase(brand)){
			AbstractFactory factory = new BenzAbstractFactory();
			factory.createEngine();
			factory.createCarGearbox();
			// 组装
			return new BenzCar();
		} else if("BMW".equalsIgnoreCase(brand)){
			AbstractFactory factory = new BMWAbstractFactory();
			factory.createEngine();
			factory.createCarGearbox();
			// 组装
			return new BMWCar();
		}
		return null;
	}
}
