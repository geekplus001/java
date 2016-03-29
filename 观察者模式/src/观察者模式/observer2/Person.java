package 观察者模式.observer2;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer
{
	private String name;
	public Person(String name) 
	{
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		if(o instanceof Doll)
		{
			Doll doll = (Doll)o;
			System.out.println(name+"关注的娃娃的价格已更新为："+doll.getPrice());
		}
	}

}
