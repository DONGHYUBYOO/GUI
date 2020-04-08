package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JFrameTest4 extends JFrame {
	//상속을 통해 자신자체가 JFrame이 되도록
	
	public JFrameTest4() {
		setTitle("네번째 프로그램");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//컴포넌트 생성하기
		JButton jbutton1 = new JButton("OPEN");
		JButton jbutton2 = new JButton("SAVE");
		JCheckBox jcheck = new JCheckBox("GUI 프로그래밍");
		JColorChooser jcolor = new JColorChooser();
		
		//컴포넌트 부착
		add(jbutton1, BorderLayout.EAST);
		add(jbutton2, BorderLayout.WEST);
		add(jcheck, BorderLayout.NORTH);
		add(jcolor, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		//컨테이너 생성하기
		JFrameTest4 jframe4 = new JFrameTest4();
		
		
	}
}
