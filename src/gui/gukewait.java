package jiemian;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gukewait {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gukewait window = new gukewait();
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
	public gukewait() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		int windowWidth = frame.getWidth(); //��ô��ڿ�
		int windowHeight = frame.getHeight(); //��ô��ڸ�
		Toolkit kit = Toolkit.getDefaultToolkit(); //���幤�߰�
		Dimension screenSize = kit.getScreenSize(); //��ȡ��Ļ�ĳߴ�
		int screenWidth = screenSize.width; //��ȡ��Ļ�Ŀ�
		int screenHeight = screenSize.height; //��ȡ��Ļ�ĸ�
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//���ô��ھ�����ʾ 
		 screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2;;  //�����û���Ļ���Լ����������ؼ�����ʾλ��
		 screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;;
		frame.setBounds(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2, screenWidth, screenHeight);
		frame.getContentPane().setLayout(null);	
		frame.setFont(new Font("Adobe ���� Std L", Font.PLAIN, 16));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("�˿͵ȴ�");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\u5B66\u4E60\u4F7F\u6211\u5FEB\u4E50\\\u79FB\u52A8\u667A\u80FD\u524D\u7AEF\\html\u5B9E\u9A8C\\\u4E0A\u673A\\\u5B9E\u9A8C\u4E8C2019\\\u5B9E\u9A8C\u4E8C2019.\u5B9E\u9A8C\\a\\images\\timg (2).jpg"));
		
		
		JButton btnNewButton = new JButton("ע��");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				zhuce.main(null);
				frame.dispose();
				}
		});
		 Dimension preferredSize = new Dimension(400,100);
		 btnNewButton.setPreferredSize(preferredSize );
		 btnNewButton.setBounds(343, 84, 256, 77);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Adobe ���� Std L", Font.PLAIN, 20));
		frame.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		JButton button = new JButton("��¼");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    DENG.main(null);
				frame.dispose();}
		});
		 Dimension preferredSize1 = new Dimension(400,100);
		 button.setPreferredSize(preferredSize );
		 button.setBounds(343, 239, 256, 77);
		 button.setForeground(Color.BLACK);
		 button.setFont(new Font("Adobe ���� Std L", Font.PLAIN, 20));
		frame.getContentPane().add(button);
	
		
		
		
		
	}}