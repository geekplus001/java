package 观察者模式.observer;
/*
 * 具体的观察者对象
 */
public class Person implements Observer 
{
	private String name;
	public Person(String name) 
	{
		this.name = name;
	}
	@Override
	public void update(float price) 
	{
		System.out.println(name+"关注的娃娃价格已更新为："+price);
	}

}
