package �߳�ͬ��������;
/*
 * ���̹߳������ݵİ�ȫ���⣬ʹ��ͬ�������
 * 1��ͬ�������
 * 2��ͬ������
 * ͬ�������������ܽ��͵����⣬������ݵİ�ȫ��
 * ��������ͬһ������
 */
public class ThreadDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyThread my  = new MyThread();
		Thread t1 = new Thread(my,"С��");
		Thread t2 = new Thread(my,"���");
		t1.start();
		t2.start();
	}

}

class MyThread implements Runnable
{
	Object obj = new Object();//ͬ���ı�Ƕ���
	
		public void run()
		{
			//ͬ�������
//			synchronized(obj)
//			{
//		
//				
//		
//			}
			doMethod();
		}
	/*
	 * ͬ��������ͬ�����ǵ�ǰ����(this)
	 */
	public synchronized void doMethod()
	{
		System.out.println(Thread.currentThread().getName()+"���ڡ�����");
		try 
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"����������");
	}
	
}
