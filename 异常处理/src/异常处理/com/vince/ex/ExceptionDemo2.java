package �쳣����.com.vince.ex;


import java.util.InputMismatchException;
import java.util.Scanner;

//ctrl+dɾ����ǰ��
//alt+/�Զ��������Զ���ȫ  ѡ�к��Զ�������Sysout��
public class ExceptionDemo2 
{
	public static int add()throws Exception
	{
		try 
		{
			Scanner input = new Scanner(System.in);
			System.out.println("�������һ������");
			int num1 = input.nextInt();
			System.out.println("������ڶ�������");
			int num2 = input.nextInt();	
			return num1+num2;
		}
		catch (Exception e)
		{
			// TODO: handle exception
			//System.out.println("������������������");
			//throw e;
			throw new Exception("�ӷ�����ʧ��");
		}
		finally
		{
			System.out.println("�ӷ��������");
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
