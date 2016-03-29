package 集合框架List接口.homework;

public class HomeWork1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		UserService us = new UserService();
		System.out.println("---------添加---------");
		us.add(new User("小白",18,"女"));
		us.add(new User("小黑",19,"男"));
		us.add(new User("小红",17,"女"));
		us.add(new User("小梦",18,"女"));
		System.out.println("-------------输出---------");
		us.print();
		System.out.println("-----------修改---------");
		us.update(new User("小白",19,"男"));
		us.print();
		System.out.println("-------删除---------");
		us.delete("小白");
		us.print();
		System.out.println("-------查找-------");
		User u = us.find("小梦");
		System.out.println(u);
	}

}
