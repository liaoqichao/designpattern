package designpattrn.structure.adapter;

public class Duelist {

	protected String name;
	
	public Duelist(String name) {
		super();
		this.name = name;
	}

	public void duel() {
		System.out.println("决斗");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
