package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.peer.LabelPeer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;

//ActionListener를 바로 구현
public class MyFrame2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel label;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame2 frame = new MyFrame2();
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
	public MyFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btn = new JButton("버튼을 누르세요.");
		panel.add(btn);
		//버튼과 리스너를 연동하는 부분
		btn.addActionListener(this);
		
		label = new JLabel("New label");
		panel.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼 글자 변경
		btn.setLabel("눌렸다고");
		btn.setBackground(Color.PINK);
		btn.setForeground(Color.RED);
		//라벨 글자 변경
		label.setText("버튼 눌림");
		label.setForeground(Color.BLUE);
	}	
}
