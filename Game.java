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
		System.out.println("*************��ȭ��Ϸ*************");
		System.out.println("��Ϸ���򣺣�1������ 2��ʯͷ 3������");
		System.out.println("��ʼ��Ϸ��1/0��");
		Scanner input = new Scanner(System.in);
		int result = input.nextInt();
		if(result==1)
		{
			System.out.println("�������ȭ������");
			int num = input.nextInt();
			play(num);
		}
		else
		{
			System.out.println("bye bye!");
		}
	}

	//��Ϸ���ķ���
	public void play(int num)
	{
		int userScore = 0;
		int pcScore = 0;
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		while(num>0)
		{
			int x = r.nextInt(100)%3+1;//ϵͳ��ȭ
			System.out.println("���������ѡ��1 2 3��:");
			int s = input.nextInt();
			if(s==1)
			{
				switch(x)
				{
					case 1:
						System.out.println("ƽ�֣�������������Գ�����");
						break;
					case 2:
						System.out.println("�����ˣ�������������Գ�ʯͷ");
						pcScore++;
						break;								
					case 3:
						System.out.println("��Ӯ�ˣ�������������Գ���");
						userScore++;
						break;
				}
			}
			if(s==2)
			{
				switch(x)
				{
					case 1:
						System.out.println("��Ӯ�ˣ����ʯͷ�����Գ�����");
						userScore++;
						break;
					case 2:
						System.out.println("ƽ�֣����ʯͷ�����Գ�ʯͷ");
						
						break;								
					case 3:
						System.out.println("�����ˣ����ʯͷ�����Գ���");
						pcScore++;
						break;
				}
			}
			if(s==3)
			{
				switch(x)
				{
					case 1:
						System.out.println("�����ˣ�����������Գ�����");
						pcScore++;
						
						break;
					case 2:
						System.out.println("��Ӯ�ˣ�����������Գ�ʯͷ");
						userScore++;
						break;								
					case 3:
						System.out.println("ƽ�֣����ʯͷ�����Գ���");
						
						break;
				}
			}
			num--;
		}	
		System.out.println("**************************");
		System.out.println("��ʤ��"+userScore);
		System.out.println("����ʤ��"+pcScore);
		if(userScore==pcScore)
		{
			System.out.println("ƽ��");
		}
		else if(userScore>pcScore)
		{
			System.out.println("��Ӯ��");
		}
		else
		{
			System.out.println("����Ӯ��");
		}
	}
}