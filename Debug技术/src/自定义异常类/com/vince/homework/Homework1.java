package �Զ����쳣��.com.vince.homework;
/*
 * F5��������   ���뱾�д�����ִ��
 * F6��������   ִ�б��д��룬������һ��
 * F7��������   ��������
 * F8����          �ҵ���һ���ϵ�
 * û�жϵ�ͽ���
 * ctrl+rִ�е�������ڵ���һ��
 */
import java.util.Scanner;
public class Homework1 
{

	public static void main(String[] args) 
	{
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
			e.printStackTrace();//��Ŀ��ɺ�ע�͵�
		}
	}

}
