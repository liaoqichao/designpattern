package designpattrn.structure.decorator;

/**
 * 具体装饰器，调料：酱油
 */
public class Soy extends CondimentDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
		this.description = "酱油";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 2.5;
	}

}
