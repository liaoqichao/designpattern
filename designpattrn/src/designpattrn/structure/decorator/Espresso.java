package designpattrn.structure.decorator;

/**
 * 咖啡
 */
public class Espresso extends Beverage {

	public Espresso() {
		super();
		this.description = "蒸馏咖啡";
	}

	@Override
	public double getCost() {
		return 26.5;
	}

}
