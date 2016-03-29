package 线程同步与死锁;
/*
 * 多线程共享数据的安全问题，使用同步代解决
 * 1、同步代码块
 * 2、同步方法
 * 同步代码会带来性能降低的问题，提高数据的安全性
 * （锁的是同一个对象）
 */
public class ThreadDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyThread my  = new MyThread();
		Thread t1 = new Thread(my,"小白");
		Thread t2 = new Thread(my,"凤凤");
		t1.start();
		t2.start();
	}

}

class MyThread implements Runnable
{
	Object obj = new Object();//同步的标记对象
	
		public void run()
		{
			//同步代码块
//			synchronized(obj)
//			{
//		
//				
//		
//			}
			doMethod();
		}
	/*
	 * 同步方法：同步的是当前对象(this)
	 */
	public synchronized void doMethod()
	{
		System.out.println(Thread.currentThread().getName()+"正在。。。");
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"结束。。。");
	}
	
}
