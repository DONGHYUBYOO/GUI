package container;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest6 extends JFrame {
	//상속을 통해 자신자체가 JFrame이 되도록
	
	public JFrameTest6() {
		setTitle("여섯번째 프로그램");
		setSize(100, 100);	//앞 2개 : 화면 좌표, 뒤 2개 : 화면 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//화면 중간에 JFrame 띄우기
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension screenSize=tk.getScreenSize();
		
		int x=(screenSize.width - getWidth())/2;
		int y=(screenSize.height - getHeight())/2;
		setLocation(x, y);
		
		//아이콘 변경
		java.net.URL url=getClass().getResource("icons8.gif");
		setIconImage(new ImageIcon(url).getImage());
	}
	public static void main(String[] args) {
		//컨테이너 생성하기
		JFrameTest6 jframe6 = new JFrameTest6();
		
		
	}
}
