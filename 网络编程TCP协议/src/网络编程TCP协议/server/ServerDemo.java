package ������TCPЭ��.server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * TCP�������˳���
 */
public class ServerDemo 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			//����һ����������Socket
			ServerSocket server = new ServerSocket(8888);
			System.out.println("�����������������ȴ�������...");
			Socket s = server.accept();//�ȴ��ͻ������ӣ�������
			
			String info = "�ף����ı����ѷ�������ע����գ�\n";
			//����һ���ַ������
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
