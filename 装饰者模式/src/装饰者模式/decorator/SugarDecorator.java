package װ����ģʽ.decorator;
/*
 * �����װ���߶�����
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
		return super.description()+"+��";
	}
	
	@Override
	public float cost()
	{
		// TODO Auto-generated method stub
		return super.cost()+0.5f;
	}
}
