package designpattrn.structure.decorator;
/**
 * 咖啡
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		super();
		this.description = "焦炒（深色）咖啡 ";
	}

	@Override
	public double getCost() {
		return 22.5;
	}

}
