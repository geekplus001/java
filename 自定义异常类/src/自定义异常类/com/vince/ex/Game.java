package �Զ����쳣��.com.vince.ex;

import java.util.Scanner;

public class Game
{
	public static int count = 5;//��ɻ��Ĵ���
	//��ɻ���Ϸ
	/*
	 * ��ɻ���Ϸ
	 */
	public void play()throws LogicException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("��ɻ���Ϸ��ʼ��");
		while(true)
		{
			System.out.println("��ʼ�������0���֣��˳�������0");
			int yesno = input.nextInt();
			
			if(yesno==0)
			{
				System.out.println("�˳���Ϸ��");
				return;
			}
			if(count==0)
			{
				throw new LogicException("��ķɻ������");
			}
			System.out.println("�㻹��"+--count+"�ܷɻ�");
			
		}
	}
	public static void main(String[] args)
	{
		Game g = new Game();
		try 
		{
			g.play();
		} 
		catch (LogicException e)
		{
			System.out.println(e.toString());
		}
		
	}
}
