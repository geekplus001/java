package com.vince.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamDemo
{
	/*
	 * ���ļ��ж�ȡ��������
	 */
	public static void readerObject2()
	{
		try
		{
			InputStream in = new FileInputStream("f:\\obj.tmp");
			//�����ֽ�����������һ��������
			ObjectInputStream ois = new ObjectInputStream(in);
			
			//��ȡһ������
			Dog[] dogs = (Dog[])ois.readObject();
			
			ois.close();
			in.close();
			
			for(Dog dog:dogs)
			{
				System.out.println(dog);
			}
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * ��һ��������л����ļ���
	 */
	public static void writerObject2()
	{
		OutputStream out;
		try 
		{
			out = new FileOutputStream("f:\\obj.tmp");
			//�����ֽ����������һ��������
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			Dog[] dogs = {new Dog("С��",8),new Dog("С��",2),new Dog("С��",4)};
			
//		   Dog dog1 = new Dog("С��",8);
//		   Dog dog2 = new Dog("С��",2);
//		   Dog dog3 = new Dog("С��",4);
//		   oos.writeObject(dog1);//���ļ�д�����
//		   oos.writeObject(dog2);//���ļ�д�����
//		   oos.writeObject(dog3);//���ļ�д�����
		   oos.writeObject(dogs);
		   oos.close();
		   out.close();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	/*
	 * ʹ��ObjectInputStream��ȡ�ļ��еĶ���
	 */
	public static void readerObject()
	{
		try
		{
			InputStream in = new FileInputStream("f:\\obj.tmp");
			//�����ֽ�����������һ��������
			ObjectInputStream ois = new ObjectInputStream(in);
			
			//��ȡһ������
			int num  = ois.readInt();
			//��ȡһ������
			Dog dog = (Dog)ois.readObject();
			
			ois.close();
			in.close();
			
			System.out.println("num="+num);
			System.out.println(dog);
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * ʹ��ObjectOutputStream�Ѷ���д���ļ���
	 */
	public static void writerObject()
	{
		OutputStream out;
		try 
		{
			out = new FileOutputStream("f:\\obj.tmp");
			//�����ֽ����������һ��������
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			//�������
		   oos.writeInt(106);
		   Dog dog = new Dog("С��",8);
		   oos.writeObject(dog);//���ļ�д�����
		   
		   oos.close();
		   out.close();
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		writerObject();
//		readerObject();
		writerObject2();
		readerObject2();
	}

}
