package �������߳�.thread;

import java.util.Date;

/*
 * ���̵߳�ʵ�ַ�ʽ��
 * 1���̳�Thread��
 * 2��ʵ��Runnable�ӿ�
 */
public class TreadDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//ʹ���Զ����߳�
		MyThread myTread = new MyThread();
		myTread.start();//�����߳�
		for(int i=0;i<20;i++)
		{
			System.out.println("main-"+i);
		}
			
		
		
		MyRunnable myRunnable = new MyRunnable();
//		thread2.run();
		Thread thread2  = new Thread(myRunnable);
		thread2.start();
	}

}

//�Զ�����߳���1
class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0;i<10;i++)
		{
			System.out.println(new Date()+"-"+i);
		}
	}
}


//�Զ�����߳���2
class MyRunnable implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("MyRunnable-"+i);
		}
	}
	
}
