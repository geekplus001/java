package ������TCPЭ��.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP�ͻ��˳���
 */
public class ClientDemo 
{

	public static void main(String[] args) 
	{
		try 
		{
			//����һ���ͻ��˵�Socket����IP/���������˿ںţ�
			Socket s = new Socket("10.101.242.34", 8888);
			System.out.println("������������ӳɹ���");
			//����һ���ַ�������
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
