package �̵߳������������̳߳�.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo
{

	public static void main(String[] args)
	{
		//����һ�����̵߳��̳߳�
//		ExecutorService es = Executors.newSingleThreadExecutor();
		//����һ���̶���С���̳߳�
//		ExecutorService es = Executors.newFixedThreadPool(2);
		//����һ���ɻ���� �̳߳�
//		ExecutorService es = Executors.newCachedThreadPool();
		//����һ����С���޵��̳߳�
		ExecutorService es = Executors.newScheduledThreadPool(2);
		
		
		MyThread my = new MyThread();
		MyThread my2 = new MyThread();
		//ִ���߳�
		es.execute(my);
		es.execute(my2);
	}

}


class MyThread implements Runnable
{
	@Override
	public void run() 
	{
		for(int i = 0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("MyThread-"+i);
		}
	}
}