package 对象的克隆.com.vince.clone;
/*
 * 一个类要想实现克隆功能，必须：
 * 1、实现Cloneable接口，该接口是一个标记接口
 * 2、重写object类中的clone方法
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
	
	//重写Object类的clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


}
