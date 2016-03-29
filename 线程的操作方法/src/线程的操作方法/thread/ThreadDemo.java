package 线程的操作方法.thread;

public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("获取当前线程的名称："+Thread.currentThread().getName());
		
		Thread t1 = new Thread(new MyThread(),"小白线程");
		t1.setName("小黑线程");//设置线程的名称
		System.out.println("t1线程是否处于活动状态:"+t1.isAlive());
		t1.start();
//		System.out.println(t1.getId());
		System.out.println("t1线程是否处于活动状态:"+t1.isAlive());
	}

}

class MyThread implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("获取当前线程的名称："+Thread.currentThread().getName());
	}
	
}