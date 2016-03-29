package 装饰者模式.decorator;
/*
 * 具体的装饰者对象：糖
 */
public class SugarDecorator extends Decorator
{

	public SugarDecorator(Drink drink)
	{
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description()
	{
		// TODO Auto-generated method stub
		return super.description()+"+糖";
	}
	
	@Override
	public float cost()
	{
		// TODO Auto-generated method stub
		return super.cost()+0.5f;
	}
}
