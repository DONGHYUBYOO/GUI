package graphic;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Rectangle2D.Float;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


class MyPanel extends JPanel {
	ArrayList<Shape> shapeArray = new ArrayList<>();
	
	public MyPanel() {
		Shape s;
		
		s = new Rectangle2D.Float(10, 10, 70, 80);
		shapeArray.add(s);
		
		s = new RoundRectangle2D.Float(110, 10, 70, 80, 20, 20);
		shapeArray.add(s);
		
		s = new Ellipse2D.Float(210, 10, 80, 80);
		shapeArray.add(s);
		
		s = new Arc2D.Float(310, 10, 80, 80, 90, 90, Arc2D.OPEN);
		shapeArray.add(s);
		
		s = new Arc2D.Float(410, 10, 80, 80, 0, 180, Arc2D.CHORD);
		shapeArray.add(s);
		
		s = new Arc2D.Float(510, 10, 80, 80, 45, 90, Arc2D.PIE);
		shapeArray.add(s);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//선의 표현을 매끄럽게 하기 위해서
		
		g2.setStroke(new BasicStroke(3));	//두께를 표현
		
		GradientPaint gp = new GradientPaint(0, 10, Color.WHITE, 0, 70, Color.BLUE);
		
		int i=0;
		for(Shape s:shapeArray) {	//배열의 도형들을 하나씩 꺼내서 그려 넣기
			if(i%2==0) {
				g2.setPaint(Color.MAGENTA);
				g2.fill(s);
			}else {
				g2.setPaint(gp);
				g2.fill(s);				
			}
			i++;
			//g2.draw(s);
		}
	}
}

public class MoreShapes extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoreShapes frame = new MoreShapes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MoreShapes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(new MyPanel());
	}
}
