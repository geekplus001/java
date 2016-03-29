package 装饰者模式.decorator;

/*
 * 具体的装饰者对象：鸡蛋
 */
public class EggDecorator extends Decorator
{

	public EggDecorator(Drink drink)
	{
		super(drink);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String description() 
	{
		// TODO Auto-generated method stub
		return super.description()+"+鸡蛋";
	}
	
	@Override
	public float cost()
	{
		// TODO Auto-generated method stub
		return super.cost()+2.0f;
	}
}
