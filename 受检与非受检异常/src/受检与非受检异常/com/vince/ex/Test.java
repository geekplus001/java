package 受检与非受检异常.com.vince.ex;

public class Test
{
	public static void test()//非受检异常可以不throws
	{
		//...
		throw new MyException("运行时异常"); 
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		test();//不用try 
	}

}
