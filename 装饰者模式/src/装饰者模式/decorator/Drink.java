package 装饰者模式.decorator;
/*
 * 被装饰者对象
 */
public interface Drink 
{
	//饮料的描述信息
	public String description();
	
	//计算价格
	public float cost();
}
