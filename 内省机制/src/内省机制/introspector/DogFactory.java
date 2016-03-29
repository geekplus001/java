package ��ʡ����.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class DogFactory 
{
	//�����ļ�����������
	private static Properties config = new Properties();
	
	static 
	{
		//��ȡ�����ļ�
		InputStream inStream = Thread.currentThread().getContextClassLoader().
				getResourceAsStream("bean.properties");
		//���������ļ�
		try {
			config.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Dog getDog(String name) throws IntrospectionException
	{
//		if("dog".equals(name))
//		{
//			return new Dog();
//		}
		//��Properties�����и���key��ȡvalue
		String className = config.getProperty(name);
		try {
			//������ȫ����ȡ����Ϣ����
			Class dogClass = Class.forName(className);
			//ʵ��������
			Dog dog = (Dog)dogClass.newInstance();
			//��ʡ:�õ�bean��Ϣ
			BeanInfo beanInfo  = Introspector.getBeanInfo(dogClass);
			//ͨ��bean��Ϣ��ȡ�������������������飩
			PropertyDescriptor [] pds = beanInfo.getPropertyDescriptors();
			
			for(int i=0;i<pds.length;i++)
			{
				if("name".equals(pds[i].getName()))
				{
					String nameValue = config.getProperty("dog.name");
					//ͨ��������������ȡ�����Ե�д����������set��
					Method method = pds[i].getWriteMethod();
					//��dog�����ϵ��÷���
					method.invoke(dog, nameValue);
				}
				else if("age".equals(pds[i].getName()))
				{
					String ageValue = config.getProperty("dog.age");
					//ͨ��������������ȡ�����Ե�д����������set��
					Method method = pds[i].getWriteMethod();
					//��dog�����ϵ��÷���
					method.invoke(dog, Integer.parseInt(ageValue));
				}
			
			}
			return dog;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
