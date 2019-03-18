package designpattrn.creation.abstractfactory;

public interface AbstractFactory {

	public CarEngine createEngine();
	
	public CarGearbox createCarGearbox();
	
}
