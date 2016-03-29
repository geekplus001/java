//�ӿ�Ӧ��

public class InterfaceAppDemo
{
	public static void main(String[] args)
	{
		Person p = new Person("С��");
		System.out.println("--------�Թ�ǰ--------");
		p.setIsay(new BeforeGong());
		p.say();
		System.out.println("--------�Թ���--------");
		p.setIsay(new AfterGong());
		p.say();
	}
}

//��˵������Ϊ�����һ���ӿ�
interface Isay
{
	public void say();
}

class BeforeGong implements Isay
{
	public void say()
	{
		System.out.println("�˼��Ǵ�ү�ǣ�");
	}
}


class AfterGong implements Isay
{
	public void say()
	{
		System.out.println("�˼������ǹ�Ů�ˣ�");
	}
}

 class Person
{
	private String name;
	private Isay isay;//�ѽӿ���Ϊ���е�һ�����ԣ���ϣ�

	public void setIsay(Isay isay)
	{
		this.isay = isay; 
	}
	public Person(String name)
	{
		this.name = name;
	}
	//���������ʵ���Ǳ仯��
	public  void say()
	{
		isay.say();
	}
}

/*class BeforeGong extends Person
{
	public person(String name)
	{
		super(name);
	}
	public void say()
	{
		System.out.println("�˼��Ǵ�ү�ǣ�");
	}
}


class AfterGong extends Person
{
	public person(String name)
	{
		super(name);
	}
	public void say()
	{
		System.out.println("�˼������ǹ�Ů�ˣ�");
	}
}*/