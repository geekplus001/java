package 观察者模式.observer2;

public class Test 
{

	public static void main(String[] args) 
	{
		Doll doll = new Doll(3000);
		
		Person p1 = new Person("小白");
		Person p2 = new Person("小黑");
		
		doll.addObserver(p1);
		doll.addObserver(p2);
		
		System.out.println("第一轮促销：");
		doll.setPrice(2988);
		System.out.println("第二轮促销：");
		doll.setPrice(2698);
		System.out.println("第三轮促销：");
		doll.setPrice(1998);
	}

}
