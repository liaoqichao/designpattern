package designpattrn.structure.proxy;

public class ProxySubject implements Subject {

	private Subject real;
	
	@Override
	public void sayHi() {
		this.getReal().sayHi();
	}

	@Override
	public void sayBye() {
		this.getReal().sayBye();
	}
	
	private Subject getReal(){  // 代理实现懒加载
		if(real == null){ 
			real = new RealSubject();
		}
		return real;
	}

}
