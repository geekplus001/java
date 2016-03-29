/*
jdk1.5新特性：包装类
1、包装类的赋值方式
（1）使用new关键字创建对象
（2）直接给包装类赋值
*/

public class WrapperClassDemo
{
	public static void main(String[] args)
	{
		Long x1 = new Long(100);//创建包装类对象

		long x2 = 100L;
		Long x3 = 100L;//直接给包装类赋值(自动装箱)
		long x4 = x3;//对象赋值给基本数据类型（自动拆箱）
		long x5 = x3.longValue();//手动拆箱

		//字符串转基本数据类型：字符串必须为数字型字符串
		String s1 = "12345";
		//把一个字符串转换为int基本数据类型
		int x6 = Integer.parseInt(s1);
		System.out.println(x6);

		Integer x7 = Integer.valueOf(s1);
		System.out.println("x7="+x7);

		System.out.println("-------------------------");
		Integer x8 = new Integer(10);
		Integer x9 = new Integer(10);

		//Integer直接赋值时，当值为1个字节内的数时，
		//将使用同一个对象
		//Byte Short Long Integer(享元设计模式)缓存
		Integer x10 = 10;
		Integer x11 = 10;
		System.out.println(x8==x9);
		System.out.println(x8==x10);
		System.out.println(x11==x10);
	}
}