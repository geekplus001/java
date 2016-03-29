package com.vince.bytearray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/*
 * 字节数组流
 */

public class ByteArrayDemo
{
	/*
	 * 使用ByteArrayOutputStream写操作
	 */
	public static void write()
	{
		//创建一个字节数组输出流对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String info = "水不在深，有龙则灵；学java,没威哥不行！";
		try
		{
			//往缓冲区中输出数据
			baos.write(info.getBytes());
			baos.write(10);
//			baos.toByteArray();
			baos.close();//关闭无效
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//根据一个字节数组构造一个字节数组输入流
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
