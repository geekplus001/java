package 线程的生命周期与线程池.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo
{

	public static void main(String[] args)
	{
		//创建一个单线程的线程池
//		ExecutorService es = Executors.newSingleThreadExecutor();
		//创建一个固定大小的线程池
//		ExecutorService es = Executors.newFixedThreadPool(2);
		//创建一个可缓存地 线程池
//		ExecutorService es = Executors.newCachedThreadPool();
		//创建一个大小无限的线程池
		ExecutorService es = Executors.newScheduledThreadPool(2);
		
		
		MyThread my = new MyThread();
		MyThread my2 = new MyThread();
		//执行线程
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