package ����.generic;
/*
 * ʹ�÷��Ͷ���ӿ�
 */
public interface IEat <T> 
{
	public void eat(T food);
	
}


class IEatImpl<T> implements IEat<T>
{
	@Override
	public void eat(T food) 
	{
		
	}
}