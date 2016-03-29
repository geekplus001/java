package 集合框架Map接口.map;

public class Person implements Comparable<Person>
{
	private int age;
	private String name;
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(o==null)
		{
			throw new NullPointerException();
		}
		if(this.age<o.age)
			return -1;
		else if(this.age>o.age)
			return 1;
		return 0;
	}
}
