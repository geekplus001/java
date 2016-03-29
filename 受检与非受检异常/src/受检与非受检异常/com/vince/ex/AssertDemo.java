package 受检与非受检异常.com.vince.ex;

public class AssertDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x = 11;
		
		assert x==10:"结果不正确";
	}
	//java -ea AssertDemo(命令行中加参数)
}
