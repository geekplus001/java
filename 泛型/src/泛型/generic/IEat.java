package 泛型.generic;
/*
 * 使用泛型定义接口
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