package designpattrn.structure.decorator;
/**
 * 咖啡
 */
public class Decaf extends Beverage {

	public Decaf() {
		super();
		this.description = "无咖啡因咖啡";
	}

	@Override
	public double getCost() {
		return 24;
	}

}
