//instanceof 关键字

public class InstanceofKeyWordDemo
{
	public static void main(String [] args)
	{
		Person man = new Man();
		say(man);
		
		Person w = new Women();
		say(w);
	}
	/*public static void say(Man m)
	{
		m.say();
	}
	public static void say(Women w)
	{
		w.say();
	}*/
	public static void say(Person p)
	{
		p.say();
		//判断p对象是否为Women的实例
		if(p instanceof Women)
		{
			Women w = (Women)p;
			w.getangry();
		}

	}
}



abstract class Person
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
	public abstract void say();//抽象方法
}


class Man extends Person
{
	public void say()
	{
		System.out.println("人家是纯爷们！");
	}
}

class Women extends Person
{
	public void say()
	{
		System.out.println("你今天要是再不交租，我就烧了你的铺子");
	}
	//	本类中扩展的方法
	public void getangry()
	{
		System.out.println("讨厌，人家生气了啦！");
	}
}