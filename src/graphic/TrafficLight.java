package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.JButton;
import java.awt.Font;

class MyCanvas5 extends JPanel implements ActionListener {
	
	private int lightNumber =0;
	
	public MyCanvas5() {
		setLayout(new BorderLayout());
		JButton btn = new JButton("Traffic light turn On");
		btn.addActionListener(this);
		add(btn,BorderLayout.SOUTH);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(100, 20, 80, 80);
		g.drawOval(100, 100, 80, 80);
		g.drawOval(100, 180, 80, 80);
		
		if(lightNumber==0) {
			g.setColor(Color.RED);
			g.fillOval(100, 20, 80, 80);
		}else if(lightNumber==1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 100, 80, 80);			
		}else if(lightNumber==2) {
			g.setColor(Color.BLUE);
			g.fillOval(100, 180, 80, 80);			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(++lightNumber>2) {
			lightNumber=0;
		}
		repaint();
	}
}

public class TrafficLight extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficLight frame = new TrafficLight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TrafficLight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().add(new MyCanvas5());
	}	
}
