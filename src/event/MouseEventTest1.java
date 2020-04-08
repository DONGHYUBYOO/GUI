package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MouseEventTest1 extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseEventTest1 frame = new MouseEventTest1();
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
	public MouseEventTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("확 인");
		btnNewButton.addMouseListener(this);
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.addMouseListener(this);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("mouseClicked");
		textArea.setText("mouseClicked");
		System.out.println(e.getX()+", "+e.getY());	//마우스가 클릭한 위치의 xy좌표 출려
		System.out.println(e.getButton());	// 클릭한 버튼의 번호 좌(1), 휠(2), 우(3)
		System.out.println(e.getClickCount());
	}
	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("mousePressed");
//		textArea.setText("mousePressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("mouseReleased");
//		textArea.setText("mouseReleased");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("mouseEntered");
//		textField.setText("mouseEntered");
	}
	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("mouseExited");
//		textField.setText("mouseExited");
	}
}
