package designpattrn.structure.decorator;

/**
 * 具体装饰器，调料：牛奶
 */
public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
		this.description = "牛奶";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 3.5;
	}

}
