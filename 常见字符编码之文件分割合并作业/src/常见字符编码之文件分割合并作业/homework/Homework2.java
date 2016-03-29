package �����ַ�����֮�ļ��ָ�ϲ���ҵ.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * �ļ��ϲ�
 * dest:Ŀ��·��
 * files:Ҫ�ϲ����ļ��б�
 */
public class Homework2
{
	public static void merge(String dest,File... files)
	{
		String filename = files[0].getName();
		filename = filename.substring(0, filename.lastIndexOf("-"));
		
		try 
		{
			BufferedOutputStream bos = new BufferedOutputStream
					(new FileOutputStream(dest+File.separator+filename));
			BufferedInputStream bis = null;
			byte[] bytes = new byte[1024*1024];
			int len = -1;
			//ѭ����ȡÿ���ļ�
			for(int i=0;i<files.length;i++)
			{
				bis = new BufferedInputStream(new FileInputStream(files[i]));
				while((len=bis.read(bytes))!=-1)
				{
					bos.write(bytes,0,len);
					bos.flush();
				}
				bis.close();
			}
			bos.close();
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

	public static void main(String [] args)
	{
		merge("f:\\", new File("F:\\J2SE.CHM-0.dat"),
			new File("F:\\J2SE.CHM-1.dat"),
			new File("F:\\J2SE.CHM-2.dat"),
			new File("F:\\J2SE.CHM-3.dat"));
		System.out.println("�ϲ��ɹ�.");
	}
}
