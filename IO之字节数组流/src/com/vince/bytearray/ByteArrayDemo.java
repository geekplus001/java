package com.vince.bytearray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/*
 * �ֽ�������
 */

public class ByteArrayDemo
{
	/*
	 * ʹ��ByteArrayOutputStreamд����
	 */
	public static void write()
	{
		//����һ���ֽ��������������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String info = "ˮ������������飻ѧjava,û���粻�У�";
		try
		{
			//�����������������
			baos.write(info.getBytes());
			baos.write(10);
//			baos.toByteArray();
			baos.close();//�ر���Ч
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//����һ���ֽ����鹹��һ���ֽ�����������
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		byte[] bytes = new byte[512];
		int len = -1;
		StringBuilder sb = new StringBuilder();
		try 
		{
			while((len=bais.read(bytes))!=-1)
			{
				sb.append(new String(bytes,0,len));
			}
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sb);
	}

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		write();
	}

}
