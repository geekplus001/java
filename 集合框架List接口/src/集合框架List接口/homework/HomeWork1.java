package ���Ͽ��List�ӿ�.homework;

public class HomeWork1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		UserService us = new UserService();
		System.out.println("---------���---------");
		us.add(new User("С��",18,"Ů"));
		us.add(new User("С��",19,"��"));
		us.add(new User("С��",17,"Ů"));
		us.add(new User("С��",18,"Ů"));
		System.out.println("-------------���---------");
		us.print();
		System.out.println("-----------�޸�---------");
		us.update(new User("С��",19,"��"));
		us.print();
		System.out.println("-------ɾ��---------");
		us.delete("С��");
		us.print();
		System.out.println("-------����-------");
		User u = us.find("С��");
		System.out.println(u);
	}

}
