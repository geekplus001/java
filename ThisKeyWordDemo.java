/**
	this关键字
	调用类中的属性
	调用类中的方法或构造方法
	表示当前对象
*/

public class ThisKeyWordDemo
{
	public static void main(String[] args)
	{
		Bear b1 = new Bear();
	}
}


class Bear
{
	private String name;
	private char sex;

	public Bear()
	{
		this("熊大");
	}

	public Bear(String name)
	{
		this(name,'公');
	}

	public Bear(String name,char sex)
	{
		this.name = name;
		this.sex = sex;
		//调用本类中的方法
		this.bite();
	}

	public void bite()//方法第一个单词小写  构造方法大写（和类名相同）
	{
		System.out.println("我是"+sex+"熊--"+name);	
	}
}