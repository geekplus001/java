package ����.generic;

public class GenericDemo
{

	public static void main(String[] args)
	{
		Children<Integer> c1 = new Children<Integer>("СС��",3);
		Children<Float> c2 = new Children<Float>("СС��",1.6f);
		Children<String> c3 = new Children<String>("СС��","��");
		
		Children<String> c4 = new Children("СС��","��");
		Children c5 = new Children<String>("�Ǻ�","��");
		
		//�������鲻��ʹ�÷���
//		Children<String> [] cs = new Children<String>{};
		Children c6 = new Children();//��ʾ�������ͣ���ŷ��Objec��һ����⣩
		
		
		int age1 = c1.getAge();
		float age2  = c2.getAge();
		String age3 = c3.getAge();
		
		
		Children<Integer> c7 = new Children<Integer>();
		Children<String> c8 = new Children<String>();
		//���󣬲��������Ͳ�ͬ�����������ܻ��ำֵ
		//c8 =c7;
		print(c1);
		print(c2);
		
		
		
		//ʹ�÷�������
//		Children2<String> c9 = new Children2<Number>();
//		Children2<Integer> c10 = new Children2<Integer>();
		
		//ʹ�÷�������
//		fun(c3);
		
		//ʹ�÷��ͷ���
		String [] names = {"С��","���","�տ�"};
		names = fun2(names,0,2);
		for(String s:names)
		{
			System.out.println(s);
		}
	}
	
	//���巺������
	public static void fun(Children<? super String> c)
	{
		System.out.println(c.getAge());
	}
	
	
	
	
	//ʹ��ͨ��������������ֻ����������޸�
	public static void print(Children<?> c)
	{
		System.out.println("�ҵ������ǣ�"+c.getAge());;
	}
	
	//���巺�ͷ���
	public static <T> T[] fun2(T[] array,int i,int t)
	{
		T temp = array[i];
		array[i] = array[t];
		array[t] = temp;
		return array;
	}

}
