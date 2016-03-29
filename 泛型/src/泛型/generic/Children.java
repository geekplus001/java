package ����.generic;

public class Children <T>
{
	private String name;
	private T age; //T:��ʾ���ͣ���ָ��������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Children [name=" + name + ", age=" + age + "]";
	}
	public Children(String name, T age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Children() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
