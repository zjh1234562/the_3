package jiemian;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.naming.directory.SearchControls;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

public class shouye {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shouye window = new shouye();
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
	public shouye() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5546\u54C1\u9996\u9875");
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		 screenWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width/2;;  //依据用户屏幕。自己主动调整控件的显示位置
		 screenHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height/2;
		frame.setBounds(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2, screenWidth, screenHeight);
		frame.getContentPane().setLayout(null);	
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("商品搜索");
		lblNewLabel.setBounds(227, 100, 60, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JTextField textField = new JTextField("请输入商品名");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(294, 109, 353, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton sousuo = new JButton("搜索");
		sousuo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ss=textField.getText();//获取搜索内容
				ssresult.main(null);
				frame.dispose();
				
			}
		});
		sousuo.setBounds(651, 109, 89, 36);
		frame.getContentPane().add(sousuo);
		
		JButton btme = new JButton("个人中心");
		btme.setBounds(411, 27, 119, 54);
		frame.getContentPane().add(btme);
		btme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				customer.main(null);
				frame.dispose();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(164, 165, 613, 294);
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
				"会员编号","会员名字", "联系电话", "备注信息"
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
				
		};
		
		
		
		
		

	}

