package jiemian;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class customer {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer window = new customer();
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
	public customer() {
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
		frame.setFont(new Font("Adobe 宋体 Std L", Font.PLAIN, 16));
		frame.setTitle("个人中心");;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		JButton chongzhi = new JButton("充值");
		chongzhi.setBounds(426, 277, 95, 45);
		frame.getContentPane().add(chongzhi);
		chongzhi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiyemian.main(null);
				frame.dispose();}});
		
		
		JButton back = new JButton("返回");
		back.setBounds(27, 28, 95, 45);
		frame.getContentPane().add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				}});
		
		

		
		JButton chaxunyue = new JButton("查询余额");
		chaxunyue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		chaxunyue.setBounds(403, 124, 143, 45);
		frame.getContentPane().add(chaxunyue);
		


	

	}
}
