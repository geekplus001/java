package �۲���ģʽ.observer;
/*
 * ����ı��۲��߶���
 */
import java.util.Vector;

public class Doll implements Subject
{
	//���۲���ά����һ���۲��߶����б�
	private Vector<Observer> v = new Vector<Observer>();
	private float price;
	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		//�۸�䶯ʱ֪ͨ���й۲���
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
	    //ʵ��֪ͨ���й۲��߸�����Ϣ
		for(Observer o:v)
		{
			o.update(price);
		}
	
	}

}
