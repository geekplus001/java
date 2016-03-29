package com.vince.print;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo 
{
	/*
	 * PrintWriter
	 */
	public static void print2()
	{
		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\w.txt"));
			PrintWriter pw = new PrintWriter(bw);
			pw.print("\r\n");//����س��ӻ��з�
			pw.println(105);
			pw.print("\n");
			pw.println("С�׼���Ӫ��");
			
			pw.flush();
			bw.close();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*
	 * PrintStream
	 */
	public static void print()
	{
		try 
		{
			OutputStream out = new FileOutputStream("f:\\1.txt");
			BufferedOutputStream bos = new BufferedOutputStream(out);
			//�����ܿɴ�ӡ������
			PrintStream ps = new PrintStream(bos);
			ps.println(3.14f);
			ps.println(188);
			ps.println(true);
			ps.println("�㶫һѧУ����Ů��������ɫ�����ƿ����֣���˿������");
			ps.flush();
			ps.close();
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
//		print();
		print2();
	}

}
