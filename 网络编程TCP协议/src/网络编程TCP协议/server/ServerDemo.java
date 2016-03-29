package 网络编程TCP协议.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * TCP服务器端程序
 */
public class ServerDemo 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			//创建一个服务器的Socket
			ServerSocket server = new ServerSocket(8888);
			System.out.println("服务器已启动，正等待链接中...");
			Socket s = server.accept();//等待客户端链接，会阻塞
			
			String info = "亲，您的宝贝已发出，请注意查收！\n";
			//构建一个字符输出流
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(s.getOutputStream()));
			bw.write(info);
			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
