package jiemian;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JLabel;

public class ssresult {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ssresult window = new ssresult();
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
	public ssresult() {
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
		frame.setTitle("�������");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton back = new JButton("����");
		back.setBounds(27, 28, 95, 45);
		frame.getContentPane().add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				}});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(164, 99, 613, 294);
		frame.getContentPane().add(scrollPane);
		
		JTable syshp = new JTable();
		syshp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				;
			}
		});
		syshp.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"��Ա���","��Ա����", "��ϵ�绰", "��ע��Ϣ"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		syshp.getColumnModel().getColumn(3).setPreferredWidth(226);
		
		scrollPane.setViewportView(syshp);
		scrollPane.add(syshp);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(777, 178, 21, 48);
		frame.getContentPane().add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("�������ҵ���Ʒ��");
		lblNewLabel.setBounds(164, 28, 179, 45);
		frame.getContentPane().add(lblNewLabel);
				
		}
	}


