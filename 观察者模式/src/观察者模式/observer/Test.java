package �۲���ģʽ.observer;

public class Test 
{

	public static void main(String[] args)
	{
		//����һ�����۲��߶���
		Subject doll = new Doll(3000); 
		Person p1 = new Person("С��");
		Person p2 = new Person("С��");
		//ע���Ϊһ���۲���
		doll.registerObserver(p1);
		doll.registerObserver(p2);
		
		System.out.println("��һ�ִ�����");
	    ((Doll) doll).setPrice(2698);
	    System.out.println("�ڶ��ִ���");
	    ((Doll) doll).setPrice(2299);
	    System.out.println("�����ִ���:");
	    ((Doll) doll).setPrice(1998);
	    
	    doll.removeObserver(p2);
	    System.out.println("�����ִ���:");
	    ((Doll) doll).setPrice(1098);
	}

}
