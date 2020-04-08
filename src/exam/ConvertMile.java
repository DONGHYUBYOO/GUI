package exam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertMile extends JFrame implements ActionListener {
	private JButton centerBtn;
	private JTextField topField, bottomField;
	double mile;
	
	public ConvertMile() {
		setTitle("마일을 킬로미터로 변환");
		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new BorderLayout());
		
		JPanel topPane = new JPanel();
		JLabel topLabel = new JLabel("거리를 마일 단위로 입력하세요");
		topField = new JTextField(10);
		topPane.add(topLabel);
		topPane.add(topField);
		totalPane.add(topPane, BorderLayout.NORTH);
		
		JPanel centerPane = new JPanel();
		centerBtn = new JButton("변환");
		centerBtn.addActionListener(this);
		centerPane.add(centerBtn);
		totalPane.add(centerPane, BorderLayout.CENTER);
		
		JPanel bottomPane = new JPanel();
		bottomField = new JTextField(20);
		bottomPane.add(bottomField);
		totalPane.add(bottomPane, BorderLayout.SOUTH);
		
		add(totalPane);
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		ConvertMile convert = new ConvertMile();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		mile=Double.parseDouble(topField.getText());
		double km=0;
		if(btn==centerBtn) {
			km=mile*1.6;
		}
		bottomField.setText(km+" km");		
	}
}
