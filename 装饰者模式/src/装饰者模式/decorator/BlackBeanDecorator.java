package װ����ģʽ.decorator;
/*
 * �����װ���߶��󣺺ڶ�
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
		return super.description()+"+�ڶ�";
	}
	
	@Override
	public float cost()
	{
		// TODO Auto-generated method stub
		return super.cost()+3.0f;
	}
}
