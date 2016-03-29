package com.vince.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


public class BufferedStreamDemo
{
	/*
	 * 使用缓冲流实现读取操作
	 */
	public static void reader()
	{
		try
		{
			Reader r = new FileReader("f:\\董学姐.txt");
			//根据字符输入构造一个字符缓冲流
			BufferedReader br = new BufferedReader(r);
			char [] cs = new char[5];
			int len = -1;
			StringBuilder sb = new StringBuilder();
			while((len=br.read(cs))!=-1)
			{
				sb.append(new String(cs,0,len));
			}
			br.close();
			r.close();
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
	 * 使用缓冲流是实现写入操作
	 */
	public static void writer()
	{
			try 
			{
				Writer r = new FileWriter("f:\\5.txt");
				//根据字符输出流构造一个字符缓冲流
				BufferedWriter bw = new BufferedWriter(r);
				bw.write("小白，怎么了，这是，被驴踢了吧");
				bw.flush();
				bw.close();
				r.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void write()
	{
		try
		{
			OutputStream out =new FileOutputStream("f:\\4.txt");
			//根据字节输出流构造一个字节缓冲流
			BufferedOutputStream bos = new BufferedOutputStream(out);
			
			String info = "山不在高，有仙则名；学java没威哥不行！";
			bos.write(info.getBytes());
			bos.flush();//刷新缓冲区
			bos.close();
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
	 * 使用字节缓冲流进行读取操作
	 */
	public static void input()
	{
		try
		{
			InputStream in = new FileInputStream("f:\\3.txt");
			//根据字节输入流构造一个字节缓冲流
			BufferedInputStream bis = new BufferedInputStream(in);
			Reader r = new InputStreamReader(bis);
			char [] cs = new char[5];
			int len = -1;
			StringBuilder sb = new StringBuilder();
			while((len=r.read(cs))!=-1)
			{
				sb.append(new String(cs,0,len));
			}
			r.close();
			bis.close();
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
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		input();
//		write();
//		reader();
		writer();
	}

}
