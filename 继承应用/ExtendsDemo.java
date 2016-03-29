//继承应用
import java.util.Arrays;
public class ExtendsDemo
{
	public static void main(String [] args)
	{
		Underwear u1 = new Underwear("背心","男士",35.5f);
		Underwear u2 = new Underwear("胸垫","女士",98f);
		Underwear u3 = new Underwear("内裤","男士",188.0f);
		Underwear u4 = new Underwear("内裤","女士",298.0f);
		Underwear u5 = new Underwear("bra","女士",58.0f);
		UnderwearManager um = new UnderwearManager();
		um.add(u1);
		um.add(u2);
		um.add(u3);
		um.add(u4);
		um.add(u5);
 		Underwear [] us = um.getUnderwears();
		for(Underwear u:us)
		{
			System.out.println(u.getInfo());
		}
		System.out.println("------排序子类------");
		PriceSortUnderwearManager um1 = new PriceSortUnderwearManager();
		um1.add(u1);
		um1.add(u2);
		um1.add(u3);
		um1.add(u4);
		um1.add(u5);
		Underwear [] us1 = um1.getUnderwears();
		for(Underwear u:us1)
		{
			System.out.println(u.getInfo());
		}
		System.out.println("--------女士内衣子类--------");
		WomenUnderwearManager wm = new WomenUnderwearManager();
		wm.add(u1);
		wm.add(u2);
		wm.add(u3);
		wm.add(u4);
		wm.add(u5);
		Underwear [] us2 = wm.getUnderwears();
		for(Underwear u:us2)
		{
			System.out.println(u.getInfo());
		}
	}
}


//内衣类
class Underwear
{
	float price;
	String name;
	String sex;
	
	public Underwear(String name,String sex,float price)
	{
		this.name = name;
		this.sex = sex;
		this.price = price;
	}
	public String getInfo()
	{
		return sex+name+"，人民币:"+price;
	}
}

//内衣管理类
class UnderwearManager
{
	private Underwear [] underwears = new Underwear [3]; 
	private int count;
	
	//添加内衣功能
	public void add(Underwear u)
	{
		if(count>=underwears.length)
		{
			//数组动态扩展
			int newlen = (underwears.length*3)/2+1;
			underwears = Arrays.copyOf(underwears,newlen);
		}	
		underwears[count] = u;
		count++;
	}
	//输出所有内衣信息
	public Underwear[] getUnderwears()
	{
		Underwear [] us = new Underwear[count];
		for(int i=0;i<us.length;i++)
		{
			us[i] = underwears[i];
		}
		return us;
	}
}
//实现按单价排序的子类
class PriceSortUnderwearManager extends  UnderwearManager
{	//重写父类方法
	public Underwear[] getUnderwears()
	{
		Underwear[] us = super.getUnderwears();
		Underwear temp = null;//临时的交换变量
		for(int i=0;i<us.length-1;i++)
		{
			for(int j=0;j<us.length-1-i;j++)
			{
				if(us[j].price>us[j+1].price)
				{
					temp = us[j];
					us[j] = us[j+1];
					us[j+1] = temp;
				}
			}
		}
		return us;
	}	
}

//女士内衣管理
class WomenUnderwearManager extends UnderwearManager
{
	public Underwear[] getUnderwears()
	{
		Underwear[] src = super.getUnderwears();
		//创建一个UnderwearManager对象，用于存储女士内衣
		UnderwearManager um = new UnderwearManager();
		for(int i=0;i<src.length;i++)
		{
			if("女士".equals(src[i].sex))
			{
				um.add(src[i]);
			}
		}
		return um.getUnderwears();
	}
}