package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import layout.JpanelTest2;

import javax.swing.JButton;

public class MyFrame6 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnYellow;
	private JButton btnRed;
	private JButton btnClose;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame6 frame = new MyFrame6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnYellow = new JButton("노랑");
		btnYellow.addActionListener(this);
		panel.add(btnYellow);
		
		btnRed = new JButton("빨강");
		btnRed.addActionListener(this);
		panel.add(btnRed);
		
		btnClose = new JButton("닫 기");
		btnClose.addActionListener(this);
		contentPane.add(btnClose, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//btnYellow or btnRed
		if(e.getSource()==btnYellow) {
			contentPane.setBackground(Color.YELLOW);
			panel.setBackground(Color.YELLOW);
			
		}else if(e.getSource()==btnRed) {
			contentPane.setBackground(Color.RED);
			panel.setBackground(Color.RED);					
		}else {
			System.exit(0);
		}
	}
}
