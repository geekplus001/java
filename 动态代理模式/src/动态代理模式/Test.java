package ��̬����ģʽ;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) 
	{
		Person p = new Person("С��");
		DynaProxy dynaProxy = new DynaProxy(p);
		
		//Proxy�ṩ���ڴ�����̬�������ʵ����̬������
		//����������Щ�������������ж�̬������ĳ���
		//��̬���ɴ������(������������������нӿڣ�InvocationHandler)
		Subject s = (Subject)Proxy.newProxyInstance(p.getClass(). getClassLoader(),p.getClass().getInterfaces(),dynaProxy );
		s.miai();
		
	}

}
