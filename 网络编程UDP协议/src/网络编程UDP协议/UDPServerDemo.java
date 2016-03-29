package 网络编程UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP發送端
 */
public class UDPServerDemo 
{

	public static void main(String[] args) throws IOException 
	{
		String info = "小新有一隻狗，小時候叫小白，长大了叫大白，老了叫老白，死了就是白白！";
		//把数据转换成字节数组
		byte [] bytes = info.getBytes();
		//创建一个数据报包对象(要发送的字节数组，数组起始位置，要发送的数组长度，InetAddress，接收端端口号)
		DatagramPacket data = new DatagramPacket(
				bytes, 0,bytes.length,
				InetAddress.getByName("10.101.242.34"),5000);
		//创建一个UDP协议的Socket对象
		DatagramSocket ds = new DatagramSocket(3000);//发送端端口号
		ds.send(data);//发送数据报
		System.out.println("发送完毕！");
	}

}
