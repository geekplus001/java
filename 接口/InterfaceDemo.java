//接口
//接口可以继承多个接口
//一个类可以实现多个接口
//抽象类实现接口可以不实现方法
//接口中的所有方法的访问权限都是public
//接口中定义的属性都是常量
//接口不能被实例化
public class InterfaceDemo
{
	public static void main(String[] ags)
	{
		
	}
}

interface A
{

}

interface B
{

}
//吃食接口
interface IEat
{
	public void eat();	
}

//定义一个接口
interface Hit extends A,B
{
	public static final String NAME = "小白";
	//常量名字通常全大写~~
	//public static final 都可以省略
	public abstract void cry();
	//抽象方法，public abstract可以省略，默认public
}

//女神
class Goddess implements Hit,IEat
{
	//实现一个接口必须实现接口中的所有方法
	public void cry()
	{
		System.out.println("哎哟我的妈呀，你疼死我了");
	}
	public void eat()
	{
		System.out.println("一小口一小口的吃");
	}
}


//女汉子
class Girl implements Hit
{
	public void cry()
	{
		//name = "小黑";
		System.out.println("你妹啊，你不知道疼啊");
	}
}

//抽象类
abstract class Person implements Hit
{
	
}
