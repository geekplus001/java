package com.vince.charstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class HomeWork1 
{
	public static void copyFile(String src,String dest)
	{
		String ext = src.substring(src.lastIndexOf("\\"));
		File srcFile = new File(src);//Դ�ļ�
		File destFile = new File(dest+File.separator+ext);//Ŀ���ļ�
		InputStream in = null;
		OutputStream out = null;
		//�������������
		try 
		{
			in = new FileInputStream(srcFile);
			out = new FileOutputStream(destFile);
			
			byte [] bytes = new byte[24];//����ÿ��Ҫ��ȡ���ֽ�����
			int len = -1;
			
			while((len=in.read(bytes))!=-1)
			{
				out.write(bytes, 0, len);
			}
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
		finally
		{
			try 
			{
				if(in!=null)in.close();
				if(out!=null)out.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String src = "f:\\2.txt";
		String dest = "H:";
		copyFile(src, dest);
	}

}
