package com.vince.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo 
{

	/*
	 * 字节输出流的方式一：每次输出一个字节
	 */
	public static void write1()
	{
		try
		{
			//创建一个文件字节输出流对像
			OutputStream out = new FileOutputStream("f:\\1.txt");
			
			String info = "hello,IO";
			byte[] bytes = info.getBytes();
			for(int i=0;i<bytes.length;i++)
			{
				out.write(bytes[i]);
			}
			
			//关闭流
			out.close();
//			out.write(1);//向文件中输出
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
	 * 字节输出流的方式二：每次输出指定大小字节
	 */
	public static void write2()
	{
		try
		{
			//创建一个文件字节输出流对像(参数true表示追加)
			OutputStream out = new FileOutputStream("f:\\1.txt",true);
			
//			String info = "hello,xiaobai";
			String info = "one car come,one car go,two car pengpeng,one car die!";
			byte[] bytes = info.getBytes();
			out.write(bytes);//向文件中输出
			//关闭流
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
//		write1();
		write2();
		System.out.println("success");
	}

}
