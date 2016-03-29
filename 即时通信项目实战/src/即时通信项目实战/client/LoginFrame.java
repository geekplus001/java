package 即时通信项目实战.client;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class LoginFrame extends JFrame {

	private JPanel 登陆;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
//	private UserService us = new UserService();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					
					
					//设置UI的感官（风格）
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					SwingUtilities.updateComponentTreeUI(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/res/QQ\u56FE\u724720150628205231.jpg")));
		setTitle("\u767B\u9646");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 253);
		登陆 = new JPanel();
		登陆.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(登陆);
		登陆.setLayout(new GridLayout(5, 1, 5, 0));
		
		JPanel panel = new JPanel();
		登陆.add(panel);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u8D26\u53F7");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(20);
		
		JPanel panel_1 = new JPanel();
		登陆.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u5BC6\u7801");
		panel_1.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		panel_1.add(passwordField);
		
		JPanel panel_3 = new JPanel();
		登陆.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("\u670D\u52A1\u5668IP");
		panel_3.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(20);
		
		JPanel panel_4 = new JPanel();
		登陆.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("\u7AEF\u53E3\u53F7\u4E3A");
		panel_4.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(20);
		
		JPanel panel_2 = new JPanel();
		登陆.add(panel_2);
		
		JButton btnNewButton = new JButton("\u767B\u9646");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String username = textField.getText().trim();
				String password = new String(passwordField.getPassword());
				String ip = textField_1.getText().trim();
				int port = Integer.parseInt(textField_2.getText().trim());
				 UserService us = (UserService) new UserService(LoginFrame.this);
//				Info info =
						us.login(username, password, ip, port);
//				System.out.println(info);
						LoginFrame.this.dispose();
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u9000\u51FA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = JOptionPane.showConfirmDialog(LoginFrame.this, "真的要退出吗", "退出", JOptionPane.YES_NO_CANCEL_OPTION);
				if(value==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		panel_2.add(btnNewButton_1);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x= (int)((d.getWidth()-343)/2);
		int y = (int)((d.getHeight()-201)/2);
		this.setLocation(x, y);
	}

}
