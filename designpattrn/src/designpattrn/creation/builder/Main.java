package designpattrn.creation.builder;

import designpattrn.creation.builder.SimplyProduct.SimplyProductBuilder;

public class Main {

	public static void main(String[] args) {
//		builder(); // 建造者模式
//		simplyBuilder(); // 建造者模式简化形式
	}


	public static void builder() {
		// 创建builder，因为需要传入参数，所以多了一个抽象类
		AbstractBuilder builder = new ConcreteBuilder(); 
		// 传入参数
		int i = 0;
		builder.setParam1("你是傻瓜"); 
		builder.setParam2(i++);
		// 创建导演
		Director director = new Director();
		// 设置builder
		director.setBuilder(builder);
		// builder按照导演的剧本构建实体,不同的导演construct不同，有不同的剧本
		director.construct();
		// 生成产品对象
		Product product1 = builder.build();
		
		builder.setParam2(i++); // 设置不同的部件，生成不同对象
		director.construct();
		Product product2 = builder.build();
		
		builder.setParam1("你是笨蛋");
		builder.setParam2(i++);
		director.construct();
		Product product3 = builder.build();
		
		builder.setParam2(i++);
		director.construct();
		Product product4 = builder.build();
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		System.out.println(product3.toString());
		System.out.println(product4.toString());
	}
	
	public static void simplyBuilder() {
		SimplyProductBuilder builder = new SimplyProduct.SimplyProductBuilder();
		int i = 0;
		builder.setParam1("你是傻瓜");
		builder.setParam2(i++);
		Product simplyProduct1 = builder.build();
		builder.setParam2(i++);
		Product simplyProduct2 = builder.build();
		System.out.println(simplyProduct1);
		System.out.println(simplyProduct2);
	}

}
