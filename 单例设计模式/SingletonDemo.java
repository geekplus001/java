/**�������ģʽ����֤һ�������һ��ʵ�������ṩһ����������ȫ�ֱ���
    1�����췽��˽�л�2������һ���������3�����ⲿ�ṩһ����̬������ȡ����ʵ��		
    ʵ�ַ�ʽ������ʽ  ����ʽ
*/

public class SingletonDemo
{
	public static void main(String[] args)
	{
		Singleton1 s = Singleton1.getInstance();
		s.print();
		Singleton1 s1 = Singleton1.getInstance();
		System.out.println(s==s1);
		
		Singleton2 s2 = Singleton2.getInstance();
		s2.print();
	}
}

//�Ѹ�����Ƴɵ������ģʽ  ����ʽ

class Singleton1
{
	private static Singleton1 s = new Singleton1();
	private Singleton1(){}
	
	public static Singleton1 getInstance()
	{
		return s;
	}
	
	public void print()
	{
		System.out.println("����ʽ-�������ģʽ");
	}
}

//�Ѹ�����Ƴɵ������ģʽ  ����ʽ�����̷߳���ʱ���а�ȫ���⣩

class Singleton2
{
	private static Singleton2 s = null;
	private Singleton2(){}
	
	public static Singleton2 getInstance()
	{
		if(s==null)
		{
			s = new Singleton2();
		}
		return s;
	}
	
	public void print()
	{
		System.out.println("����ʽ-�������ģʽ");
	}
}