package 异常处理.com.vince.ex;


import java.util.InputMismatchException;
import java.util.Scanner;

//ctrl+d删除当前行
//alt+/自动导包和自动补全  选中后自动包含到Sysout里
public class ExceptionDemo2 
{
	public static int add()throws Exception
	{
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.println("请输入第一个数：");
			int num1 = input.nextInt();
			System.out.println("请输入第二个数：");
			int num2 = input.nextInt();	
			return num1+num2;
		}
		catch (Exception e)
		{
			// TODO: handle exception
			//System.out.println("输入有误，请输入整数");
			//throw e;
			throw new Exception("加法运算失败");
		}
		finally
		{
			System.out.println("加法运算结束");
		}
	}

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(add());
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
