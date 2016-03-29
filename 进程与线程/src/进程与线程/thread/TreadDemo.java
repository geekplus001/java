package 进程与线程.thread;

import java.util.Date;

/*
 * 多线程的实现方式：
 * 1、继承Thread类
 * 2、实现Runnable接口
 */
public class TreadDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//使用自定义线程
		MyThread myTread = new MyThread();
		myTread.start();//启动线程
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

//自定义的线程类1
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


//自定义的线程类2
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
