//�̳еĻ�������
//��˽�еģ�public  default protected
//�������η�:public private default protected

//�����ʵ��������:����ʵ����ʱ�����ȵ��ø����Ĭ�Ϲ��췽��

public class ExtendsDemo
{
	public static void main(String[] args)
	{
		HomeChicken hc = new HomeChicken();
		hc.desc();


		System.out.println("--------------------");
		Pheasant p = new Pheasant("С��");
		p.desc();
	}
}


//���ࣨ���� ���ࣩ
class Chicken
{
	protected String name;
	public Chicken(String name)//���췽�����ܱ��̳�
	{
		System.out.println("Chicken:"+name);
	}
	public void desc()
	{
		System.out.println("����һֻ��");
	}
}

//���� �Ҽ�
class HomeChicken extends Chicken
{
	public HomeChicken()
	{
		super("С��");//��ʾ��������ã����ø��๹�췽���������ǵ�һ��
		System.out.println("HomeChicken");
	}
}

//����	Ұ��
class Pheasant extends Chicken
{
 	public Pheasant(String name)
	{
		super(name);
		this.name = name;
		System.out.println("Pheasant");
	}
}