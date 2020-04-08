package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutTest1 extends JFrame {
	
	public GridLayoutTest1() {
		setTitle("GridLayout");
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 설정
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 10, 5));
		
		//컴포넌트 추가
		JButton byn1 = new JButton("버튼1");
		JButton byn2 = new JButton("버튼2");
		JButton byn3 = new JButton("버튼3");
		JButton byn4 = new JButton("버튼4");
		JButton byn5 = new JButton("버튼5");
		JButton byn6 = new JButton("버튼6");
		
		//컴포넌트 부착
		panel.add(byn1);
		panel.add(byn2);
		panel.add(byn3);
		panel.add(byn4);
		panel.add(byn5);
		panel.add(byn6);
		
		//JPanel JFrame에 부착
		add(panel);
	}
	
	public static void main(String[] args) {
		GridLayoutTest1 grid = new GridLayoutTest1();
	}
}
