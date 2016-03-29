//Object��

public class ObjectDemo
{
	public static void main(String[] args)
	{
		Baboon bb = new Baboon("С��",7,'��');
		System.out.println(bb);
		Baboon b2 = new Baboon("С��",8,'ĸ');
		Baboon b3 = bb;
		System.out.println(bb==b2);
		System.out.println(bb==b3);
	
		Baboon b4 = new Baboon("С��",7,'��');
		System.out.println(bb==b4);
		
		//���Ƚ����������ֵ�Ƿ����ʱ��ʹ��equals����
		System.out.println(bb.equals(b4));
		
		System.out.println("---------------------");
		method(b4);
		method("С��");
	}
	

	//��Object������Ϊ��������(���Ա�ʾ���е���������)
	public static void method(Object obj)
	{
		if(obj instanceof Baboon)
		{
			Baboon b = (Baboon)obj;
			b.eat();
		}	
		else
		{
			System.out.println("�ö�����Baboon���͵�ʵ��");
		}
	}

}


//������
class Baboon
{
	private String name;
	private int age;
	private char sex;
	
	public Baboon(String name,int age,char sex)
	{
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	
	public void eat()
	{
		System.out.println("����ϲ�����㽶��");
	}	

	//��дobject���е�toString����
	public String toString()
	{
		return "name="+name+",age="+age+",sex="+sex;
	}

	//��дobject���е�equals�������Ƚ����������ֵ�Ƿ���ȣ�
	public boolean equals(Object obj)
	{
		if(this==obj)//����ڴ��ַ��ͬ������ͬ���������Ƚ�����ֵ
			return true;
		if(obj instanceof Baboon)
		{
			Baboon b = (Baboon)obj;
			if(!this.name.equals(b.name))
				return false;
			else if(this.age!=b.age)
				return false;
			else if(this.sex!=b.sex)
				return false;
			else
				return true;
		}
		else
		{
			return false;
		}
	}
}