package designpattrn.structure.decorator;

/**
 * 抽象饮料类
 */
public abstract class Beverage {

	protected String description;

	public Beverage() {
		super();
	}
	
	public String getDescription(){ 
		return this.description;
	}
	
	public abstract double getCost();
}
