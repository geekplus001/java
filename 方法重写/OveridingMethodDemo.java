//方法重写


public class OveridingMethodDemo
{
	public static void main(String [] args)
	{
		HomeDog hd = new HomeDog("小白");
		hd.desc();
		Dog d = new Dog("小黑");
		d.desc();
	}
}


class Dog
{
	protected String name;
	public Dog(String name)
	{
		this.name = name;
	}
	
	protected void desc()
	{
		System.out.println("dog my name is:"+name);
	}
}

//子类
class HomeDog extends Dog
{
	//public String name;属性重写
	public HomeDog(String name)
	{
		super(name);
	}
	//重写父类的方法
	public void desc()
	{
		System.out.println("我是一只狗，我的名字是："+name);
	}
}