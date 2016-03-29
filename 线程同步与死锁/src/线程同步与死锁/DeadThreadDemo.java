package 线程同步与死锁;

public class DeadThreadDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new DeadThread();
	}

}

class Customer
{
	public synchronized void say(Waiter w)
	{
		System.out.println("顾客说：先做再给钱");
		w.doService();
	}
	public synchronized  void doService()
	{
		System.out.println("同意了，先给钱再做");
	}
}

class Waiter
{
	public synchronized void say(Customer c)
	{
		System.out.println("服务员说：先给钱再做");
		c.doService();
	}
	public synchronized void doService()
	{
		System.out.println("同意了，先做再给钱");
	}
}

//死锁线程
class DeadThread implements Runnable
{
	Customer c = new Customer();
	Waiter w = new Waiter();
	public DeadThread()
	{
		new Thread(this).start();
		w.say(c);
	}
	public void run()
	{
		c.say(w);
	}
}