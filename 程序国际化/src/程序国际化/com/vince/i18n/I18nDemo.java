package ������ʻ�.com.vince.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18nDemo
{

	public static void main(String[] args)
	{
		//����һ���������Ի������󣨣�
		Locale locale = new Locale("zh","CN");
		Locale locale2 = Locale.US; 
		Locale locale3 =  Locale.getDefault();//Ĭ��(��ǰ)
		
		//ģ���û���¼����
		//ͨ��ResourceBundle���������Դ�ļ����������ļ����Ļ������ƣ�
		ResourceBundle res = ResourceBundle.getBundle("������ʻ�.com.vince.i18n.info",locale2);
		Scanner input = new Scanner(System.in);
		//�Ӱ󶨵���Դ�ļ��������ļ����и���key��ȡ��Ӧ��value
		String inputKey = res.getString("input");
		String usernameKey = res.getString("username");
		String passwordKey = res.getString("password");
		String infoSuccessKey = res.getString("info.success");
		String infoErrorKey = res.getString("info.error");
		
		
		System.out.println(inputKey+usernameKey);
		String username = input.next();
		System.out.println(inputKey+passwordKey);
		String password = input.next();
		
		
		if("admin".equals(username)&&"123".equals(password))
		{
			//����̬�ı�(ģʽ������Ҫ�滻��ֵ)
			String success = MessageFormat.format(infoSuccessKey, username);
		
			System.out.println(success);
			
		}
		else 
		{
			System.out.println(infoErrorKey);
		}
	}

}
