package designpattrn.creation.factorymethod;

public abstract class AbstractCar implements Car {

	protected String type = "sport car";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
