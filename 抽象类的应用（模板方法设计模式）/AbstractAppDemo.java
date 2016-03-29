//抽象类的应用
//模板方法设计模式：定义一个操作中的算法的骨架，而将一些可变的部分
//的实现延迟到子类中。模板方法设计模式是的子类可以不改变一个算法的
//结构即可重新定义该算法的某些特定步骤
import java.util.Random;
public class AbstractAppDemo
{
	public static void main(String[] args)
	{
		LingjiuPalace lp = new Shemale("小白");
		System.out.println("小白应聘灵鹫宫宫女一事正是开始。");
		lp.action();
	}
}


abstract class LingjiuPalace
{
	//招聘活动
	public void action()
	{
		if(competition())
		
			System.out.println("恭喜你，加入灵鹫宫，周一上班");
		
		
		else
		{
			System.out.println("sorry，学艺不精，没宫干净吧");
		}
	}
	//比赛方法
	public abstract boolean competition();//抽象方法
}

class Shemale extends LingjiuPalace
{	
	private String name;
	public Shemale(String name)	
	{
		this.name = name;
	}
	//实现比赛方法
	public boolean competition()
	{
		System.out.println("我是"+name);
		System.out.println("比赛开始，成不成功，听天由命！");
		Random r = new Random();
		return r.nextBoolean();
	}	
	
}