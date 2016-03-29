package �������.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RefDemo
{

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		Person p1 = new Person("С��",18,'��');
		Person p2 = new Person("С��",19,'Ů');
		
		//һ��Class�������һ���ֽ��룬��ͬ���͵Ķ���õ����ֽ��������ͬһ�����������ֻ�����һ�Σ�
		//����Class����ķ�ʽһ��
		Class personClass1 = p1.getClass();
		Class personClass2 = p2.getClass();
		System.out.println(personClass1==personClass2);
		
		//����Class����ķ�ʽ2��
		Class personClass3 = Person.class;
		System.out.println(personClass1==personClass3);
		//int.class
		//void.class
		
		//����Class����ķ�ʽ3��
		Class personClass4 = Class.forName("�������.reflection.Person");
		System.out.println(personClass1==personClass4);
		
		System.out.println(personClass1);
		
		
		//-----------ͨ������Ϣʵ��������--------------
		//�����޲������췽��
		try 
		{
			//��û���޲������췽�����ᱨ�쳣
			Person p3 = (Person)personClass4.newInstance();
			System.out.println(p3);
		}
		catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�����в������췽��
		Constructor [] cs = personClass4.getConstructors();//��ȡ��ǰ������й��췽��
		for(Constructor c:cs)
		{
			System.out.println(c.getName());
			Class [] paramTypes = c.getParameterTypes();
			for(Class class1:paramTypes)
			{
				System.out.println(class1);
			}
			System.out.println("------------------------");
		}
		
		Person p4=null;
		try 
		{
			Constructor c1 = personClass4.getConstructor(
					String.class,int.class,char.class);
		    p4 = (Person)c1.newInstance("С��",17,'Ů');
			System.out.println(p4);
		} 
		catch (NoSuchMethodException e) 
		{
			e.printStackTrace();
		} 
		catch (SecurityException e) 
		{
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//----------------�������Ϣ-------------
		System.out.println("������"+personClass4.getPackage());
		System.out.println("������"+personClass1.getName());
		//�������У��̳С��ӿڣ������ķ�����public��
		Method [] m1 = personClass1.getMethods();
		for(int i=0;i<m1.length;i++)
		{
			Method m = m1[i];
			System.out.println("��������"+m.getName());;
		}
		
		System.out.println("------------------------");
		Method [] m2 = personClass1.getDeclaredMethods();
		for(int i=0;i<m2.length;i++)
		{
			Method m = m2[i];
			System.out.println("˽�з�������     "+Modifier.toString(m.getModifiers())+"    "+m.getName());;
		}
		
		System.out.println("-----------��ȡ������Ϣ------------");
		//��������
		Field [] f1 = personClass1.getFields();
		for(int i=0;i<f1.length;i++)
		{
			System.out.println(f1[i].getName());
		}
		System.out.println("--------------------------");
		
		Field [] f2 = personClass1.getDeclaredFields();
		for(int i=0;i<f2.length;i++)
		{
			System.out.println(f2[i].getName());
		}
		
		System.out.println("---------------���÷���������--------------");
		System.out.println("--------------���÷���-------------");
		Method setNameMethod = personClass1.getMethod("setName", String.class);
		//���÷���
		setNameMethod.invoke(p4, "�Ǻ�");//p4.setName("�Ǻ�");
		System.out.println(p4);
		//����˽�з���
		Method sayMethod = personClass1.getDeclaredMethod("say");
		sayMethod.setAccessible(true);//���Լ��������η�
		sayMethod.invoke(p4);
		
		
		
		System.out.println("-------------��������-------------");
		try {
			Field ageField = personClass1.getDeclaredField("age");
			ageField.setAccessible(true);
			System.out.println(ageField.get(p4));//p4 ��age����ֵ��ȡ
			ageField.set(p4, 18);//��p4�����age���Ը�ֵ
			System.out.println(p4);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

}
