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
		frame.setFont(new Font("Adobe ���� Std L", Font.PLAIN, 16));
		frame.setTitle("��������");;
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		JButton chongzhi = new JButton("��ֵ");
		chongzhi.setBounds(426, 277, 95, 45);
		frame.getContentPane().add(chongzhi);
		chongzhi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiyemian.main(null);
				frame.dispose();}});
		
		
		JButton back = new JButton("����");
		back.setBounds(27, 28, 95, 45);
		frame.getContentPane().add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				}});
		
		

		
		JButton chaxunyue = new JButton("��ѯ���");
		chaxunyue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		chaxunyue.setBounds(403, 124, 143, 45);
		frame.getContentPane().add(chaxunyue);
		


	

	}
}
