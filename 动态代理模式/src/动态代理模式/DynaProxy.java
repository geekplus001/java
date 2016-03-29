package 动态代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * 动态代理类
 */
public class DynaProxy implements InvocationHandler
{

	private Object target;
	public DynaProxy(Object target) 
	{
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable 
	{
		Object obj = null;
		before();
		obj = method.invoke(target, args);//真正调用
		after();
		return obj;
	}
	
	//相亲之前要做的事情
	private void before()
	{
		System.out.println("为代理人匹配如意郎君。");
	}

		//相亲后要做的事情
	private void after()
	{
		System.out.println("本次相亲结束。");
	}

}
