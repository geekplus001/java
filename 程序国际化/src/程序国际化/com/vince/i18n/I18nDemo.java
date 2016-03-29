package 程序国际化.com.vince.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18nDemo
{

	public static void main(String[] args)
	{
		//创建一个本地语言环境对象（）
		Locale locale = new Locale("zh","CN");
		Locale locale2 = Locale.US; 
		Locale locale3 =  Locale.getDefault();//默认(当前)
		
		//模拟用户登录功能
		//通过ResourceBundle工具类绑定资源文件（包名：文件名的基本名称）
		ResourceBundle res = ResourceBundle.getBundle("程序国际化.com.vince.i18n.info",locale2);
		Scanner input = new Scanner(System.in);
		//从绑定的资源文件（属性文件）中根据key获取对应的value
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
			//处理动态文本(模式，真正要替换的值)
			String success = MessageFormat.format(infoSuccessKey, username);
		
			System.out.println(success);
			
		}
		else 
		{
			System.out.println(infoErrorKey);
		}
	}

}
