package checkBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FruitBox extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chboxApple, chboxGrape, chboxOrange;
	private JLabel lblApple, lblGrape, lblOrange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FruitBox frame = new FruitBox();
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
	public FruitBox() {
		setTitle("후르츠 박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		chboxApple = new JCheckBox("Apple");
		chboxApple.setFont(new Font("돋움", Font.BOLD, 20));
		chboxApple.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chboxApple);
		
		chboxGrape = new JCheckBox("Grape");
		chboxGrape.setFont(new Font("돋움", Font.BOLD, 20));
		chboxGrape.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chboxGrape);
		
		chboxOrange = new JCheckBox("Orange");
		chboxOrange.setFont(new Font("돋움", Font.BOLD, 20));
		chboxOrange.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(chboxOrange);
		
		lblApple = new JLabel("");
		contentPane.add(lblApple);
		
		lblGrape = new JLabel("");
		contentPane.add(lblGrape);
		
		lblOrange = new JLabel("");
		contentPane.add(lblOrange);
		
		chboxApple.addItemListener(this);
		chboxGrape.addItemListener(this);
		chboxOrange.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ImageIcon apple = new ImageIcon(getClass().getResource("apple.gif"));
		ImageIcon grape = new ImageIcon(getClass().getResource("grape.gif"));
		ImageIcon orange = new ImageIcon(getClass().getResource("orange.gif"));
		JCheckBox chbox = (JCheckBox) e.getItem();
		if(e.getStateChange()==e.SELECTED) {
			if(chbox.getText().equals("Apple")) {
				lblApple.setIcon(apple);
			}else if(chbox.getText().equals("Grape")) {
				lblGrape.setIcon(grape);
			}else if(chbox.getText().equals("Orange")) {
				lblOrange.setIcon(orange);
			}			
		}else {
			if(chbox.getText().equals("Apple")) {
				lblApple.setIcon(null);
			}else if(chbox.getText().equals("Grape")) {
				lblGrape.setIcon(null);
			}else if(chbox.getText().equals("Orange")) {
				lblOrange.setIcon(null);
			}	
		}		
		
//		if(e.getStateChange()==e.SELECTED) {
//			if(e.getItem()==chboxApple) {
//				lblApple.setIcon(apple);
//			}else if(e.getItem()==chboxGrape) {
//				lblGrape.setIcon(grape);
//			}else if(e.getItem()==chboxOrange) {
//				lblOrange.setIcon(orange);
//			}			
//		}else {
//			if(e.getItem()==chboxApple) {
//				lblApple.setIcon(null);
//			}else if(e.getItem()==chboxGrape) {
//				lblGrape.setIcon(null);
//			}else if(e.getItem()==chboxOrange) {
//				lblOrange.setIcon(null);
//			}	
//		}
	}	
}
