package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JpanelTest2 extends JFrame {

	public JpanelTest2() {
		setTitle("MyFrame");
		setBounds(100, 100, 500, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalPane = new JPanel();
		
		//상단 레이아웃에 라벨 바로 부착
		JLabel topLabel = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		totalPane.add(topLabel, BorderLayout.NORTH);
		
		//센터 레이아웃에 JPanel 부착
		JPanel centerPane = new JPanel();
		JButton btn1 = new JButton("콤보피자");
		JButton btn2 = new JButton("포테이토피자");
		JButton btn3 = new JButton("불고기피자");
		JLabel label = new JLabel("개수");
		JTextField textField = new JTextField(10);
		
		centerPane.add(btn1);
		centerPane.add(btn2);
		centerPane.add(btn3);
		centerPane.add(label);
		centerPane.add(textField);
		totalPane.add(centerPane, BorderLayout.CENTER);
		
		add(totalPane);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JpanelTest2 test = new JpanelTest2();
	}
}
