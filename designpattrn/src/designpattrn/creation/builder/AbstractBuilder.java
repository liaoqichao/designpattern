package designpattrn.creation.builder;

public abstract class AbstractBuilder implements Builder {

	protected String param1;
	protected int param2;
	
	public String getParam1() {
		return param1;
	}
	public void setParam1(String param1) {
		this.param1 = param1;
	}
	public int getParam2() {
		return param2;
	}
	public void setParam2(int param2) {
		this.param2 = param2;
	}
	
}
