package com.vince.charstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo
{
	/*
	 * �ַ��������ʽһ�����ַ����鷽ʽ���
	 */
	public static void writer1()
	{
		File f = new File("f:\\2.txt");
		try 
		{
			//����һ���ַ����������(true��ʾ׷�����)
			Writer out = new FileWriter(f,true);
			String info = "good good study,day day up!";
			//���ļ������
//			out.write(info.toCharArray());
			out.write(info);
			out.close();
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
		writer1();
	}

}
