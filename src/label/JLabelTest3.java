package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import java.awt.GridLayout;

public class JLabelTest3 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1, lbl2, lbl3, lbl4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest3 frame = new JLabelTest3();
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
	public JLabelTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		add(getLabel1());
		add(getLabel2());
		add(getLabel3());
		add(getLabel4());
	}

	public JLabel getLabel1() {
		if(lbl1==null) {
			lbl1 = new JLabel();
			lbl1.setText("라벨 1");
			lbl1.setHorizontalAlignment(JLabel.LEFT);
			lbl1.setBorder(new EtchedBorder());
		}
		return lbl1;
	}
	public JLabel getLabel2() {
		if(lbl2==null) {
			lbl2 = new JLabel();
			lbl2.setText("라벨 2");
			lbl2.setIcon(new ImageIcon(getClass().getResource("camping-tent.png")));
			lbl2.setHorizontalAlignment(JLabel.CENTER);
			lbl2.setBorder(new EtchedBorder());
		}
		return lbl2;
	}
	public JLabel getLabel3() {
		if(lbl3==null) {
			lbl3 = new JLabel();
			lbl3.setText("라벨 3");
			lbl3.setIcon(new ImageIcon(getClass().getResource("camping-tent.png")));
			lbl3.setHorizontalAlignment(JLabel.CENTER);
			lbl3.setHorizontalTextPosition(JLabel.LEFT);
			lbl3.setBorder(new EtchedBorder());
		}
		return lbl3;
	}
	public JLabel getLabel4() {
		if(lbl4==null) {
			lbl4 = new JLabel();
			lbl4.setText("라벨 4");
			lbl4.setIcon(new ImageIcon(getClass().getResource("camping-tent.png")));
			lbl4.setHorizontalAlignment(JLabel.CENTER);
			lbl4.setIconTextGap(20);
			lbl4.setBorder(new EtchedBorder());
		}
		return lbl4;
	}	
}
