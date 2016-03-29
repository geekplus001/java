package com.vince.charstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class ReaderDemo 
{
	/*
	 * 字符输入流方式一：使用指定大小的字符数组输入
	 */
	public static void reader1()
	{
		File f = new File("f:\\董学姐.txt");
		try 
		{
			Reader in = new FileReader(f);
			char[] cs = new char[2];
			int len = -1;
			StringBuilder sb = new StringBuilder();
			while((len=in.read(cs))!=-1)
			{
				sb.append(new String(cs,0,len));
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
	 * 使用字节流读取文本文件
	 */
	public static void byteReader()
	{
		File f = new File("f:\\董学姐.txt");
		try 
		{
			InputStream in = new FileInputStream(f);
			byte [] bytes = new byte[2];
			int len = -1;
			StringBuilder sb = new StringBuilder();
			while((len=in.read(bytes))!=-1)
			{
				sb.append(new String(bytes,0,len));
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

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		byteReader();
		reader1();
	}

}
