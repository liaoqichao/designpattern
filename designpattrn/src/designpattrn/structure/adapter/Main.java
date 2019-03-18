package designpattrn.structure.adapter;

public class Main {

	public static void main(String[] args) {
//		classAdapter();
//		objectAdapter();
		defaultAdapter();
	}

	public static void defaultAdapter() {
		DWheel jose = new JoseDWheelAdapter("何塞");
		jose.rush();
	}

	public static void objectAdapter() {
		DWheel jose = new ObjectDWheelAdapter("何塞");
		jose.rush();
	}

	public static void classAdapter() {
		DWheel jose = new ClassDWheelAdapter("何塞");
		jose.rush();
	}

}
