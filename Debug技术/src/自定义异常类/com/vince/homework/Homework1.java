package 自定义异常类.com.vince.homework;
/*
 * F5单步跳入   进入本行代码中执行
 * F6单步跳过   执行本行代码，跳到下一行
 * F7单步返回   跳出方法
 * F8继续          找到下一个断点
 * 没有断点就结束
 * ctrl+r执行到光标所在的这一行
 */
import java.util.Scanner;
public class Homework1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		UserService us = new UserService();
		try 
		{
			boolean flag = us.login(user);
			if(flag)
			{
				System.out.println("登陆成功");
			}
		} 
		catch (LogicException e) 
		{
			e.printStackTrace();//项目完成后注释掉
		}
	}

}
