package designpattrn.structure.decorator;

/**
 * 具体装饰器，调料：奶泡
 */
public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		super(beverage);
		this.description = "奶泡";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 4.5;
	}

}
