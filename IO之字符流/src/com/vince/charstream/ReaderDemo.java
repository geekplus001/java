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
	 * �ַ���������ʽһ��ʹ��ָ����С���ַ���������
	 */
	public static void reader1()
	{
		File f = new File("f:\\��ѧ��.txt");
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
	 * ʹ���ֽ�����ȡ�ı��ļ�
	 */
	public static void byteReader()
	{
		File f = new File("f:\\��ѧ��.txt");
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
