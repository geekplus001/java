package װ����ģʽ.decorator;

/*
 * װ���߻���
 */
public abstract class Decorator implements Drink
{
	private Drink drink;//Ҫװ�εĶ���
	
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
