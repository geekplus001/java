package 动态代理模式;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) 
	{
		Person p = new Person("小白");
		DynaProxy dynaProxy = new DynaProxy(p);
		
		//Proxy提供用于创建动态代理类的实例动态方法，
		//他还是有这些方法创建的所有动态代理类的超类
		//动态生成代理对象(类加载器，被代理所有接口，InvocationHandler)
		Subject s = (Subject)Proxy.newProxyInstance(p.getClass(). getClassLoader(),p.getClass().getInterfaces(),dynaProxy );
		s.miai();
		
	}

}
