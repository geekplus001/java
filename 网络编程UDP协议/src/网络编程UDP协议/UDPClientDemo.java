package ������UDPЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDP���ܶ�
 */
public class UDPClientDemo 
{
	public static void main(String[] args) throws IOException 
	{
		byte [] bytes = new byte[1024];
		//����һ�����ݱ�����
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		//����UDPЭ���Socket����
		DatagramSocket ds =  new DatagramSocket(5000);
		System.out.println("���ն�...");
		ds.receive(dp);
		String info  = new String(dp.getData(),0,dp.getLength());
		System.out.println(info);
		ds.close();
	}
}
