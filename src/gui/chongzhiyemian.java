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
		frame.setTitle("�˿ͳ�ֵ����");
		
		textField = new JTextField("�������ֵ���");
		textField.setBounds(317, 178, 314, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton qrcz = new JButton("ȷ�ϳ�ֵ");
		qrcz.setBounds(417, 257, 102, 68);
		frame.getContentPane().add(qrcz);
		qrcz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chongzhiyemian.main(null);
				String money=textField.getText();//��ȡ
				JOptionPane.showMessageDialog( frame, "��ֵ�ɹ�"); 
				}});
	}
}
