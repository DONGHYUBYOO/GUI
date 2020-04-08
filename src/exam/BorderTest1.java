package exam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class BorderTest1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderTest1 frame = new BorderTest1();
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
	public BorderTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		
//		Border border = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.YELLOW, Color.CYAN);
		TitledBorder border = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		border.setTitle("contentPane");
		border.setTitleFont(new Font("궁서체", Font.BOLD, 30));
		border.setTitleColor(Color.DARK_GRAY);
		border.setTitleJustification(TitledBorder.CENTER);	//타이틀 정렬
		border.setTitlePosition(TitledBorder.TOP);	//타이틀 위치
		contentPane.setBorder(border);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
