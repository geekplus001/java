package 枚举.enumtest;
/*
 * 使用普通类模拟实现枚举
 */

public abstract class Controller
{
	private Controller()
	{
		
	}
	
	public static final Controller ON = new Controller()
	{

		@Override
		public Controller downAction()
		{
			return OFF;
		}
		public String toString()
		{
			return "ON";
		}
	};
	public static final Controller OFF = new Controller()
	{

		@Override
		public Controller downAction() 
		{
			return ON;
		}
		public String toString()
		{
			return "OFF";
		}
	};
	
	public abstract Controller downAction();
}
