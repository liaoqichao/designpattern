package designpattrn.creation.builder;

public class Director {

	private Builder builder;

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void construct(){ 
		if(builder != null){
			builder.buildPart2();
			builder.buildPart1();
			
		}
	}
}
