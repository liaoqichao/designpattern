package designpattrn.structure.decorator;

/**
 * 抽象调料类
 */
public abstract class CondimentDecorator extends Beverage {

	protected Beverage beverage;
	
	public CondimentDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		/*
		 *  买的是饮料不是调料， 描述应该为饮料，或者饮料加调料。
		 */
		return this.beverage.getDescription();
	}
	
	

}
