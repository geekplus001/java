//super关键字

public class SuperKeyWordDemo
{
	public static void main(String [] args)
	{
		BlackDuck bd = new BlackDuck("小白",300);
		bd.desc();
	}
}


class Duck
{
	protected String name;
	protected int price;
	
	public Duck(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	public void count()
	{
		System.out.println("duck price is "+price);
	}
}

class BlackDuck extends Duck
{
	public BlackDuck(String name,int price)
	{
		super(name,price);
	}
	public void desc()
	{
		System.out.println("我是一只鸭子，我的价格是："+price);
		super.count();
	}
}