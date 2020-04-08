package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteLayoutTest1 extends JFrame {
	
	public AbsoluteLayoutTest1() {
		setTitle("AbsoluteLayout");
		setBounds(100,100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btn1 = new JButton("사과");
		btn1.setBounds(33, 24, 97, 23);
		panel.add(btn1);
		
		JButton btn2 = new JButton("망고");
		btn2.setBounds(297, 65, 150, 100);
		panel.add(btn2);
		
		JButton btn3 = new JButton("딸기");
		btn3.setBounds(73, 180, 200, 200);
		panel.add(btn3);
		
		add(panel);
	}
	
	public static void main(String[] args) {
		AbsoluteLayoutTest1 absolute = new AbsoluteLayoutTest1();
	}
}
