/**
	this�ؼ���
	�������е�����
	�������еķ������췽��
	��ʾ��ǰ����
*/

public class ThisKeyWordDemo
{
	public static void main(String[] args)
	{
		Bear b1 = new Bear();
	}
}


class Bear
{
	private String name;
	private char sex;

	public Bear()
	{
		this("�ܴ�");
	}

	public Bear(String name)
	{
		this(name,'��');
	}

	public Bear(String name,char sex)
	{
		this.name = name;
		this.sex = sex;
		//���ñ����еķ���
		this.bite();
	}

	public void bite()//������һ������Сд  ���췽����д����������ͬ��
	{
		System.out.println("����"+sex+"��--"+name);	
	}
}