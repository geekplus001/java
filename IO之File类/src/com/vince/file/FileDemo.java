package com.vince.file;

import java.io.File;
import java.io.IOException;

public class FileDemo
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//F:\\BaiduYunDownload
		//File.separator ��ʾ�ָ���
		File file1 = new File("F:"+File.separator+"BaiduYunDownload"+File.separator+"lamp.txt");
		//·���ָ���
//		String s = File.pathSeparator;
		
		
		//�ļ��Ƿ����
		if(!file1.exists())
		{
			try
			{
				boolean b = file1.createNewFile();
				System.out.println("�����ļ���"+b);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//ɾ���ļ�
//		System.out.println(file1.delete());
		//�õ��ļ�����һ��·��
		System.out.println(file1.getParent());
		//�ж�һ��·���Ƿ����ļ���
		System.out.println("�Ƿ���Ŀ¼��"+file1.isDirectory());
		//�ж�һ��·���Ƿ����ļ�
		System.out.println("�Ƿ����ļ���"+file1.isFile());
	
		
		File file2 = new File("D:\\����\\ͼƬ");
		//�г��ļ����е������ļ���
		String [] fileName = file2.list();
		for(String s:fileName)
		{
			System.out.println(s);
		}
		
		//�г��ļ����е������ļ�,��file���鷵��
		File [] files = file2.listFiles();
		for(File file:files)
		{
			System.out.println(file.getPath()+"---"+file.length());
		}
		
		//�����ļ���
		File file3 = new File("f:\\xiaobai\\baibai");
		file3.mkdirs();
		//������
		File file4 = new File("f:\\xiaobai\\xiaobaibai");
		file3.renameTo(file4);
	}

}
