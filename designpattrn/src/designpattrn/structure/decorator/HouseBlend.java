package designpattrn.structure.decorator;
/**
 * 咖啡
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		super();
		this.description = "混合咖啡";
	}

	@Override
	public double getCost() {
		return 23;
	}

}
