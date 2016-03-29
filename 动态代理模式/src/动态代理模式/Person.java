package 动态代理模式;
/*
 * 被代理类
 */
public class Person implements Subject
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public void miai()
	{
		System.out.println(name+"正在相亲中...");
	}
}
