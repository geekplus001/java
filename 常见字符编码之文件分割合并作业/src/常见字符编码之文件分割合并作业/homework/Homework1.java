package �����ַ�����֮�ļ��ָ�ϲ���ҵ.homework;

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
 * src:Ҫ�ָ��Դ�ļ�·��
 * mb:ÿ���ļ��Ĵ�С��MB��
 * dest��
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
		long countSize = srcFile.length();//�õ��ļ����ȣ��ֽڣ�
		long fileSize = 1024*1024*mb;//Ҫ�ָ��ÿ���ļ���С���ֽڣ�
		
		int num = 0;//�ָ�ķ���
		if(countSize%fileSize==0)
			num=(int)(countSize/fileSize);
		else
		{
			num = (int)(countSize/fileSize)+1;
		}
		
		//�����ļ�������
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
				int count =0;//��¼ÿ���ļ���ǰд��Ĵ�С
				
				//��ʼ��ȡ�ļ�
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
		String src = "D:\\��װ��\\API\\J2SE.CHM";
		String dest = "f:\\";
		int mb = 10;
		System.out.println("��ʼ�ָ��ļ�������");
		split(src, mb, dest);
		System.out.println("�ļ��ָ����.");
	}

}
