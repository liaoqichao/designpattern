package designpattrn.creation.factorymethod;

public abstract class AbstractCarMethodFactory {

	protected String brand;
	
	protected String type;
	
	abstract public Car create();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
