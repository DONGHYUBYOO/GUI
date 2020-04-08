package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest5 extends JFrame {
	//상속을 통해 자신자체가 JFrame이 되도록
	
	public JFrameTest5() {
		setTitle("다섯번째 프로그램");
		setBounds(200, 300, 800, 400);	//앞 2개 : 화면 좌표, 뒤 2개 : 화면 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//컴포넌트 생성하기
		JPanel panel = new JPanel();	//컨테이너 이면서 컴포넌트
		panel.setLayout(new FlowLayout());
		
		JButton jbutton1 = new JButton("OPEN");
		JButton jbutton2 = new JButton("SAVE");
		JCheckBox jcheck = new JCheckBox("GUI 프로그래밍");
		JColorChooser jcolor = new JColorChooser();
		
		//JPanel에 컴포넌트 부착
		//FlowLayout() 사용시 순서대로 부착 (jbutton1->jbutton2->jcheck->jcolor)
		panel.add(jbutton1);
		panel.add(jbutton2);
		panel.add(jcheck);
		panel.add(jcolor);
		
		//JPanel을 JFrame에 부착
		add(panel);	
	}
	public static void main(String[] args) {
		//컨테이너 생성하기
		JFrameTest5 jframe5 = new JFrameTest5();
		
		
	}
}
