package �̵߳Ĳ�������.thread;

public class ThreadDemo3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyThread3  my = new MyThread3();
		Thread t1 = new Thread(my);
		t1.start();
//		Thread t2 = new Thread(my);
		
		for(int i=0; i<10;i++)
		{
			System.out.println("main-"+i);
			if(i==5)
				try {
					t1.join();//�ȴ��ó�����ֹ
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


class MyThread3 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
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