package com.vince.file;

import java.io.File;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//F:\\BaiduYunDownload
		//File.separator 表示分隔符
		File file1 = new File("F:"+File.separator+"BaiduYunDownload"+File.separator+"lamp.txt");
		//路径分隔符
//		String s = File.pathSeparator;
		
		
		//文件是否存在
		if(!file1.exists())
		{
			try
			{
				boolean b = file1.createNewFile();
				System.out.println("创建文件："+b);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//删除文件
//		System.out.println(file1.delete());
		//得到文件的上一级路径
		System.out.println(file1.getParent());
		//判断一个路径是否是文件夹
		System.out.println("是否是目录："+file1.isDirectory());
		//判断一个路径是否是文件
		System.out.println("是否是文件："+file1.isFile());
	
		
		File file2 = new File("D:\\资料\\图片");
		//列出文件夹中的所有文件名
		String [] fileName = file2.list();
		for(String s:fileName)
		{
			System.out.println(s);
		}
		
		//列出文件夹中的所有文件,以file数组返回
		File [] files = file2.listFiles();
		for(File file:files)
		{
			System.out.println(file.getPath()+"---"+file.length());
		}
		
		//创建文件夹
		File file3 = new File("f:\\xiaobai\\baibai");
		file3.mkdirs();
		//重命名
		File file4 = new File("f:\\xiaobai\\xiaobaibai");
		file3.renameTo(file4);
	}

}
