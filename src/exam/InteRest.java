package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InteRest extends JFrame implements ActionListener {
	private JTextField field1, field2, field3;
	private JButton btn1;
	private int balance, result;
	private double percent;
	
	public InteRest() {
		setTitle("이자계산기");
		setSize(300, 170);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new BoxLayout(totalPane, BoxLayout.Y_AXIS));
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("원금을 입력하시오");
		field1 = new JTextField(10);
		panel1.add(label1);
		panel1.add(field1);
		totalPane.add(panel1, BorderLayout.CENTER);
		
		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel("이율을 입력하시오");
		field2 = new JTextField(10);
		panel2.add(label2);
		panel2.add(field2);
		totalPane.add(panel2, BorderLayout.CENTER);
		
		JPanel panel3 = new JPanel();
		btn1 = new JButton("변환");
		btn1.addActionListener(this);
		panel3.add(btn1);
		totalPane.add(panel3, BorderLayout.CENTER);
		
		JPanel panel4 = new JPanel();
		field3 = new JTextField(20);		
		panel4.add(field3);		
		totalPane.add(panel4, BorderLayout.CENTER);
		
		add(totalPane);
		setVisible(true);	
		pack();
	}
	
	public static void main(String[] args) {
		InteRest inteRest = new InteRest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		balance=Integer.parseInt(field1.getText());
		percent=Double.parseDouble(field2.getText());
		result=0;
		if(btn==btn1) {
			result=(int) (balance*percent);
		}
		field3.setText(result+" 원");
	}
}
