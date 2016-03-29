//可变参数与foreach （JDK1.5新特性）    
//一个方法中只能出现一个可变参数    且可变参数必须在最后一个

public class VarParamDemo
{
	public static void main(String[] args)
	{
		String[] names = {"梦梦","纯纯","萌萌","爱爱","凤凤"};
		method1(names);
		method2("梦梦","纯纯","萌萌","爱爱");
	}

	public static void method3(int num,String ... names)
	{
		
	}

	public static void method2(String ... names)
	{
		for(String name:names)
		{
			System.out.println(name+" ");
		}
	}	

	public static void method1(String[] names)
	{
		for(String name:names)
		{
			System.out.println(name+" ");
		}
	}
}