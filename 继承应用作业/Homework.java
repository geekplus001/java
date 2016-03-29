import java.util.Arrays;

public class Homework
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog("С��",2000.0f,"��");
		Dog d2 = new Dog("С��",1000.0f,"��");
		Dog d3 = new Dog("С��",800.0f,"��");
		Cat c1 = new Cat("��ķ",200.0f,"è");
		Cat c2 = new Cat("����",1200.0f,"è");

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
		System.out.println("----------���ҹ�---------");
		Pet[] pets = ps.findByType("��");
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
	//��ʳ����	
	public void eat()
	{
		System.out.println(type+"�Է���");
	}
	public String getInfo()
	{
		return "����һֻ"+type+"��С����Ƕ�����"+name+"��ϲ���ҾͰ��Ҵ��߰ɣ�ֻ��RMB:"+price;
	}
}

class Dog extends Pet
{
	//��ʳ����
	public void eat()
	{
		System.out.println("��ϲ���д����");
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
		System.out.println("��ϲ������");
	}
	public Cat(String name,float price,String type)
	{
		super(name,price,type);
	}
}
//�����̵�
class PetShop
{
	private Pet[] pets = new Pet[3];
	private int count;
	public void add(Pet pet)//���
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
	//���ݳ����������ҳ�����Ϣ
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