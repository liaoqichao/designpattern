package designpattrn.creation.builder;

public class Product {

	private String part1;
	
	private int part2;

	public String getPart1() {
		return part1;
	}

	public void setPart1(String part1) {
		this.part1 = part1;
	}

	public int getPart2() {
		return part2;
	}

	public void setPart2(int part2) {
		this.part2 = part2;
	}

	@Override
	public String toString() {
		return part1;
	}
	
}
