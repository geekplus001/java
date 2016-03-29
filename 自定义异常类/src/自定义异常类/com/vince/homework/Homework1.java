package 自定义异常类.com.vince.homework;

import java.util.Scanner;
public class Homework1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
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
			// TODO: handle exception
			e.printStackTrace();//项目完成后注释掉
		}
	}

}
