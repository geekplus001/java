package 网络编程UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDP接受端
 */
public class UDPClientDemo 
{
	public static void main(String[] args) throws IOException 
	{
		byte [] bytes = new byte[1024];
		//创建一个数据报对象
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		//创建UDP协议的Socket对象
		DatagramSocket ds =  new DatagramSocket(5000);
		System.out.println("接收端...");
		ds.receive(dp);
		String info  = new String(dp.getData(),0,dp.getLength());
		System.out.println(info);
		ds.close();
	}
}
