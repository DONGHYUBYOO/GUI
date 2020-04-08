package radio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JRadioTest2 extends JFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private JRadioButton rdbtn1, rdbtn2, rdbtn3, rdbtn4, rdbtn5;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest2 frame = new JRadioTest2();
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
	public JRadioTest2() {
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
		
		rdbtn1.addActionListener(this);
		rdbtn2.addActionListener(this);
		rdbtn3.addActionListener(this);
		rdbtn4.addActionListener(this);
		rdbtn5.addActionListener(this);
		rdbtn1.addItemListener(this);
		rdbtn2.addItemListener(this);
		rdbtn3.addItemListener(this);
		rdbtn4.addItemListener(this);
		rdbtn5.addItemListener(this);
		//버튼그룹 생성
		//라디오버튼은 그룹으로 묶어서 하나만 선택 되도록 설정
		ButtonGroup group = new ButtonGroup();	
		group.add(rdbtn1);
		group.add(rdbtn2);
		group.add(rdbtn3);
		group.add(rdbtn4);
		group.add(rdbtn5);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		JRadioButton radio = (JRadioButton) e.getSource();
//		if(radio.isSelected()) {
//			System.out.println("선택됨");
//		}else {
//			System.out.println("선택 안됨");
//		}
//		textField.setText(e.getActionCommand());
//		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		if(e.getStateChange()==e.SELECTED) {
			if(radio==rdbtn1) {
				System.out.println("사막여우 선택");
			}else if(radio==rdbtn2) {
				System.out.println("사모예드 선택");
			}
		}else {
			if(radio==rdbtn1) {
				System.out.println("사막여우 해제");
			}else if(radio==rdbtn2) {
				System.out.println("사모예드 해제");
			}
		}
	}

}
