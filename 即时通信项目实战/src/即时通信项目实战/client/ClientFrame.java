package 即时通信项目实战.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.Toolkit;

import javax.swing.SwingConstants;

import 即时通信项目实战.model.Info;

public class ClientFrame extends JFrame {

	private JPanel contentPane;
//	protected static JTextArea textArea_2;
//	private static ServerService ss;
//	private static JTextArea textArea;
//	private static DefaultListModel listModel;
	private static Info info;
	private static JTextArea textArea_2;
	
//	public ClientFrame(Info info)
//	{
//		
//	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Info info = null;
					ClientFrame frame = new ClientFrame(info);
					frame.setVisible(true);
					
//					startServer();
					
					
					//设置UI的感官（风格）
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					SwingUtilities.updateComponentTreeUI(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
//			//启动服务器，等待连接
//			private void startServer() {
//				textArea_2.setText("服务器已启动，正在监听8090端口。。。");
//				// TODO Auto-generated method stub
//				new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						ss = new ServerService(textArea,listModel);
//						ss.startServer();
//					}
//				});
//			}
		});
	}


	/**
	 * Create the frame.
	 */
	public ClientFrame(Info info) {
		this.info = info;
		setData(info);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ClientFrame.class.getResource("/res/QQ\u56FE\u724720150628205231.jpg")));
		setTitle("\u804A\u804A-\u5BA2\u6237\u7AEF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	 JLabel JLable = new JLabel("\u6807\u9898\u680F");
		contentPane.add(JLable, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel llable_userlist = new JLabel("--\u5728\u7EBF\u7528\u6237\u5217\u8868--");
		panel.add(llable_userlist, BorderLayout.NORTH);
		
		JList list = new JList();
		panel.add(list, BorderLayout.CENTER);
//		
//		JList list_users = new JList();
//		panel.add(list_users, BorderLayout.CENTER);
//		listModel = new DefaultListModel();
//		listModel.addElement("所有人");
//		list_users.setModel(listModel);
//		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165");
		panel_1.add(lblNewLabel, BorderLayout.WEST);
		
		JTextArea textArea_1 = new JTextArea();
		panel_1.add(textArea_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\u53D1\u9001");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnNewButton, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.EAST);
		
		  textArea_2 = new JTextArea();//
		panel_2.add(textArea_2, BorderLayout.CENTER);
		
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x= (int)((d.getWidth()-422)/2);
		int y = (int)((d.getHeight()-306)/2);
		this.setLocation(x, y);
	}
	
	
	/*
	 * 初始化数据
	 * 
	 */
	private static void setData(Info info)
	{
		StringBuffer buf = new StringBuffer();
		textArea_2.setText(buf.toString());
		buf.append(textArea_2.getText()).append("\n时间:").append(info.getSendTime()).append(info.getFromUSer()).append("说：").append(info.getContent()).append("\n\n");
		
	}

}
