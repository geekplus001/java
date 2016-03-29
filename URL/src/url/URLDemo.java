package url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo
{

	public static void main(String[] args) throws IOException 
	{
		//������ַ����URL����
		URL url = new URL(
				"http://img.1985t.com/uploads/attaches/2014/07/19016-WezXvz.jpg");
		
		System.out.println("��������"+url.getHost());
		System.out.println("��Դ·����"+url.getPath());
		System.out.println("�˿ںţ�"+url.getPort());
		System.out.println("Э�飺"+url.getProtocol());
		
		String filename = url.getPath().substring(url.getPath().lastIndexOf("/"));
		//ͨ��URL������
		URLConnection conn = url.openConnection();
		
		//��ȡ���ӵ�����������
		BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
		//�����ļ����������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("g:\\"+filename));
		
		byte [] bytes = new byte[1024*50];
		int len = -1;
		while((len=bis.read(bytes))!=-1)
		{
			bos.write(bytes, 0, len);
			bos.flush();
		}
		bos.close();
		bis.close();
		System.out.println("�������!");
	}

}

