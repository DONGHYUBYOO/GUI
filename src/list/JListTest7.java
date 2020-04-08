package list;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.UserDAO;
import database.UserDAO2;
import database.UserVO;
import database.UserVO2;

import javax.swing.JScrollPane;
import javax.swing.JList;

public class JListTest7 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest7 frame = new JListTest7();
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
	public JListTest7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		//DB 연결 후 리스트 가져오기
		UserDAO2 dao = new UserDAO2();
		Vector<UserVO2> vectorList = dao.allUser();
		
		JList<UserVO2> list = new JList<>(vectorList);
		scrollPane.setViewportView(list);
	}

}
