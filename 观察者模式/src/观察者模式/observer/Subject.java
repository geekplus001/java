package 观察者模式.observer;
/*
 * 被观察者接口
 */
public interface Subject
{
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
