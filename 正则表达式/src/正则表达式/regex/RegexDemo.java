package ������ʽ.regex;

public class RegexDemo {

	public static void main(String[] args) 
	{
		String s = "0487561";
		char [] cs = s.toCharArray();
		boolean flag = true;
		for(int i=0;i<cs.length;i++)
		{
			if(!('0'<=cs[i] && cs[i]<='9'))
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("�ַ��������������");
		}
		else
		{
			System.out.println("�ַ����������������");
		}
		
		//ʹ��������ʽ������֤
		if(s.matches("\\d+"))
		{
			System.out.println("�ַ��������������");
		}
		else
		{
			System.out.println("�ַ����������������");
		}
		
	}

}
