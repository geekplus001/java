package ���Ͽ��Set�ӿ�.set;

public class HomeWork1 
{
	

	public static void main(String[] args)
	{
		CatService cs = new CatService();
		System.out.println("---------���---------");
		cs.add(new Cat("С��",4));
		cs.add(new Cat("С��",2));
		cs.add(new Cat("С��",3));
		cs.print();
		System.out.println("----------�޸�---------");
		cs.update(new Cat("С��",5));
		cs.print();
		System.out.println("--------ɾ��-------");
	}
}
