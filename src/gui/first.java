package jiemian;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class first {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first window = new first();
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
	public first() {
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
		frame.setTitle("��������");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("\u9009\u62E9\u4F60\u7684\u8EAB\u4EFD");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\\u5B66\u4E60\u4F7F\u6211\u5FEB\u4E50\\\u79FB\u52A8\u667A\u80FD\u524D\u7AEF\\html\u5B9E\u9A8C\\\u4E0A\u673A\\\u5B9E\u9A8C\u4E8C2019\\\u5B9E\u9A8C\u4E8C2019.\u5B9E\u9A8C\\a\\images\\timg (2).jpg"));
		
		
		JButton sj = new JButton("�̼�");
		sj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sjwait.main(null);
				
				}
		});
		 Dimension preferredSize = new Dimension(400,100);
		 sj.setPreferredSize(preferredSize );
		 sj.setBounds(343, 84, 256, 77);
		 sj.setForeground(Color.BLACK);
		 sj.setFont(new Font("Adobe ���� Std L", Font.PLAIN, 20));
		frame.getContentPane().add(sj);
		
		
		
		
		
		
		JButton button = new JButton("�˿�");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    gukewait.main(null);
				frame.dispose();
				}
		});
		 Dimension preferredSize1 = new Dimension(400,100);
		 button.setPreferredSize(preferredSize );
		 button.setBounds(343, 239, 256, 77);
		 button.setForeground(Color.BLACK);
		 button.setFont(new Font("Adobe ���� Std L", Font.PLAIN, 20));
		frame.getContentPane().add(button);
	
		
		
		
		
	}}