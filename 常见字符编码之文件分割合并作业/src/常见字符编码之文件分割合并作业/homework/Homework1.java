package 常见字符编码之文件分割合并作业.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/*
 * src:要分割的源文件路径
 * mb:每个文件的大小（MB）
 * dest：
 */

public class Homework1 
{
	public static void split(String src,int mb,String dest)
	{
		File srcFile = new File(src);
		if(!srcFile.exists())
		{
			return;
		}
		long countSize = srcFile.length();//得到文件长度（字节）
		long fileSize = 1024*1024*mb;//要分割的每个文件大小（字节）
		
		int num = 0;//分割的份数
		if(countSize%fileSize==0)
			num=(int)(countSize/fileSize);
		else
		{
			num = (int)(countSize/fileSize)+1;
		}
		
		//构建文件输入流
		try
		{
			InputStream in = new FileInputStream(srcFile);
			BufferedInputStream bis = new BufferedInputStream(in);
			byte[] bytes = new byte[1024*1024];
			int len =  -1;
			
			for(int i=0;i<num;i++)
			{
				String newFIle = dest+File.separator+srcFile.getName()+"-"+i+".dat";
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFIle));
				int count =0;//记录每个文件当前写入的大小
				
				//开始读取文件
				while((len=bis.read(bytes))!=-1)
				{
					bos.write(bytes,0,len);
					bos.flush();
					count+=len;
					if(count>=fileSize)
					{
						break;
					}
				}
				bos.close();
			}
			bis.close();
			in.close();
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
		String src = "D:\\安装包\\API\\J2SE.CHM";
		String dest = "f:\\";
		int mb = 10;
		System.out.println("开始分割文件。。。");
		split(src, mb, dest);
		System.out.println("文件分割完成.");
	}

}
