package ������UDPЭ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP�l�Ͷ�
 */
public class UDPServerDemo 
{

	public static void main(String[] args) throws IOException 
	{
		String info = "С����һ�b����С�r���С�ף������˽д�ף����˽��ϰף����˾��ǰװף�";
		//������ת�����ֽ�����
		byte [] bytes = info.getBytes();
		//����һ�����ݱ�������(Ҫ���͵��ֽ����飬������ʼλ�ã�Ҫ���͵����鳤�ȣ�InetAddress�����ն˶˿ں�)
		DatagramPacket data = new DatagramPacket(
				bytes, 0,bytes.length,
				InetAddress.getByName("10.101.242.34"),5000);
		//����һ��UDPЭ���Socket����
		DatagramSocket ds = new DatagramSocket(3000);//���Ͷ˶˿ں�
		ds.send(data);//�������ݱ�
		System.out.println("������ϣ�");
	}

}
