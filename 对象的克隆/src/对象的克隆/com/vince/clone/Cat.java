package ����Ŀ�¡.com.vince.clone;
/*
 * һ����Ҫ��ʵ�ֿ�¡���ܣ����룺
 * 1��ʵ��Cloneable�ӿڣ��ýӿ���һ����ǽӿ�
 * 2����дobject���е�clone����
 */

public class Cat implements Cloneable
{

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//��дObject���clone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


}
