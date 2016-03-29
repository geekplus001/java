//值传递和引用传递

public class ValueDemo
{
	public static void main(String[] args)
	{
		int x = 10;
		method(x);
		System.out.println("x="+x);

		Cat c = new Cat();
		method2(c);
		System.out.println("Cat age="+c.age);

		String name = "小白";
		method3(name);
		System.out.println("name="+name);

		Cat2 c2 = new Cat2();
		method4(c2);
		System.out.println("Cat names="+c2.names);
	}

	public static void method(int mx)
	{
		mx = 20;
	}

	public static void method2(Cat cat)
	{
		cat.age = 5;
	}

	public static void method3(String sname)
	{
		sname = "小红";
	}

	public static void method4(Cat2 cat2)
	{
		cat2.names = "小黑";
	}
}

class Cat
{
	int age = 2;//省略封装
}

class Cat2
{
	String names = "小白";//省略封装
}