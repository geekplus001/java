package �۲���ģʽ.observer2;

import java.util.Observable;

public class Doll extends Observable
{
	 private float price;
	 public Doll(float price)
	 {
		 this.price = price;
	 }
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
		
		this.setChanged();//֪ͨ�������Ѹı�
		this.notifyObservers();
	}
	 
	 
}
