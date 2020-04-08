package text;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPasswordTest extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPasswordTest frame = new JPasswordTest();
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
	public JPasswordTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('?');
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				lblNewLabel.setText(new String(passwordField.getPassword()));	//String객체에 character 배열을 넣는다
				lblNewLabel.setText(String.valueOf((passwordField.getPassword())));	//String.valueof로 표시한다				
			}
		});
		contentPane.add(passwordField, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
	}

}
