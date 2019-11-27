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
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("�˿͵�¼");
		
		
		JLabel label = new JLabel("�˺�");
		label.setFont(new Font("����", Font.BOLD, 30));
		label.setBounds(367, 144, 64, 36);
		frame.getContentPane().add(label);
		
		textField = new JTextField();  //��������Field�ؼ����ԣ�λ��
		textField.setBounds(431, 144, 196, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("����");  //����label�ؼ����ԣ�λ��
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_1.setBounds(367, 200,  64, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(431, 200, 196, 36);
		frame.getContentPane().add(passwordField);
		
		JButton buttondenglu = new JButton("��¼");
		buttondenglu.setFont(new Font("����", Font.PLAIN, 30));
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
