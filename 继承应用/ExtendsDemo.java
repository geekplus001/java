//�̳�Ӧ��
import java.util.Arrays;
public class ExtendsDemo
{
	public static void main(String [] args)
	{
		Underwear u1 = new Underwear("����","��ʿ",35.5f);
		Underwear u2 = new Underwear("�ص�","Ůʿ",98f);
		Underwear u3 = new Underwear("�ڿ�","��ʿ",188.0f);
		Underwear u4 = new Underwear("�ڿ�","Ůʿ",298.0f);
		Underwear u5 = new Underwear("bra","Ůʿ",58.0f);
		UnderwearManager um = new UnderwearManager();
		um.add(u1);
		um.add(u2);
		um.add(u3);
		um.add(u4);
		um.add(u5);
 		Underwear [] us = um.getUnderwears();
		for(Underwear u:us)
		{
			System.out.println(u.getInfo());
		}
		System.out.println("------��������------");
		PriceSortUnderwearManager um1 = new PriceSortUnderwearManager();
		um1.add(u1);
		um1.add(u2);
		um1.add(u3);
		um1.add(u4);
		um1.add(u5);
		Underwear [] us1 = um1.getUnderwears();
		for(Underwear u:us1)
		{
			System.out.println(u.getInfo());
		}
		System.out.println("--------Ůʿ��������--------");
		WomenUnderwearManager wm = new WomenUnderwearManager();
		wm.add(u1);
		wm.add(u2);
		wm.add(u3);
		wm.add(u4);
		wm.add(u5);
		Underwear [] us2 = wm.getUnderwears();
		for(Underwear u:us2)
		{
			System.out.println(u.getInfo());
		}
	}
}


//������
class Underwear
{
	float price;
	String name;
	String sex;
	
	public Underwear(String name,String sex,float price)
	{
		this.name = name;
		this.sex = sex;
		this.price = price;
	}
	public String getInfo()
	{
		return sex+name+"�������:"+price;
	}
}

//���¹�����
class UnderwearManager
{
	private Underwear [] underwears = new Underwear [3]; 
	private int count;
	
	//������¹���
	public void add(Underwear u)
	{
		if(count>=underwears.length)
		{
			//���鶯̬��չ
			int newlen = (underwears.length*3)/2+1;
			underwears = Arrays.copyOf(underwears,newlen);
		}	
		underwears[count] = u;
		count++;
	}
	//�������������Ϣ
	public Underwear[] getUnderwears()
	{
		Underwear [] us = new Underwear[count];
		for(int i=0;i<us.length;i++)
		{
			us[i] = underwears[i];
		}
		return us;
	}
}
//ʵ�ְ��������������
class PriceSortUnderwearManager extends  UnderwearManager
{	//��д���෽��
	public Underwear[] getUnderwears()
	{
		Underwear[] us = super.getUnderwears();
		Underwear temp = null;//��ʱ�Ľ�������
		for(int i=0;i<us.length-1;i++)
		{
			for(int j=0;j<us.length-1-i;j++)
			{
				if(us[j].price>us[j+1].price)
				{
					temp = us[j];
					us[j] = us[j+1];
					us[j+1] = temp;
				}
			}
		}
		return us;
	}	
}

//Ůʿ���¹���
class WomenUnderwearManager extends UnderwearManager
{
	public Underwear[] getUnderwears()
	{
		Underwear[] src = super.getUnderwears();
		//����һ��UnderwearManager�������ڴ洢Ůʿ����
		UnderwearManager um = new UnderwearManager();
		for(int i=0;i<src.length;i++)
		{
			if("Ůʿ".equals(src[i].sex))
			{
				um.add(src[i]);
			}
		}
		return um.getUnderwears();
	}
}