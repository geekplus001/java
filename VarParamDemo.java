//�ɱ������foreach ��JDK1.5�����ԣ�    
//һ��������ֻ�ܳ���һ���ɱ����    �ҿɱ�������������һ��

public class VarParamDemo
{
	public static void main(String[] args)
	{
		String[] names = {"����","����","����","����","���"};
		method1(names);
		method2("����","����","����","����");
	}

	public static void method3(int num,String ... names)
	{
		
	}

	public static void method2(String ... names)
	{
		for(String name:names)
		{
			System.out.println(name+" ");
		}
	}	

	public static void method1(String[] names)
	{
		for(String name:names)
		{
			System.out.println(name+" ");
		}
	}
}