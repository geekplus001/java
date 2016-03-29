package ������ʽ.regex;

public class RegexDemo3 {

	public static void main(String[] args) 
	{
		//ƥ��绰����
		String phoneNumber = "010-53517230";
		boolean b = phoneNumber.matches("\\d{3,4}-\\d{7,8}");
		if(b)
		{
			System.out.println("�绰�����ʽ��ȷ");
		}
		else
		{
			System.out.println("�绰�����ʽ����ȷ");
		}
		
		//ƥ���ֻ�����
		String phone = "13143188844";
		System.out.println(phone.matches("[1][3-9]\\d{9}"));
		
		//ƥ���û�������ĸ��ͷ��������ĸ�»������
		String username  = "xb1314";
		System.out.println(username.matches("[a-zA-Z]+[\\w|_]*"));
		
		//ƥ��IP��ַ
		String ip = "20.10.20.123";
		System.out.println(ip.matches("\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}"));
		
		//ƥ����ַ
		String addr = "http://java.lampbrother.net";
		System.out.println(addr.matches("http://\\w+.\\w+.\\S*"));
	}

}
