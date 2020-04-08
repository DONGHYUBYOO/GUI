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
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class JToggleTest2 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JToggleTest2 frame = new JToggleTest2();
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
	public JToggleTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("토글버튼");	//두가지 기능(On/Off)
		tglbtnNewToggleButton.setFont(new Font("궁서체", Font.BOLD, 20));
		tglbtnNewToggleButton.addItemListener(this);
		contentPane.add(tglbtnNewToggleButton, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("일반버튼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("일반버튼 클릭");
			}
		});
		btnNewButton.setFont(new Font("궁서체", Font.BOLD, 20));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==1) {
			lblNewLabel.setText("버튼 ON");
		}else {
			lblNewLabel.setText("버튼 OFF");
		}
	}
}
