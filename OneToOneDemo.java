public class OneToOneDemo
{
	public static void main(String[] args)
	{
		Husband h = new Husband("小白",'男');
		Wife w = new Wife("星星",19);
		//关联关系
		h.wife = w;
		w.husband = h;

		System.out.println("我是"+h.name+"，我的妻子是："+h.wife.name+"，她今年"+h.wife.age+"岁了");
	}
}

//丈夫类

class Husband
{
	String name;
	char sex;
	Wife wife;//关联妻子类
	//getter/setter...
	public Husband(){}
	public Husband(String name,char sex)
	{
		this.name = name;
		this.sex = sex;
	}
}

//妻子类

class Wife
{
	String name;
	int age;
	Husband husband;//关联丈夫类
	//getter/setter...
	public Wife(){}
	public Wife(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}