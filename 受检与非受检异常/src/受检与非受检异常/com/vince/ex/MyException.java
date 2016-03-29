package 受检与非受检异常.com.vince.ex;
/*
 * 
 */
public class MyException extends RuntimeException
{
	public MyException()
	{
		super();
	}
	public MyException(String message)
	{
		super(message);
	}
}
