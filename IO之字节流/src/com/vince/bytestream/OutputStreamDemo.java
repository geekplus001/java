package com.vince.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo 
{

	/*
	 * �ֽ�������ķ�ʽһ��ÿ�����һ���ֽ�
	 */
	public static void write1()
	{
		try
		{
			//����һ���ļ��ֽ����������
			OutputStream out = new FileOutputStream("f:\\1.txt");
			
			String info = "hello,IO";
			byte[] bytes = info.getBytes();
			for(int i=0;i<bytes.length;i++)
			{
				out.write(bytes[i]);
			}
			
			//�ر���
			out.close();
//			out.write(1);//���ļ������
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
	 * �ֽ�������ķ�ʽ����ÿ�����ָ����С�ֽ�
	 */
	public static void write2()
	{
		try
		{
			//����һ���ļ��ֽ����������(����true��ʾ׷��)
			OutputStream out = new FileOutputStream("f:\\1.txt",true);
			
//			String info = "hello,xiaobai";
			String info = "one car come,one car go,two car pengpeng,one car die!";
			byte[] bytes = info.getBytes();
			out.write(bytes);//���ļ������
			//�ر���
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
