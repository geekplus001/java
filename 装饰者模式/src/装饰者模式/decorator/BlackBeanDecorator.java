package 装饰者模式.decorator;
/*
 * 具体的装饰者对象：黑豆
 */

public class BlackBeanDecorator extends Decorator
{

	public BlackBeanDecorator(Drink drink)
	{
		super(drink);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String description() 
	{
		// TODO Auto-generated method stub
		return super.description()+"+黑豆";
	}
	
	@Override
	public float cost()
	{
		// TODO Auto-generated method stub
		return super.cost()+3.0f;
	}
}
