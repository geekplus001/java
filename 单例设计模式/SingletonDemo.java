/**单例设计模式：保证一个类仅有一个实例，并提供一个访问它的全局变量
    1、构造方法私有化2、声明一个本类对象3、给外部提供一个静态方法获取对象实例		
    实现方式：饿汉式  懒汉式
*/

public class SingletonDemo
{
	public static void main(String[] args)
	{
		Singleton1 s = Singleton1.getInstance();
		s.print();
		Singleton1 s1 = Singleton1.getInstance();
		System.out.println(s==s1);
		
		Singleton2 s2 = Singleton2.getInstance();
		s2.print();
	}
}

//把该类设计成单例设计模式  饿汉式

class Singleton1
{
	private static Singleton1 s = new Singleton1();
	private Singleton1(){}
	
	public static Singleton1 getInstance()
	{
		return s;
	}
	
	public void print()
	{
		System.out.println("饿汉式-单例设计模式");
	}
}

//把该类设计成单例设计模式  懒汉式（多线程访问时会有安全问题）

class Singleton2
{
	private static Singleton2 s = null;
	private Singleton2(){}
	
	public static Singleton2 getInstance()
	{
		if(s==null)
		{
			s = new Singleton2();
		}
		return s;
	}
	
	public void print()
	{
		System.out.println("懒汉式-单例设计模式");
	}
}