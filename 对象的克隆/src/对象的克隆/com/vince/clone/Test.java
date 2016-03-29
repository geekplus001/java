package 对象的克隆.com.vince.clone;
/*
 * 要创建一组类似的对象，
 * 从性能上考虑，就可以使用克隆技术
 */
public class Test 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Cat c = new Cat("小白",3);
		System.out.println("c="+c);
		try 
		{
			Cat c1 = (Cat)c.clone();
			System.out.println("c1="+c1);
		} 
		catch (CloneNotSupportedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
