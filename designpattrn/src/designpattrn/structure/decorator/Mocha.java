package designpattrn.structure.decorator;

/**
 * 具体装饰器，调料：抹茶
 */
public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
		this.description = "抹茶";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 5;
	}

}
