package jiemian;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class zhuce {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zhuce window = new zhuce();
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
	public zhuce() {
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
		frame.setTitle("顾客注册");
		
		
		JLabel label = new JLabel("账号");
		label.setFont(new Font("仿宋", Font.BOLD, 30));
		label.setBounds(376, 164, 64, 36);
		frame.getContentPane().add(label);
		
		textField = new JTextField();  //设置输入Field控件属性，位置
		textField.setBounds(440, 164, 196, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("密码");  //设置label控件属性，位置
		lblNewLabel_1.setFont(new Font("仿宋", Font.BOLD, 30));
		lblNewLabel_1.setBounds(376, 220,  64, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(440, 220, 196, 36);
		frame.getContentPane().add(passwordField);
		
		
		JLabel lblNewLabel_2 = new JLabel("密码确认");  //设置label控件属性，位置
		lblNewLabel_2.setFont(new Font("仿宋", Font.BOLD, 30));
		lblNewLabel_2.setBounds(312, 280, 128, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(440, 280, 196, 36);
		frame.getContentPane().add(passwordField_1);
		
		
		
		JButton button_zhuce = new JButton("提交");
		button_zhuce.setFont(new Font("仿宋", Font.BOLD, 30));
		button_zhuce.setBounds(429, 343, 113, 36);
		frame.getContentPane().add(button_zhuce);
		button_zhuce.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String zcmm=new String(passwordField.getPassword());
				String qrmm=new String(passwordField_1.getPassword());
				if(zcmm==qrmm&&zcmm!=null)
				{
				String zczhh=textField.getText();//获取
				zhucechenggong.main(null);
				frame.dispose();}
				else {
					JOptionPane.showMessageDialog( frame, "密码错误"); 
				}
				zhucechenggong.main(null);
				frame.dispose();
			}
		});
		

		
	}
	}


