package 字节字符转换流.com.vince.convertstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ConvertStreamDemo 
{
	//使用转换流把字节流转换成字符流
	public static void reader()
	{
		try
		{
			//构造一个字节输入流
			InputStream in = new FileInputStream("f:\\3.txt");
			//通过字节输入流、构造一个字符输入流
			Reader reader = new InputStreamReader(in);
			
			char [] cs = new char[5];
			int len = -1;
			StringBuilder sb = new StringBuilder();
			while((len=reader.read(cs))!=-1)
			{
				sb.append(new String(cs,0,len));
			}
			reader.close();
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
	
	//使用转换流，把字符流转换成字节流输出
	public static void writer()
	{
		try
		{
			//构造一个字节输出流
			OutputStream out = new FileOutputStream("f:\\3.txt");
			
			String info = "山不在高，有仙则名；学java，没威哥不行";
			//通过字节输出流去构造一个字符输出流
			Writer writer = new OutputStreamWriter(out);
			
			writer.write(info);
			
			writer.close();
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
		writer();
		reader();
	}

}
