//继承的基本概念
//非私有的：public  default protected
//访问修饰符:public private default protected

//子类的实例化过程:子类实例化时会首先调用父类的默认构造方法

public class ExtendsDemo
{
	public static void main(String[] args)
	{
		HomeChicken hc = new HomeChicken();
		hc.desc();


		System.out.println("--------------------");
		Pheasant p = new Pheasant("小白");
		p.desc();
	}
}


//父类（超类 基类）
class Chicken
{
	protected String name;
	public Chicken(String name)//构造方法不能被继承
	{
		System.out.println("Chicken:"+name);
	}
	public void desc()
	{
		System.out.println("我是一只鸡");
	}
}

//子类 家鸡
class HomeChicken extends Chicken
{
	public HomeChicken()
	{
		super("小白");//表示父类的引用，调用父类构造方法语句必须是第一句
		System.out.println("HomeChicken");
	}
}

//子类	野鸡
class Pheasant extends Chicken
{
 	public Pheasant(String name)
	{
		super(name);
		this.name = name;
		System.out.println("Pheasant");
	}
}