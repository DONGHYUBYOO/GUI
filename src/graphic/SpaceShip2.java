package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.Event;

class Ship1 extends JPanel {
	private BufferedImage img;
	private Timer timer;
	private int posX, posY;
	
	public Ship1() {		
		setBackground(Color.BLACK);
//		setBackground(new ImageIcon(getClass().getResource("hubble.jpg")));
		try {
			URL url=getClass().getResource("ship.jpg");
			img=ImageIO.read(new File(url.getFile()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		posX=0;
		posY=250;
		
		setFocusable(true);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = (int) e.getKeyCode();
				//네개의 화살표에 따라 움직이기
				if(keyCode==KeyEvent.VK_RIGHT) {
					posX+=10;
				}else if(keyCode==KeyEvent.VK_LEFT) {
					posX-=10;
				}else if(keyCode==KeyEvent.VK_UP) {
					posY-=10;
				}else {
					posY+=10;
				}
				repaint();
			}
		});
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, posX, posY, null);
	}	
}

public class SpaceShip2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpaceShip2 frame = new SpaceShip2();
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
	public SpaceShip2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(new Ship1());
	}
}
