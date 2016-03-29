//内部类：静态内部类
//一个静态内部类相当于外部类
public class InnerClassDemo3
{
	public static void main(String[] args)
	{
		Dog.ChildDog child = new Dog.ChildDog();
		child.talk();

		Dog.childTalk();
	}
}

//狗类
class Dog
{
	private String name;
	public Dog(String name)
	{
		this.name = name;
	}
	public void say()
	{
		System.out.println("我是一只狗，主人叫我"+name);
	}

	static class ChildDog 
		{
			public void talk()
			{
				System.out.println("我是一只狗狗");
			}
		}
	public static void childTalk()
	{
		ChildDog c = new ChildDog();
		c.talk();
	}
}

