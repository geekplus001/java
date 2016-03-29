package com.vince.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo 
{
	/*
	 * 字节输入流的读取方式三：每次读取指定大小的字节
	 */
	public static void read3()
	{
		try
		{
			File f = new File("f:\\1.txt");
			//构造一个 字节输入流对象
			InputStream in = new FileInputStream(f);
			//根据文件的大小构造字节数组
			byte[] bytes = new byte[10];
			int len = -1;//每次读取的实际长度
			StringBuilder sb = new StringBuilder();
			while((len = in.read(bytes))!=-1)
			{
				sb.append(new String(bytes, 0, len));
			}
			in.close();
			
			System.out.println(sb);
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
	 * 字节输入流的读取方式二：一次性读取所有字节
	 */
	public static void read2()
	{
		try
		{
			File f = new File("f:\\1.txt");
			//构造一个 字节输入流对象
			InputStream in = new FileInputStream(f);
			//根据文件的大小构造字节数组
			byte[] bytes = new byte[(int)f.length()];
			int len = in.read(bytes);
			System.out.println(new String(bytes));
			System.out.println("len="+len);
			in.close();
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
	 * 自己输入流的读取方式一：每次读取一个字节
	 */
	public static void read1()
	{
		try
		{
			//构造一个 字节输入流对象
			InputStream in = new FileInputStream("f:\\1.txt");
			int b = -1;
			while((b=in.read())!=-1)
			{
				System.out.print((char)b);
			}
			in.close();
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
		read1();
//		System.out.println("success");
		read2();
	}

}
