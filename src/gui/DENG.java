package jiemian;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class DENG {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DENG window = new DENG();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DENG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		 screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2;;  //依据用户屏幕。自己主动调整控件的显示位置
		 screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;;
		frame.setBounds(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2, screenWidth, screenHeight);
		frame.getContentPane().setLayout(null);	
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("顾客登录");
		
		
		JLabel label = new JLabel("账号");
		label.setFont(new Font("仿宋", Font.BOLD, 30));
		label.setBounds(367, 144, 64, 36);
		frame.getContentPane().add(label);
		
		textField = new JTextField();  //设置输入Field控件属性，位置
		textField.setBounds(431, 144, 196, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("密码");  //设置label控件属性，位置
		lblNewLabel_1.setFont(new Font("仿宋", Font.BOLD, 30));
		lblNewLabel_1.setBounds(367, 200,  64, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(431, 200, 196, 36);
		frame.getContentPane().add(passwordField);
		
		JButton buttondenglu = new JButton("登录");
		buttondenglu.setFont(new Font("宋体", Font.PLAIN, 30));
		buttondenglu.setBounds(411, 270, 180, 39);
		frame.getContentPane().add(buttondenglu);
		buttondenglu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				shouye.main(null);
				frame.dispose();
				String zhh=textField.getText();
				String mm=new String(passwordField.getPassword());}
		});
		

		
	}
}
