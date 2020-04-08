package layout;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;

public class JpanelTest1 extends JFrame {
	
	public JpanelTest1() {
		setTitle("여러가지 레이아웃");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel totalPane = new JPanel();
		totalPane.setLayout(new BorderLayout());
		
		//상단 레이아웃
		JPanel topPane = new JPanel();	
		JButton topBtn1 = new JButton("왼쪽");
		JButton topBtn2 = new JButton("가운데");
		JButton topBtn3 = new JButton("오른쪽");		
		topPane.add(topBtn1);
		topPane.add(topBtn2);
		topPane.add(topBtn3);
		totalPane.add(topPane, BorderLayout.NORTH);
		
		//좌측 레이아웃
		JPanel leftPane = new JPanel();
		JButton leftBtn1 = new JButton("수박");
		leftPane.add(leftBtn1);
		totalPane.add(leftPane, BorderLayout.WEST);
		
		//우측 레이아웃
		JPanel rightPane = new JPanel();
		JButton rightBtn1 = new JButton("메론");
		rightPane.add(rightBtn1);
		totalPane.add(rightPane, BorderLayout.EAST);
		
		//센터 레이아웃
		JPanel centerPane = new JPanel();
		JLabel centerLabel = new JLabel("이름 ");
		JTextField field = new JTextField(6);
		JTree tree = new JTree();		
		centerPane.add(centerLabel);
		centerPane.add(field);
		centerPane.add(tree);
		totalPane.add(centerPane,BorderLayout.CENTER);
		
		//하단 레이아웃
		JButton bottomBtn1 = new JButton("남쪽버튼");
		totalPane.add(bottomBtn1, BorderLayout.SOUTH);
		
		add(totalPane);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JpanelTest1 jpanel = new JpanelTest1();
	}
}
