package �۲���ģʽ.observer;
/*
 * ����Ĺ۲��߶���
 */
public class Person implements Observer 
{
	private String name;
	public Person(String name) 
	{
		this.name = name;
	}
	@Override
	public void update(float price) 
	{
		System.out.println(name+"��ע�����޼۸��Ѹ���Ϊ��"+price);
	}

}
