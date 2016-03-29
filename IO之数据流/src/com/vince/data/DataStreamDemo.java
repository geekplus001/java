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
			//�����ֽ�����������һ������������
			DataInputStream dis = new DataInputStream(in);
			int flag = dis.readInt();//��ȡһ������
			String info = dis.readUTF();//��ȡһ��UTF������ַ���
			
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
			//�����ֽ����������һ�����������
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeInt(1);//���һ������
			dos.writeUTF("��ǰ���¹⣬����Ь��˫���˴�ʡ��ʮ����");
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
