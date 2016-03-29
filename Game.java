import java.util.Scanner;
import java.util.Random;


public class Game
{
	public static void main(String[] args)
	{
		Games g = new Games();
		g.begin();
	}
}


class Games
{
	public void begin()
	{
		System.out.println("**************************");
		System.out.println("*************猜拳游戏*************");
		System.out.println("游戏规则：（1、剪刀 2、石头 3、布）");
		System.out.println("开始游戏（1/0）");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if(result==1)
		{
			System.out.println("请输入猜拳次数：");
			int num = input.nextInt();
			play(num);
		}
		else
		{
			System.out.println("bye bye!");
		}
	}

	//游戏核心方法
	public void play(int num)
	{
		int userScore = 0;
		int pcScore = 0;
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		while(num>0)
		{
			int x = r.nextInt(100)%3+1;//系统出拳
			System.out.println("请输入你的选择（1 2 3）:");
			int s = input.nextInt();
			if(s==1)
			{
				switch(x)
				{
					case 1:
						System.out.println("平局，你出剪刀，电脑出剪刀");
						break;
					case 2:
						System.out.println("你输了，你出剪刀，电脑出石头");
						pcScore++;
						break;								
					case 3:
						System.out.println("你赢了，你出剪刀，电脑出布");
						userScore++;
						break;
				}
			}
			if(s==2)
			{
				switch(x)
				{
					case 1:
						System.out.println("你赢了，你出石头，电脑出剪刀");
						userScore++;
						break;
					case 2:
						System.out.println("平局，你出石头，电脑出石头");
						
						break;								
					case 3:
						System.out.println("你输了，你出石头，电脑出布");
						pcScore++;
						break;
				}
			}
			if(s==3)
			{
				switch(x)
				{
					case 1:
						System.out.println("你输了，你出布，电脑出剪刀");
						pcScore++;
						
						break;
					case 2:
						System.out.println("你赢了，你出布，电脑出石头");
						userScore++;
						break;								
					case 3:
						System.out.println("平局，你出石头，电脑出布");
						
						break;
				}
			}
			num--;
		}	
		System.out.println("**************************");
		System.out.println("你胜："+userScore);
		System.out.println("电脑胜："+pcScore);
		if(userScore==pcScore)
		{
			System.out.println("平手");
		}
		else if(userScore>pcScore)
		{
			System.out.println("你赢了");
		}
		else
		{
			System.out.println("电脑赢了");
		}
	}
}