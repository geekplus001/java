package 即时通信项目实战.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3Driver;

import 即时通信项目实战.model.Info;
import 即时通信项目实战.util.EnumInfoTyoe;

public class UserService 
{
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private JTextArea jTextArea;
	private DefaultListModel listModel;
	
	private ClientFrame clientFrame;
	private LoginFrame loginFrame;
	
	private UserService(JTextArea jTextArea,DefaultListModel listModel)
	{
		this.jTextArea = jTextArea;
		this.listModel = listModel;
	}
	public UserService(LoginFrame loginFrame)
	{
		this.loginFrame = loginFrame;
	}
	/*
	 * 登陆功能
	 */
	public void login(final String username,final String password,final String ip,final int port)
	{
//		final Info loginInfo = new Info();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					socket = new Socket(ip,port);
					
					out = new DataOutputStream(socket.getOutputStream());
					//向服务器发送登陆消息
					Info info = new Info();
					info.setFromUSer(username);
					info.setInfoType(EnumInfoTyoe.LOGIN);
					XStream xStream = new XStream(new Xpp3Driver());
					String xml = xStream.toXML(info);
					out.writeUTF(xml);
					out.flush();
					new Thread(new UserThread()).start();
					
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		return loginInfo;
	}
	
	private boolean flag = true;
	//接收服务器的信息
	class UserThread implements Runnable
	{
		public UserThread()
		{
			flag = true;
		}
		@Override
		public void run() {
			while (flag) {
				try {

					in = new DataInputStream(socket.getInputStream());
					XStream xStream = new XStream(new Xpp3Driver());
					// 从服务器中读取消息
					String xml = in.readUTF();
					Info info = (Info) xStream.fromXML(xml);
					switch (info.getInfoType()) {
					case WELCOME:
						clientFrame = new ClientFrame(info);
						loginFrame.dispose();
						break;

					default:
						break;
					}
					// loginInfo.setContent(info.getContent());
					// loginInfo.setToUSer(info.getToUSer());
					// loginInfo.setInfoType(info.getInfoType());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
