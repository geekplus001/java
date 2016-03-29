package ��������������Ӧ�ð���.thread;
/*
 * �������������߰���
 */
public class ThreadDemo 
{

	public static void main(String[] args) 
	{
		Food f = new Food();
		Producter p =new Producter(f);
		Consumer c = new Consumer(f);
		new Thread(p).start();
		new Thread(c).start();
	}

}


class Producter implements Runnable
{
	private  Food food;
	public  Producter(Food food)
	{
		this.food = food;
	}
	
	@Override
	public void run() 
	{
		for(int i = 0;i<100;i++)
		{
			if(i%2==0)
			{
//				food.setName("�²˳�����");
//				try 
//				{
//					Thread.sleep(300);
//				}
//				catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
//				food.setContent("���˵ĺ�ʳƷ������������彡��");
				food.set("�²˳�����","���˵ĺ�ʳƷ������������彡��");
			}
			else
			{
//				food.setName("�б�����");
//				try 
//				{
//					Thread.sleep(300);
//				}
//				catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
//				food.setContent("���������Һ�ta�ͺ�");
				food.set("�б�����","���������Һ�ta�ͺ�");
			}
		}
	}
	
}


class Consumer implements Runnable
{
	private Food food;
	public  Consumer(Food food) 
	{
		this.food = food;
	}
	@Override
	public void run() 
	{
		for(int i=0;i<100;i++)
		{
//			try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(food.getName()+":"+food.getContent());
			food.get();
		}
	}
	
}



class Food 
{
	private String name;
	private String  content;
	
	private boolean flag=true;//true��ʾ����������false��ʾ��������
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", content=" + content + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Food(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//������Ʒ
	public synchronized void set(String name,String content)
	{
		if(!flag)
		{
			try {
				this.wait();//�õ�ǰ�߳̽���ȴ��صȴ���û��ָ��ʱ�����Ҫ�����̻߳���
							//�ͷŶ��������ó�cpu��sleep���ó���������
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.setName(name);
		try 
		{
			Thread.sleep(300);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		this.setContent(content);
		flag = false;
		this.notify();//�����ڸü������ϵ�һ���߳�
	}
	
	//���Ѳ�Ʒ
	public synchronized void get()
	{
		if(flag)
		{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName()+":"+this.getContent());
		flag = true;
		this.notify();
	}
}