package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class JRadioTest1 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtn1, rdbtn2, rdbtn3, rdbtn4, rdbtn5;
	private JPanel panel;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest1 frame = new JRadioTest1();
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
	public JRadioTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("선호하는 반려동물은?");
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdbtn1 = new JRadioButton("사막여우");
		panel.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("사모예드");
		panel.add(rdbtn2);
		
		rdbtn3 = new JRadioButton("코코");
		panel.add(rdbtn3);
		
		rdbtn4 = new JRadioButton("루루");
		panel.add(rdbtn4);
		
		rdbtn5 = new JRadioButton("디디");
		panel.add(rdbtn5);
		
		//버튼그룹 생성
		//라디오버튼은 그룹으로 묶어서 하나만 선택 되도록 설정
		ButtonGroup group = new ButtonGroup();	
		group.add(rdbtn1);
		group.add(rdbtn2);
		group.add(rdbtn3);
		group.add(rdbtn4);
		group.add(rdbtn5);
	}

}
