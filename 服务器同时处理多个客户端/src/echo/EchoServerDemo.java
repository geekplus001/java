package echo;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServerDemo 
{

	public static void main(String[] args) throws IOException
	{
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("服务器已启动！");
		boolean flag = true;
		
		while(flag)
		{
	
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}

}


class UserThread implements Runnable
{
	private Socket s;
	public UserThread(Socket s)
	{	
		this.s = s;
	}

	@Override
	public void run() 
	{
		try 
		{
			System.out.println("服务器正在等待链接。。。");
			System.out.println(s.getInetAddress().getHostAddress() + "已连接");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					s.getInputStream()));
			PrintStream ps = new PrintStream(new BufferedOutputStream(
					s.getOutputStream()));

			boolean bool = true;
			while (bool)
			{
				String info = br.readLine();
				if ("".equals(info) || "bye".equals(info)) 
				{
					bool = false;
				} else
				{
					System.out.println(info);
					ps.println("echo:"+info);
					ps.flush();
				}
			}
			br.close();
			ps.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
}
