package �̵߳Ĳ�������.thread;

public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		System.out.println("��ȡ��ǰ�̵߳����ƣ�"+Thread.currentThread().getName());
		
		Thread t1 = new Thread(new MyThread(),"С���߳�");
		t1.setName("С���߳�");//�����̵߳�����
		System.out.println("t1�߳��Ƿ��ڻ״̬:"+t1.isAlive());
		t1.start();
//		System.out.println(t1.getId());
		System.out.println("t1�߳��Ƿ��ڻ״̬:"+t1.isAlive());
	}

}

class MyThread implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("��ȡ��ǰ�̵߳����ƣ�"+Thread.currentThread().getName());
	}
	
}