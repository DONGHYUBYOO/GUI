package exam;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel2 extends JPanel {
	BufferedImage img=null;
	int img_x=100, img_y=100;
	public MyPanel2() {
		URL url=getClass().getResource("car.gif");
		try {
			img=ImageIO.read(new File(url.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {				
			}			
			@Override
			public void mousePressed(MouseEvent e) {				
			}			
			@Override
			public void mouseExited(MouseEvent e) {				
			}			
			@Override
			public void mouseEntered(MouseEvent e) {					
			}			
			@Override
			public void mouseClicked(MouseEvent e) {				
				if(e.getButton()==1) {
					img_x=e.getX();
					img_y=e.getY();
					repaint();
				}
			}
		});
//		this.requestFocus();
//		setFocusable(true);
		
		addKeyListener(new KeyListener() {			
			@Override
			public void keyTyped(KeyEvent e) {				
			}			
			@Override
			public void keyReleased(KeyEvent e) {				
			}			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode=e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					img_y-=50;
					break;
				case KeyEvent.VK_DOWN:
					img_y+=50;
					break;
				case KeyEvent.VK_LEFT:	
					img_x-=50;
					break;
				case KeyEvent.VK_RIGHT:					
					img_x+=50;
					break;
				}
				repaint();
			}
		});
		//포커스 요청하기
		this.requestFocus();
		setFocusable(true);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);	//그림을 그려주는 메소드
	}
}

public class CarGame2 extends JFrame implements KeyListener,MouseListener {	
	public CarGame2() {
		setTitle("자동차 게임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel2());		
	}
	public static void main(String[] args) {
		CarGame2 cg = new CarGame2();
		cg.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {			
	}
	@Override
	public void keyPressed(KeyEvent e) {		
	}
	@Override
	public void keyReleased(KeyEvent e) {		
	}
	@Override
	public void mouseClicked(MouseEvent e) {		
	}
	@Override
	public void mousePressed(MouseEvent e) {		
	}
	@Override
	public void mouseReleased(MouseEvent e) {		
	}
	@Override
	public void mouseEntered(MouseEvent e) {		
	}
	@Override
	public void mouseExited(MouseEvent e) {		
	}
}
