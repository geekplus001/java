public class OneToOneDemo
{
	public static void main(String[] args)
	{
		Husband h = new Husband("С��",'��');
		Wife w = new Wife("����",19);
		//������ϵ
		h.wife = w;
		w.husband = h;

		System.out.println("����"+h.name+"���ҵ������ǣ�"+h.wife.name+"��������"+h.wife.age+"����");
	}
}

//�ɷ���

class Husband
{
	String name;
	char sex;
	Wife wife;//����������
	//getter/setter...
	public Husband(){}
	public Husband(String name,char sex)
	{
		this.name = name;
		this.sex = sex;
	}
}

//������

class Wife
{
	String name;
	int age;
	Husband husband;//�����ɷ���
	//getter/setter...
	public Wife(){}
	public Wife(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}