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
	 * 从文件中读取对象数组
	 */
	public static void readerObject2()
	{
		try
		{
			InputStream in = new FileInputStream("f:\\obj.tmp");
			//根据字节输入流构造一个对象流
			ObjectInputStream ois = new ObjectInputStream(in);
			
			//读取一个对象
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
	 * 把一组对象序列化到文件中
	 */
	public static void writerObject2()
	{
		OutputStream out;
		try 
		{
			out = new FileOutputStream("f:\\obj.tmp");
			//根据字节输出流构造一个对象流
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			Dog[] dogs = {new Dog("小白",8),new Dog("小黑",2),new Dog("小红",4)};
			
//		   Dog dog1 = new Dog("小白",8);
//		   Dog dog2 = new Dog("小黑",2);
//		   Dog dog3 = new Dog("小红",4);
//		   oos.writeObject(dog1);//想文件写入对象
//		   oos.writeObject(dog2);//想文件写入对象
//		   oos.writeObject(dog3);//想文件写入对象
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
	 * 使用ObjectInputStream读取文件中的对象
	 */
	public static void readerObject()
	{
		try
		{
			InputStream in = new FileInputStream("f:\\obj.tmp");
			//根据字节输入流构造一个对象流
			ObjectInputStream ois = new ObjectInputStream(in);
			
			//读取一个整数
			int num  = ois.readInt();
			//读取一个对象
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
	 * 使用ObjectOutputStream把对象写入文件中
	 */
	public static void writerObject()
	{
		OutputStream out;
		try 
		{
			out = new FileOutputStream("f:\\obj.tmp");
			//根据字节输出流构造一个对象流
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			//输出数据
		   oos.writeInt(106);
		   Dog dog = new Dog("小白",8);
		   oos.writeObject(dog);//想文件写入对象
		   
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
