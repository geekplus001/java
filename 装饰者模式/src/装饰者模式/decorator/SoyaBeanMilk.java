package 装饰者模式.decorator;

/*
 * 具体的被装饰对象：纯豆浆
 */
public class SoyaBeanMilk implements Drink
{
	public String description()
	{
		return "纯豆浆";
		
	}
	
	public float cost()
	{
		return 5f;
	}
}
