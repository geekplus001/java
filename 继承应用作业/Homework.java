import java.util.Arrays;

public class Homework
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog("小白",2000.0f,"狗");
		Dog d2 = new Dog("小黑",1000.0f,"狗");
		Dog d3 = new Dog("小黄",800.0f,"狗");
		Cat c1 = new Cat("汤姆",200.0f,"猫");
		Cat c2 = new Cat("咪咪",1200.0f,"猫");

		PetShop ps = new PetShop();
		ps.add(d1);
		ps.add(d2);
		ps.add(d3);
		ps.add(c1);
		ps.add(c2);
		for(Pet p:ps.getPets())
		{
			System.out.println(p.getInfo());
			p.eat();
		}
		System.out.println("----------查找狗---------");
		Pet[] pets = ps.findByType("狗");
		for(Pet p:pets)
		{
			System.out.println(p.getInfo());
			p.eat();
		}
	}
}

class Pet
{
	String name;
	float price;
	String type;
	public Pet(String name,float price,String type)
	{
		this.name = name;
		this.price = price;
		this.type = type;
	}
	//吃食方法	
	public void eat()
	{
		System.out.println(type+"吃饭了");
	}
	public String getInfo()
	{
		return "我是一只"+type+"，小伙伴们都叫我"+name+"，喜欢我就把我带走吧，只需RMB:"+price;
	}
}

class Dog extends Pet
{
	//吃食方法
	public void eat()
	{
		System.out.println("我喜欢啃大棒骨");
	}
	public Dog(String name,float price,String type)
	{
		super(name,price,type);
	}
}

class Cat extends Pet
{
	public void eat()
	{
		System.out.println("我喜欢吃鱼");
	}
	public Cat(String name,float price,String type)
	{
		super(name,price,type);
	}
}
//宠物商店
class PetShop
{
	private Pet[] pets = new Pet[3];
	private int count;
	public void add(Pet pet)//添加
	{
		if(count>=pets.length)
		{
			int newlen = (pets.length*3)/2+1;
			pets = Arrays.copyOf(pets,newlen);
		}	
		pets[count] = pet;
		count++;
	}
	public Pet[] getPets()
	{
		Pet[] ps = new Pet[count];
		for(int i=0;i<count;i++)
		{
			ps[i] = pets[i];
		}
		return ps;
	}
	//根据宠物的种类查找宠物信息
	public Pet[] findByType(String type)
	{
		PetShop ps = new PetShop();
		for(int i=0;i<count;i++)
		{
			if(pets[i].type.equals(type))
			{
				ps.add(pets[i]);
			}
		}
	return ps.getPets();
	}
}