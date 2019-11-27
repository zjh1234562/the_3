package jiemian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class zhucechenggong {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zhucechenggong window = new zhucechenggong();
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
	public zhucechenggong() {
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
		frame.setTitle("顾客注册成功");
		
		
		JLabel label = new JLabel();
		label.setText("<html><em>______注册成功______ <br> 点击确认跳转到登录界面</html>,JLabel.CENTER");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("仿宋", Font.BOLD, 24));
		label.setBounds(256, 119, 430, 148);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("确认");
		button.setFont(new Font("宋体", Font.PLAIN, 24));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DENG.main(null);
				frame.dispose();}
		});
			button.setBounds(414, 347, 113, 27);
		frame.getContentPane().add(button);
		
		
	}

}
