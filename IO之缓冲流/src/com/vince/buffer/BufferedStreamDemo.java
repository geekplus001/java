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
	 * ʹ�û�����ʵ�ֶ�ȡ����
	 */
	public static void reader()
	{
		try
		{
			Reader r = new FileReader("f:\\��ѧ��.txt");
			//�����ַ����빹��һ���ַ�������
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
	 * ʹ�û�������ʵ��д�����
	 */
	public static void writer()
	{
			try 
			{
				Writer r = new FileWriter("f:\\5.txt");
				//�����ַ����������һ���ַ�������
				BufferedWriter bw = new BufferedWriter(r);
				bw.write("С�ף���ô�ˣ����ǣ���¿���˰�");
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
			//�����ֽ����������һ���ֽڻ�����
			BufferedOutputStream bos = new BufferedOutputStream(out);
			
			String info = "ɽ���ڸߣ�����������ѧjavaû���粻�У�";
			bos.write(info.getBytes());
			bos.flush();//ˢ�»�����
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
	 * ʹ���ֽڻ��������ж�ȡ����
	 */
	public static void input()
	{
		try
		{
			InputStream in = new FileInputStream("f:\\3.txt");
			//�����ֽ�����������һ���ֽڻ�����
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
