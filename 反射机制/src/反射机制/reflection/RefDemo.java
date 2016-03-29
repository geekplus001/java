package 反射机制.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RefDemo
{

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Person p1 = new Person("小白",18,'男');
		Person p2 = new Person("小黑",19,'女');
		
		//一个Class对象代表一个字节码，相同类型的对象得到的字节码对象是同一个（类加载器只会加载一次）
		//创建Class对象的方式一：
		Class personClass1 = p1.getClass();
		Class personClass2 = p2.getClass();
		System.out.println(personClass1==personClass2);
		
		//创建Class对象的方式2：
		Class personClass3 = Person.class;
		System.out.println(personClass1==personClass3);
		//int.class
		//void.class
		
		//创建Class对象的方式3：
		Class personClass4 = Class.forName("反射机制.reflection.Person");
		System.out.println(personClass1==personClass4);
		
		System.out.println(personClass1);
		
		
		//-----------通过类信息实例化对象--------------
		//调用无参数构造方法
		try 
		{
			//若没有无参数构造方法，会报异常
			Person p3 = (Person)personClass4.newInstance();
			System.out.println(p3);
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//调用有参数构造方法
		Constructor [] cs = personClass4.getConstructors();//获取当前类的所有构造方法
		for(Constructor c:cs)
		{
			System.out.println(c.getName());
			Class [] paramTypes = c.getParameterTypes();
			for(Class class1:paramTypes)
			{
				System.out.println(class1);
			}
			System.out.println("------------------------");
		}
		
		Person p4=null;
		try 
		{
			Constructor c1 = personClass4.getConstructor(
					String.class,int.class,char.class);
		    p4 = (Person)c1.newInstance("小花",17,'女');
			System.out.println(p4);
		} 
		catch (NoSuchMethodException e) 
		{
			e.printStackTrace();
		} 
		catch (SecurityException e) 
		{
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//----------------获得类信息-------------
		System.out.println("包名："+personClass4.getPackage());
		System.out.println("类名："+personClass1.getName());
		//包括所有（继承、接口）公共的方法（public）
		Method [] m1 = personClass1.getMethods();
		for(int i=0;i<m1.length;i++)
		{
			Method m = m1[i];
			System.out.println("方法名："+m.getName());;
		}
		
		System.out.println("------------------------");
		Method [] m2 = personClass1.getDeclaredMethods();
		for(int i=0;i<m2.length;i++)
		{
			Method m = m2[i];
			System.out.println("私有方法名：     "+Modifier.toString(m.getModifiers())+"    "+m.getName());;
		}
		
		System.out.println("-----------获取属性信息------------");
		//公有属性
		Field [] f1 = personClass1.getFields();
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i].getName());
		}
		System.out.println("--------------------------");
		
		Field [] f2 = personClass1.getDeclaredFields();
		for(int i=0;i<f2.length;i++)
		{
			System.out.println(f2[i].getName());
		}
		
		System.out.println("---------------调用方法和属性--------------");
		System.out.println("--------------调用方法-------------");
		Method setNameMethod = personClass1.getMethod("setName", String.class);
		//调用方法
		setNameMethod.invoke(p4, "呵呵");//p4.setName("呵呵");
		System.out.println(p4);
		//调用私有方法
		Method sayMethod = personClass1.getDeclaredMethod("say");
		sayMethod.setAccessible(true);//忽略检查访问修饰符
		sayMethod.invoke(p4);
		
		
		
		System.out.println("-------------调用属性-------------");
		try {
			Field ageField = personClass1.getDeclaredField("age");
			ageField.setAccessible(true);
			System.out.println(ageField.get(p4));//p4 的age属性值获取
			ageField.set(p4, 18);//给p4对象的age属性赋值
			System.out.println(p4);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

}
