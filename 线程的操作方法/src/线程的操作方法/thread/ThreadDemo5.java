package �̵߳Ĳ�������.thread;

/*
 * �ػ��߳�setDaemon
 * 
 * yield  ��ͣ��ǰ�߳�
 */
public class ThreadDemo5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyThread6 m6 = new MyThread6();
		Thread t1 = new Thread(m6);
//		t1.setDaemon(true);
		t1.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main-"+i);
			if(i==5)
			{
				Thread.yield();//�ó�����cpu��ִ��ʱ��
			}
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


class MyThread6 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++)
		{
			System.out.println("MyThread6-"+i);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
