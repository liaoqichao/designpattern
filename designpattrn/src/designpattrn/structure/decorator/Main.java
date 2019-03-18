package designpattrn.structure.decorator;

public class Main {

	// head first 设计模式，装饰者模式星巴克案例
	public static void main(String[] args) {
		// 蒸馏咖啡 + 2份牛奶 + 1份奶泡
		Beverage espresso = new Whip(new Milk(new Milk(new Espresso())));
		System.out.println("一杯" + espresso.getDescription() + "一共" + espresso.getCost() + "元");
	
		// 混合咖啡 + 1份抹茶 + 1份酱油 +1份奶泡
		Beverage houseBlend = new Whip(new Soy(new Mocha(new HouseBlend())));
		System.out.println("一杯" + houseBlend.getDescription() + "一共" + houseBlend.getCost() + "元");
	
		// 不能只要调料，因为调料没有无参构造函数
	}

}
