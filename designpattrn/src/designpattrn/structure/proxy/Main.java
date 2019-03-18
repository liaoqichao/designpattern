package designpattrn.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		staticProxy();
		dynamicProxy();
	}

	public static void staticProxy() {
		Subject proxy = new ProxySubject();
		System.out.println("代理类："+proxy.getClass());
		proxy.sayHi();
		proxy.sayBye();
	}

	public static void dynamicProxy() {
		Subject proxy = (Subject)Proxy.newProxyInstance(Main.class.getClassLoader(), RealSubject.class.getInterfaces(), new InvocationHandler() {
			
			private Subject real; // targetObject
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object ret = null;
				try{ 
					System.out.println("before");
					if(real == null){ 
						real = new RealSubject();
					}
					ret = method.invoke(real, args);
					System.out.println("after");
				} catch(Exception e){ 
					System.out.println("exception");
				} finally{ 
					System.out.println("finally");
				}
				return ret;
			}
		});
		System.out.println("代理类："+proxy.getClass());
		proxy.sayHi();
	}

}
