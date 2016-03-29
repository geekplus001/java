package 自定义异常类.com.vince.homework;
/*
 * 自定义异常类
 */
public class LogicException extends Exception 
{
	public LogicException()
	{
		super();
	}
	public LogicException(String s)
	{
		super(s);
	}
}
