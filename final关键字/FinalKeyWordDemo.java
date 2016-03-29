//final 关键字
//1、final声明一个类     该类不能被继承
//2、final声明一个方法   该方法不能被子类重写
//3、final声明一个常量   用final修饰的属性为常量（值不能改变）
//(1)在声明的时候赋值  （2）通过构造方法赋值
public class FinalKeyWordDemo
{
	public static void main(String[] args)
	{
		
	}
}

final class Girl
{
	final String name = "小白";//常量
	final String sex;
	public Girl(String sex)
	{
		this.sex = sex;
	}
	public final void desc()
	{
		System.out.println("我是"+name);
	}
}