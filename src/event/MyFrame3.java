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

//이벤트 처리를 위한 클래스를 내부 클래스로 작성하기
//	A객체만 생성하면 B클래스를 사용 가능
//	두 클래스의 멤버를 서로 쉽게 접근 가능
//class A{
//	private JLabel label;
//	class B{
//		label.
//	}
//}

public class MyFrame3 extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame3 frame = new MyFrame3();
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
	public MyFrame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("버튼을 누르세요.");
		panel.add(btnNewButton);
		//버튼과 리스너를 연동하는 부분
		btnNewButton.addActionListener(new MyListener2());
		
		label = new JLabel("New label");
		panel.add(label);
	}
	class MyListener2 implements ActionListener {	//버튼의 눌림에 대한 이벤트를 정의하기 위해선 ActionListener

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
			//버튼위의 글자 변경
			JButton btn=(JButton) e.getSource();	//JButton으로 강제 형변환
			btn.setText("눌렸습니다.");
			btn.setBackground(Color.PINK);
			//라벨의 글자 변경
			label.setText("버튼이 눌러졌습니다");
		}
	}
}
