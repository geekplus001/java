package 自定义异常类.com.vince.ex;

public class LogicException extends Exception
{
	public LogicException()
	{
		super();
	}
	public LogicException(String errorMessage)
	{
		super(errorMessage);
	}
}
