package 生产者与消费者应用案例.thread;
/*
 * 生产者与消费者案例
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
//				food.setName("韭菜炒鸡蛋");
//				try 
//				{
//					Thread.sleep(300);
//				}
//				catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
//				food.setContent("男人的好食品，多吃有益身体健康");
				food.set("韭菜炒鸡蛋","男人的好食品，多吃有益身体健康");
			}
			else
			{
//				food.setName("葱爆腰花");
//				try 
//				{
//					Thread.sleep(300);
//				}
//				catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
//				food.setContent("补肾气，我好ta就好");
				food.set("葱爆腰花","补肾气，我好ta就好");
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
	
	private boolean flag=true;//true表示可以生产，false表示可以消费
	
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
	
	//生产产品
	public synchronized void set(String name,String content)
	{
		if(!flag)
		{
			try {
				this.wait();//让当前线程进入等待池等待，没有指定时间就需要其他线程唤醒
							//释放对象锁，让出cpu（sleep不让出对象锁）
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
		this.notify();//唤醒在该监视器上的一个线程
	}
	
	//消费产品
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