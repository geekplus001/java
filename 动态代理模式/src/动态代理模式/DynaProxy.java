package ��̬����ģʽ;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * ��̬������
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
		obj = method.invoke(target, args);//��������
		after();
		return obj;
	}
	
	//����֮ǰҪ��������
	private void before()
	{
		System.out.println("Ϊ������ƥ�������ɾ���");
	}

		//���׺�Ҫ��������
	private void after()
	{
		System.out.println("�������׽�����");
	}

}
