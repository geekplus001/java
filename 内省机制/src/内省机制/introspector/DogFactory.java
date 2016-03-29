package 内省机制.introspector;

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
	//属性文件操作工具类
	private static Properties config = new Properties();
	
	static 
	{
		//读取属性文件
		InputStream inStream = Thread.currentThread().getContextClassLoader().
				getResourceAsStream("bean.properties");
		//加载属性文件
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
		//从Properties对象中根据key获取value
		String className = config.getProperty(name);
		try {
			//根据类全名获取类信息对象
			Class dogClass = Class.forName(className);
			//实例化对象
			Dog dog = (Dog)dogClass.newInstance();
			//内省:得到bean信息
			BeanInfo beanInfo  = Introspector.getBeanInfo(dogClass);
			//通过bean信息获取所有属性描述器（数组）
			PropertyDescriptor [] pds = beanInfo.getPropertyDescriptors();
			
			for(int i=0;i<pds.length;i++)
			{
				if("name".equals(pds[i].getName()))
				{
					String nameValue = config.getProperty("dog.name");
					//通过属性描述器获取改属性的写操作方法（set）
					Method method = pds[i].getWriteMethod();
					//在dog对象上调用方法
					method.invoke(dog, nameValue);
				}
				else if("age".equals(pds[i].getName()))
				{
					String ageValue = config.getProperty("dog.age");
					//通过属性描述器获取改属性的写操作方法（set）
					Method method = pds[i].getWriteMethod();
					//在dog对象上调用方法
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
