package 集合框架Set接口.set;

public class Emp implements Comparable<Emp>
{
	private int age;
	private String name;
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + "]";
	}
	public Emp(String name,int age ) {
		super();
		this.age = age;
		this.name = name;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public int compareTo(Emp o) 
	{
		if(o==null)
		{
			throw new NullPointerException("参数不能为空");
		}
		if(this.age<o.age)
		{
			return -1;
		}
		else if (this.age>o.age)
		{
			return 1;
		}
		return 0;
	}
}
