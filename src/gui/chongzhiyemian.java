package jiemian;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class chongzhiyemian {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chongzhiyemian window = new chongzhiyemian();
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
	public chongzhiyemian() {
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
		frame.setTitle("顾客充值中心");
		
		textField = new JTextField("请输入充值金额");
		textField.setBounds(317, 178, 314, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton qrcz = new JButton("确认充值");
		qrcz.setBounds(417, 257, 102, 68);
		frame.getContentPane().add(qrcz);
		qrcz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiyemian.main(null);
				String money=textField.getText();//获取
				JOptionPane.showMessageDialog( frame, "充值成功"); 
				}});
	}
}
