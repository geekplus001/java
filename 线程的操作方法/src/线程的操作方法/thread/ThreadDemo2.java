package �̵߳Ĳ�������.thread;

/*
 * sleep����ԭ��
 * �õ�ǰ�߳̽�������״̬���ó�����ִ�е�cpuʱ�䣬���Ǹ��̲߳���ʧ�κμ�����������Ȩ
 */
public class ThreadDemo2
{
	
	public static void main(String []args)
	{
		Thread t1 = new Thread(new MyThread2());
		Thread t2 = new Thread(new MyThread2());
		t1.start();
		t2.start();
		for(int i=0;i<10;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}


class MyThread2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	
}