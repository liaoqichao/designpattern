package designpattrn.creation.builder;

public interface Builder {

	void buildPart1();
	
	void buildPart2();
	
	Product build();
}
