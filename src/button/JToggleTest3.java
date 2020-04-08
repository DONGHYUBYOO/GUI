package button;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class JToggleTest3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JToggleButton tglbtnNewToggleButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleTest3 frame = new JToggleTest3();
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
	public JToggleTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tglbtnNewToggleButton = new JToggleButton("토글버튼");	//두가지 기능(On/Off)
		tglbtnNewToggleButton.setFont(new Font("궁서체", Font.BOLD, 20));
		tglbtnNewToggleButton.addActionListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		btnNewButton = new JButton("일반버튼");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("궁서체", Font.BOLD, 20));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Action Event로 실행할 때는 아래와 같이 진행 가능
		//	this로 연결하여 한번에 처리할 시 일반버튼에서 에러 발생
		//	jbtn, jtoggltbtn의 부모인지 확인 후 Event 발생시켜 에러를 방지
		//		두 버튼의 부모인 Abstractbtn을 사용해도 무관
		//	각 버튼에 따로 붙여주어 해결도 가능
		
		AbstractButton btn = (AbstractButton) e.getSource();
		if(btn==btnNewButton) {
			lblNewLabel.setText("일반버튼 클릭");
		}else {
			if(btn.isSelected()) {
				lblNewLabel.setText("버튼 ON");
			}else {
				lblNewLabel.setText("버튼 OFF");
			}				
		}
		
//		if(e.getSource()==btnNewButton) {
//			lblNewLabel.setText("일반버튼 클릭");
//		}else {
//			JToggleButton tgl = (JToggleButton) e.getSource();
//			if(tgl.isSelected()) {
//				lblNewLabel.setText("버튼 ON");
//			}else {
//				lblNewLabel.setText("버튼 OFF");
//			}			
//		}
	}
}
