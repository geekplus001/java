package com.vince.string;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringStreamDemo
{
	public static void writer()
	{
		//写入操作
		StringWriter sw = new StringWriter();
		sw.write("锄禾日当午，泡妞不怕苦，只要真心在，不怕没有菜");
		
		//--------------------------------------------------
		
		//读取操作，根据一个字符串去构造一个字符串输入流
		StringReader sr = new StringReader(sw.toString());
		
		char [] cs = new char[10];
		int len = -1;
		try
		{
			while((len=sr.read(cs))!=-1)
			{
				System.out.print(new String(cs,0,len));
			}
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
		writer();

	}

}
