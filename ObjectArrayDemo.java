import java.util.Arrays;

public class ObjectArrayDemo
{
	public static void main(String[] args)
	{
		//Ìí¼Ó²âÊÔ
		MonkeyManager mm = new MonkeyManager();
		mm.add(new Monkey("Îò¿Õ",'¹«'));
		mm.add(new Monkey("Îò·¹",'¹«'));
		mm.add(new Monkey("Ð¡°×",'Ä¸'));
		mm.list();
		System.out.println("--------------------");
		//É¾³ý²âÊÔ
		mm.delete("Îò·¹");
		mm.list();
		System.out.println("--------------------");
		//²éÕÒ²âÊÔ
		Monkey m1 = mm.find("Ð¡°×");
		m1.print();
		System.out.println("--------------------");
		//ÐÞ¸Ä²âÊÔ
		Monkey m2 = new Monkey("Ð¡°×",'¹«');
		mm.update(m2);
		mm.list();
		System.out.println("--------------------");
		//
		mm.add(new Monkey("Ð¡ºÚ",'¹«'));
		mm.add(new Monkey("Ð¡ºì",'Ä¸'));
		mm.list();
	}
}


class MonkeyManager
{
	private Monkey[] monkeys = new Monkey[3];
	private int count = 0;
	
	//Ìí¼Óºï×Ó
	public void add(Monkey m)
	{
		if(count>=monkeys.length)
		{
			int newLen = (monkeys.length*3)/2+1;
			monkeys = Arrays.copyOf(monkeys,newLen);
		}	
		monkeys[count] = m;
		count++;

	}

	//É¾³ý
	public void delete(String name)
	{
		for(int i=0;i<count-1;i++)
		{
			if(monkeys[i].getName().equals(name))	
			{
				for(int j=i;j<count-1;j++)
				{
					monkeys[j] = monkeys[j+1];
				}
				monkeys[count-1] = null;
				count--;
				break;
			}	
		}
	}

	//²éÕÒ
	public Monkey find(String name)
	{
		for(int i=0;i<count;i++)
		{
			if(monkeys[i].getName().equals(name))
			{
				return monkeys[i];
			}
		}
		return null;
	}
	
	//ÐÞ¸Ä
	public void update(Monkey monkey)
	{
		Monkey m = find(monkey.getName());
		if(m!=null)
		{
			m.setSex(monkey.getSex());
		}	
	}


	//±éÀú
	public void list()
	{
		for(int i=0;i<count;i++)
		{
			monkeys[i].print();
		}
	}
}


class Monkey
{
	private String name;
	private char sex;
	public Monkey(){}
	public Monkey(String name,char sex)
	{
		this.name = name;
		this.sex = sex;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name; 
	}
	public void setSex(char sex)
	{
		this.sex = sex;
	}
	public char getSex()
	{
		return sex;
	}
	public void print()
	{
		System.out.println("name="+name+",sex="+sex);
	}
}