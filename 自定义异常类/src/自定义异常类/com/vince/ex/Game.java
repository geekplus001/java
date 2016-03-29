package 自定义异常类.com.vince.ex;

import java.util.Scanner;

public class Game
{
	public static int count = 5;//打飞机的次数
	//打飞机游戏
	/*
	 * 打飞机游戏
	 */
	public void play()throws LogicException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("打飞机游戏开始：");
		while(true)
		{
			System.out.println("开始请输入非0数字，退出请输入0");
			int yesno = input.nextInt();
			
			if(yesno==0)
			{
				System.out.println("退出游戏。");
				return;
			}
			if(count==0)
			{
				throw new LogicException("你的飞机打光了");
			}
			System.out.println("你还有"+--count+"架飞机");
			
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
