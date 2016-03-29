package 装饰者模式.decorator;

/*
 * 装饰者基类
 */
public abstract class Decorator implements Drink
{
	private Drink drink;//要装饰的对象
	
	public Decorator(Drink drink)
	{
		this.drink = drink;
	}
	
	public String description()
	{
		return drink.description();
		
	}
	
	public float cost()
	{
		return drink.cost();
	}

}
