package �߳�ͬ��������;

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
		System.out.println("�˿�˵�������ٸ�Ǯ");
		w.doService();
	}
	public synchronized  void doService()
	{
		System.out.println("ͬ���ˣ��ȸ�Ǯ����");
	}
}

class Waiter
{
	public synchronized void say(Customer c)
	{
		System.out.println("����Ա˵���ȸ�Ǯ����");
		c.doService();
	}
	public synchronized void doService()
	{
		System.out.println("ͬ���ˣ������ٸ�Ǯ");
	}
}

//�����߳�
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