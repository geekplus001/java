package 即时通信项目实战.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;





import javax.swing.DefaultListModel;
import javax.swing.JTextArea;

import 即时通信项目实战.model.Info;
import 即时通信项目实战.model.User;
import 即时通信项目实战.util.DateFormatUtil;
import 即时通信项目实战.util.EnumInfoTyoe;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3DomDriver;

/*
 * 客户端监听服务
 */
public class ServerService 
{
	//线程池
	ExecutorService es = Executors.newFixedThreadPool(10);
	//保存所有在线的用户服务线程
	private Vector<UserServiceThread> userThreads = new Vector<UserServiceThread>();
	private JTextArea textArea;
	private DefaultListModel listModel;
	
	public ServerService(JTextArea textArea,DefaultListModel listModel)
	{
		this.textArea = textArea;
		this.listModel = listModel;
	}
	
	public void startServer()
	{
		boolean flag = true;//监听客户端是否链接的标记
		try {
			ServerSocket server = new ServerSocket(8090);
			
			while(flag)
			{
				Socket client = server.accept();
				UserServiceThread ust = new UserServiceThread(client);
				userThreads.add(ust);
				es.execute(ust);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//用户服务线程
	class UserServiceThread implements Runnable
	{
		private Socket client;
		private DataInputStream in = null;
		private DataOutputStream out = null;
		private boolean flag = true;//监听客户端是否链接的标记
		private User currentUserInfo;//代表当前用户信息
		
		public UserServiceThread(Socket client)
		{
			this.client = client;
			try {
				in = new DataInputStream(client.getInputStream());
				out = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void run()
		{
			while(flag)
			{
				try {
					//获取客户端发送过来的XML字符串
					String infoXML = in.readUTF();
					//构造一个xStream工具对象
					XStream xStream = new XStream(new Xpp3DomDriver());
					即时通信项目实战.model.Info info = (即时通信项目实战.model.Info)xStream.fromXML(infoXML);
					
					switch (info.getInfoType()) {
					case LOGIN:
						textArea.setText(textArea.getText()+"\n欢迎你"+info.getFromUSer());
						//用户验证省略
						//向该用户发送欢迎消息
						Info logInfo = new Info();
						logInfo.setContent("欢迎你，"+info.getFromUSer());
						logInfo.setFromUSer("管理员");
						logInfo.setSendTime(DateFormatUtil.getTime(new Date()));
						logInfo.setToUSer(info.getFromUSer());
						logInfo.setInfoType(EnumInfoTyoe.WELCOME);
						//保存当前用户信息
						currentUserInfo = new User();
						currentUserInfo.setName(info.getFromUSer());
						
						out.writeUTF(xStream.toXML(logInfo));
						out.flush();
						//更新服务器在线用户列表
						listModel.addElement(info.getFromUSer());
						//向所有用户发送更新用户的消息
						for(UserServiceThread user:userThreads)
						{
							Info updateUserList = new Info();
							updateUserList.setContent(info.getFromUSer());
							updateUserList.setInfoType(EnumInfoTyoe.ADD_USER);
							if(!info.getFromUSer().equals(currentUserInfo.getName()))
								user.out.writeUTF(xStream.toXML(updateUserList));
						}
						break;
					case SEND_INFO:
						break;
//					case UPDATE_USERLIST:
//						break;
//					case WELCOME:
//						break;
					default:
						break;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}


