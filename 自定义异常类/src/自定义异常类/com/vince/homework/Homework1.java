package �Զ����쳣��.com.vince.homework;

import java.util.Scanner;
public class Homework1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String username = input.next();
		System.out.println("���������룺");
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
				System.out.println("��½�ɹ�");
			}
		} 
		catch (LogicException e) 
		{
			// TODO: handle exception
			e.printStackTrace();//��Ŀ��ɺ�ע�͵�
		}
	}

}
