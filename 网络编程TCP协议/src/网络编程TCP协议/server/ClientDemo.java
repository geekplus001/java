package 网络编程TCP协议.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP客户端程序
 */
public class ClientDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
			//创建一个客户端的Socket对象（IP/主机名，端口号）
			Socket s = new Socket("10.101.242.34", 8888);
			System.out.println("与服务器谅链接成功！");
			//构造一个字符输入流
			BufferedReader br = new BufferedReader
					(new InputStreamReader(s.getInputStream()));
			String info = br.readLine();
			System.out.println(info);
			br.close();
		} 
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
