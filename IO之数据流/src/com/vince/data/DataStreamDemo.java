package com.vince.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamDemo 
{
	public static void read()
	{
		try 
		{
			InputStream in = new FileInputStream("f:\\3.txt");
			//根据字节输入流构造一个数据输入流
			DataInputStream dis = new DataInputStream(in);
			int flag = dis.readInt();//读取一个整数
			String info = dis.readUTF();//读取一个UTF编码的字符串
			
			dis.close();
			in.close();
			
			System.out.println("flag="+flag);
			System.out.println("info="+info);
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
	
	public static void write()
	{
		try 
		{
			OutputStream out = new FileOutputStream("f:\\3.txt");
			//根据字节输出流构造一个数据输出流
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeInt(1);//输出一个整数
			dos.writeUTF("床前明月光，地上鞋两双，此处省略十个字");
			dos.close();
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
//		write();
		read();
	}

}
