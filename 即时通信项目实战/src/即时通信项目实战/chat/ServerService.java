package ��ʱͨ����Ŀʵս.chat;

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

import ��ʱͨ����Ŀʵս.model.Info;
import ��ʱͨ����Ŀʵս.model.User;
import ��ʱͨ����Ŀʵս.util.DateFormatUtil;
import ��ʱͨ����Ŀʵս.util.EnumInfoTyoe;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Xpp3DomDriver;

/*
 * �ͻ��˼�������
 */
public class ServerService 
{
	//�̳߳�
	ExecutorService es = Executors.newFixedThreadPool(10);
	//�����������ߵ��û������߳�
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
		boolean flag = true;//�����ͻ����Ƿ����ӵı��
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
	
	//�û������߳�
	class UserServiceThread implements Runnable
	{
		private Socket client;
		private DataInputStream in = null;
		private DataOutputStream out = null;
		private boolean flag = true;//�����ͻ����Ƿ����ӵı��
		private User currentUserInfo;//����ǰ�û���Ϣ
		
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
					//��ȡ�ͻ��˷��͹�����XML�ַ���
					String infoXML = in.readUTF();
					//����һ��xStream���߶���
					XStream xStream = new XStream(new Xpp3DomDriver());
					��ʱͨ����Ŀʵս.model.Info info = (��ʱͨ����Ŀʵս.model.Info)xStream.fromXML(infoXML);
					
					switch (info.getInfoType()) {
					case LOGIN:
						textArea.setText(textArea.getText()+"\n��ӭ��"+info.getFromUSer());
						//�û���֤ʡ��
						//����û����ͻ�ӭ��Ϣ
						Info logInfo = new Info();
						logInfo.setContent("��ӭ�㣬"+info.getFromUSer());
						logInfo.setFromUSer("����Ա");
						logInfo.setSendTime(DateFormatUtil.getTime(new Date()));
						logInfo.setToUSer(info.getFromUSer());
						logInfo.setInfoType(EnumInfoTyoe.WELCOME);
						//���浱ǰ�û���Ϣ
						currentUserInfo = new User();
						currentUserInfo.setName(info.getFromUSer());
						
						out.writeUTF(xStream.toXML(logInfo));
						out.flush();
						//���·����������û��б�
						listModel.addElement(info.getFromUSer());
						//�������û����͸����û�����Ϣ
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


