package �ֽ��ַ�ת����.com.vince.convertstream;

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
	//ʹ��ת�������ֽ���ת�����ַ���
	public static void reader()
	{
		try
		{
			//����һ���ֽ�������
			InputStream in = new FileInputStream("f:\\3.txt");
			//ͨ���ֽ�������������һ���ַ�������
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
	
	//ʹ��ת���������ַ���ת�����ֽ������
	public static void writer()
	{
		try
		{
			//����һ���ֽ������
			OutputStream out = new FileOutputStream("f:\\3.txt");
			
			String info = "ɽ���ڸߣ�����������ѧjava��û���粻��";
			//ͨ���ֽ������ȥ����һ���ַ������
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
