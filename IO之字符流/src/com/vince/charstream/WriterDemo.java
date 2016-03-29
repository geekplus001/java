package com.vince.charstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo
{
	/*
	 * 字符输出流方式一：以字符数组方式输出
	 */
	public static void writer1()
	{
		File f = new File("f:\\2.txt");
		try 
		{
			//构造一个字符输出流对象(true表示追加输出)
			Writer out = new FileWriter(f,true);
			String info = "good good study,day day up!";
			//向文件中输出
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
