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
		//根据网址都早URL对象
		URL url = new URL(
				"http://img.1985t.com/uploads/attaches/2014/07/19016-WezXvz.jpg");
		
		System.out.println("主机名："+url.getHost());
		System.out.println("资源路径："+url.getPath());
		System.out.println("端口号："+url.getPort());
		System.out.println("协议："+url.getProtocol());
		
		String filename = url.getPath().substring(url.getPath().lastIndexOf("/"));
		//通过URL打开连接
		URLConnection conn = url.openConnection();
		
		//获取连接的输入流对象
		BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
		//构造文件输出流对象
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
		System.out.println("下载完成!");
	}

}

