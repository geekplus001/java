package ����Ŀ�¡.com.vince.clone;
/*
 * Ҫ����һ�����ƵĶ���
 * �������Ͽ��ǣ��Ϳ���ʹ�ÿ�¡����
 */
public class Test 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Cat c = new Cat("С��",3);
		System.out.println("c="+c);
		try 
		{
			Cat c1 = (Cat)c.clone();
			System.out.println("c1="+c1);
		} 
		catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
