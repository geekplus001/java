package �쳣����.com.vince.ex;

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
			System.out.println("�����������");
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
		int c = 0;
		//���п��ܷ����쳣�Ĵ���ηŵ�try���У�ͨ��catch�������쳣����
		try
		{
			 c = a/b;
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();//���ջ�е��쳣��Ϣ
			System.out.println("���������쳣");
		}
		catch(Exception e)
		{
			System.out.println("�������쳣");
		}
		finally
		{
			//finally �� final ������
			//��Դ���ͷ�
			System.out.println("finall:����try�е�����Ƿ�����쳣������ִ��finall����");
		}
		System.out.println(c);
		System.out.println("-------------------");
		
		System.out.println(div(10, 3));
	}

}
