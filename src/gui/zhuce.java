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
		frame.setTitle("�˿�ע��");
		
		
		JLabel label = new JLabel("�˺�");
		label.setFont(new Font("����", Font.BOLD, 30));
		label.setBounds(376, 164, 64, 36);
		frame.getContentPane().add(label);
		
		textField = new JTextField();  //��������Field�ؼ����ԣ�λ��
		textField.setBounds(440, 164, 196, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("����");  //����label�ؼ����ԣ�λ��
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_1.setBounds(376, 220,  64, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(440, 220, 196, 36);
		frame.getContentPane().add(passwordField);
		
		
		JLabel lblNewLabel_2 = new JLabel("����ȷ��");  //����label�ؼ����ԣ�λ��
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_2.setBounds(312, 280, 128, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(440, 280, 196, 36);
		frame.getContentPane().add(passwordField_1);
		
		
		
		JButton button_zhuce = new JButton("�ύ");
		button_zhuce.setFont(new Font("����", Font.BOLD, 30));
		button_zhuce.setBounds(429, 343, 113, 36);
		frame.getContentPane().add(button_zhuce);
		button_zhuce.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String zcmm=new String(passwordField.getPassword());
				String qrmm=new String(passwordField_1.getPassword());
				if(zcmm==qrmm&&zcmm!=null)
				{
				String zczhh=textField.getText();//��ȡ
				zhucechenggong.main(null);
				frame.dispose();}
				else {
					JOptionPane.showMessageDialog( frame, "�������"); 
				}
				zhucechenggong.main(null);
				frame.dispose();
			}
		});
		

		
	}
	}


