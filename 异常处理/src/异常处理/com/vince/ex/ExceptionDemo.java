package 异常处理.com.vince.ex;

public class ExceptionDemo
{
	public static int div(int a,int b)
	{
		int result = 0;
		
		try 
		{
			result = a/b;
			return result;
		}
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		
		finally
		{
			System.out.println("除法运算结束");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c = 0;
		//把有可能发生异常的代码段放到try块中，通过catch语句进行异常捕获
		try
		{
			 c = a/b;
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();//输出栈中的异常信息
			System.out.println("算数运算异常");
		}
		catch(Exception e)
		{
			System.out.println("发生了异常");
		}
		finally
		{
			//finally 与 final 有区别
			//资源的释放
			System.out.println("finall:不管try中的语句是否出现异常，都会执行finall代码");
		}
		System.out.println(c);
		System.out.println("-------------------");
		
		System.out.println(div(10, 3));
	}

}
