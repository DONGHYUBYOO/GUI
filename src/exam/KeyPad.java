package exam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {
	private JPanel contentPane, keyPane;
	private JTextField txtInput;
	private JButton[] btns = new JButton[9];
	
	public KeyPad() {
		setTitle("키패드");
		setBounds(800, 400, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		txtInput = new JTextField();
		txtInput.setFont(new Font("굴림", Font.BOLD, 20));
		contentPane.add(txtInput, BorderLayout.NORTH);
		
		keyPane = new JPanel();
		keyPane.setLayout(new GridLayout(0, 3));
		contentPane.add(keyPane, BorderLayout.CENTER);
		
		for(int i=0 ; i<btns.length ; i++) {
			btns[i] = new JButton((i+1)+"");
			btns[i].addActionListener(this);
			keyPane.add(btns[i]);
		}
		add(contentPane);
		pack();
	}
	
	public static void main(String[] args) {
		KeyPad keyPad = new KeyPad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼이 눌러지면 해당 버튼의 text값을 txtInput에 출력
//		JButton btn = (JButton) e.getSource();
		String num=e.getActionCommand();
		txtInput.setText(txtInput.getText()+num);	//getText+입력값을 통해 txtInput.setText로 뿌려준다		
	}
}
