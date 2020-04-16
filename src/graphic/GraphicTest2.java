package graphic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//도화지 역할
class MyCanvas2 extends JPanel implements MouseMotionListener {
	
	private int x=50, y=50;
	
	public MyCanvas2() {
		addMouseMotionListener(this);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);	//주석해제 시 -> 이전의 작업내용이 남지 않기 때문에 *가 마우스를 따라 움직이게 보인다.
		//도화지 위에 무엇인가를 그릴때 사용되는 메소드
		g.drawString("*", x, y);		//x, y의 좌표값을 통해 그려질 위치 설정
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		repaint();	//paintComponent를 호출하는 메소드
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
}

public class GraphicTest2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicTest2 frame = new GraphicTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GraphicTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(new MyCanvas2());
	}

}
