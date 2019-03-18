package designpattrn.creation.builder;

public class SimplyProduct extends Product{

	private SimplyProduct(){
		
	}
	
	public static class SimplyProductBuilder extends AbstractBuilder {

		private String part1;
		
		private int part2;
		
		@Override
		public void buildPart1() {
			part1 = (part2 & 1) == 1 ? ("是的，" + param1) : (param1 + "吗？");			
		}

		@Override
		public void buildPart2() {
			part2 = param2;
		}

		private void construct(){
			buildPart2(); // 构造部件, 先后执行顺序有影响
			buildPart1(); 
		}
		
		
		@Override
		public Product build() {
			SimplyProduct simplyProduct = new SimplyProduct();
			// 执行剧本
			construct();
			// 设置部件
			simplyProduct.setPart1(this.part1);
			simplyProduct.setPart2(this.part2);
			return simplyProduct;
		}
		
	}
}
