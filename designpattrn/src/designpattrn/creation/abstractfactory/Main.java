package designpattrn.creation.abstractfactory;

import designpattrn.creation.factorymethod.Car;

public class Main {

	public static void main(String[] args) {
		CarEngineer e = new CarEngineer();
		Car car = e.mackCar("Benz");
		car.run(); 
		// 不存在奔驰用的是宝马的发动机或者宝马的变速箱，要么全奔驰，要么全宝马
	}
	
}
