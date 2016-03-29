//抽象类

public class AbstractClassDemo
{
	public static void main(String[] args)
	{
		Goddess g = new Goddess();
		g.setName("桐桐");
		g.say();
		UglyWomen u = new UglyWomen();
		u.setName("小白");
		u.say();
	}
}

//女人
//abstract表示声明一个类为抽象类
abstract class Women
{
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public abstract void say(); //抽象方法只有声明没有实现
}

class Goddess extends Women
{
	//实现父类的抽象方法
	public void say()
	{
		System.out.println("偶是女神，我是"+getName());	
	}
}

class UglyWomen extends Women
{
	//实现父类的抽象方法
	public void say()
	{
		System.out.println("我虽丑，但我丑女无敌，我是"+getName());
	}
}