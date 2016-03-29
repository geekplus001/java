package 集合框架Set接口.set;

public class HomeWork1 
{
	

	public static void main(String[] args)
	{
		CatService cs = new CatService();
		System.out.println("---------添加---------");
		cs.add(new Cat("小白",4));
		cs.add(new Cat("小莉",2));
		cs.add(new Cat("小花",3));
		cs.print();
		System.out.println("----------修改---------");
		cs.update(new Cat("小白",5));
		cs.print();
		System.out.println("--------删除-------");
	}
}
