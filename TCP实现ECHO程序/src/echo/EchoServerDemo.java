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
		System.out.println("��������������");
		boolean flag = true;
		
		while(flag)
		{
			System.out.println("���������ڵȴ����ӡ�����");
			Socket s = ss.accept();
			System.out.println(s.getInetAddress().getHostAddress()+"������");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(
					new BufferedOutputStream(s.getOutputStream()));
			
			boolean bool = true;
			while(bool)
			{
				String info = br.readLine();
				if("".equals(info) || "bye".equals(info))
				{
					bool = false;
				}
				else
				{
					System.out.println(info);
					ps.println("echo:"+info);
					ps.flush();
				}
			}
			br.close();
			ps.close();
		}
	}

}
