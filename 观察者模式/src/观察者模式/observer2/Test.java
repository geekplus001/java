package �۲���ģʽ.observer2;

public class Test 
{

	public static void main(String[] args) 
	{
		Doll doll = new Doll(3000);
		
		Person p1 = new Person("С��");
		Person p2 = new Person("С��");
		
		doll.addObserver(p1);
		doll.addObserver(p2);
		
		System.out.println("��һ�ִ�����");
		doll.setPrice(2988);
		System.out.println("�ڶ��ִ�����");
		doll.setPrice(2698);
		System.out.println("�����ִ�����");
		doll.setPrice(1998);
	}

}
