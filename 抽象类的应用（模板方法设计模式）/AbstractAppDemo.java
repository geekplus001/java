//�������Ӧ��
//ģ�巽�����ģʽ������һ�������е��㷨�ĹǼܣ�����һЩ�ɱ�Ĳ���
//��ʵ���ӳٵ������С�ģ�巽�����ģʽ�ǵ�������Բ��ı�һ���㷨��
//�ṹ�������¶�����㷨��ĳЩ�ض�����
import java.util.Random;
public class AbstractAppDemo
{
	public static void main(String[] args)
	{
		LingjiuPalace lp = new Shemale("С��");
		System.out.println("С��ӦƸ���չ���Ůһ�����ǿ�ʼ��");
		lp.action();
	}
}


abstract class LingjiuPalace
{
	//��Ƹ�
	public void action()
	{
		if(competition())
		
			System.out.println("��ϲ�㣬�������չ�����һ�ϰ�");
		
		
		else
		{
			System.out.println("sorry��ѧ�ղ�����û���ɾ���");
		}
	}
	//��������
	public abstract boolean competition();//���󷽷�
}

class Shemale extends LingjiuPalace
{	
	private String name;
	public Shemale(String name)	
	{
		this.name = name;
	}
	//ʵ�ֱ�������
	public boolean competition()
	{
		System.out.println("����"+name);
		System.out.println("������ʼ���ɲ��ɹ�������������");
		Random r = new Random();
		return r.nextBoolean();
	}	
	
}