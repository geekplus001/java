package 线程的操作方法.thread;


/*
 * 1、interruput（）方法只是设置了线程的中断状态为true，并没有真正中断线程
 * 
 * 2、 自定义标记完成中断线程
 * 
 * 设置线程的优先级
 */
public class ThreadDemo4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyThread4 my = new MyThread4();
		MyThread5 my2 = new MyThread5();
		
		
		Thread t1 = new Thread(my,"t1");
		Thread t2 = new Thread(my2,"t2");
		//设置线程优先级（几率大）
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main-"+i);
			if(i==5)
			{
				//t1.interrupt();//中断线程,设置了一个中断标记（中断状态为true）
				my2.setFlag(false);//中断线程
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



class MyThread5 implements Runnable
{
	private boolean flag =  true;
	
	public boolean isFlag()
	{
		return flag;
	}
	
	public void setFlag(boolean flag)
	{
		this.flag=flag;
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int i=0;
		while(flag)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
			i++;
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


class MyThread4 implements Runnable
{

	@Override
	public void run()
	{
		int i=0;
		// TODO Auto-generated method stub
		while(!Thread.interrupted())
//		for(int i=0;i<10;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+"-"+i);
			i++;
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
	
}