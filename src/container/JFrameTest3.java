package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JFrameTest3 extends JFrame {
	//상속을 통해 자신자체가 JFrame이 되도록
	
	public JFrameTest3() {
		setTitle("세번째 프로그램");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		//컨테이너 생성하기
		JFrameTest3 jframe3 = new JFrameTest3();
		
		
	}
}
