package designpattrn.creation.builder;

public class ConcreteBuilder extends AbstractBuilder {

	private String part1;  
	
	private int part2; 
	
	@Override
	public void buildPart1() {
		part1 = (part2 & 1) == 1 ? ("是的，" + param1) : (param1 + "吗？");
		 
	}

	@Override
	public void buildPart2() {
		part2 = super.param2;
	}

	@Override
	public Product build() {
		Product product = new Product();
		product.setPart1(part1);
		product.setPart2(part2);
		return product;
	}

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
