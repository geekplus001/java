package com.vince.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo 
{
	/*
	 * �ֽ��������Ķ�ȡ��ʽ����ÿ�ζ�ȡָ����С���ֽ�
	 */
	public static void read3()
	{
		try
		{
			File f = new File("f:\\1.txt");
			//����һ�� �ֽ�����������
			InputStream in = new FileInputStream(f);
			//�����ļ��Ĵ�С�����ֽ�����
			byte[] bytes = new byte[10];
			int len = -1;//ÿ�ζ�ȡ��ʵ�ʳ���
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
	 * �ֽ��������Ķ�ȡ��ʽ����һ���Զ�ȡ�����ֽ�
	 */
	public static void read2()
	{
		try
		{
			File f = new File("f:\\1.txt");
			//����һ�� �ֽ�����������
			InputStream in = new FileInputStream(f);
			//�����ļ��Ĵ�С�����ֽ�����
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
	 * �Լ��������Ķ�ȡ��ʽһ��ÿ�ζ�ȡһ���ֽ�
	 */
	public static void read1()
	{
		try
		{
			//����һ�� �ֽ�����������
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
