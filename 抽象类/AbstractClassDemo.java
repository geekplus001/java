//������

public class AbstractClassDemo
{
	public static void main(String[] args)
	{
		Goddess g = new Goddess();
		g.setName("ͩͩ");
		g.say();
		UglyWomen u = new UglyWomen();
		u.setName("С��");
		u.say();
	}
}

//Ů��
//abstract��ʾ����һ����Ϊ������
abstract class Women
{
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public abstract void say(); //���󷽷�ֻ������û��ʵ��
}

class Goddess extends Women
{
	//ʵ�ָ���ĳ��󷽷�
	public void say()
	{
		System.out.println("ż��Ů������"+getName());	
	}
}

class UglyWomen extends Women
{
	//ʵ�ָ���ĳ��󷽷�
	public void say()
	{
		System.out.println("����󣬵��ҳ�Ů�޵У�����"+getName());
	}
}