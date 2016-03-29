package �۲���ģʽ.observer2;

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
			System.out.println(name+"��ע�����޵ļ۸��Ѹ���Ϊ��"+doll.getPrice());
		}
	}

}
