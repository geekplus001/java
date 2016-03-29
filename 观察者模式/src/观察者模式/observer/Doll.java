package 观察者模式.observer;
/*
 * 具体的被观察者对象
 */
import java.util.Vector;

public class Doll implements Subject
{
	//被观察者维护的一个观察者对象列表
	private Vector<Observer> v = new Vector<Observer>();
	private float price;
	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		//价格变动时通知所有观察者
		this.price = price;
		notifyObservers();
	}
	
	
	public Doll(float price)
	{
		this.price = price;
	}

	@Override
	public void registerObserver(Observer o) 
	{
		v.add(o);
	}

	@Override
	public void removeObserver(Observer o)
	{
		v.remove(o);
	}

	@Override
	public void notifyObservers() 
	{
	    //实现通知所有观察者跟新信息
		for(Observer o:v)
		{
			o.update(price);
		}
	
	}

}
