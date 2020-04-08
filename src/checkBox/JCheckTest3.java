package checkBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class JCheckTest3 extends JFrame {

	private JPanel contentPane;
	private ButtonGroup group;
	private JCheckBox chbox1, chbox2, chbox3, chbox4, chbox5, chbox6; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest3 frame = new JCheckTest3();
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
	public JCheckTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lbl = new JLabel("New label");
		contentPane.add(lbl, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		chbox1 = new JCheckBox("New check box");
		panel.add(chbox1);
		
		chbox4 = new JCheckBox("New check box");
		panel.add(chbox4);
		
		chbox2 = new JCheckBox("New check box");
		panel.add(chbox2);
		
		chbox5 = new JCheckBox("New check box");
		panel.add(chbox5);
		
		chbox3 = new JCheckBox("New check box");
		panel.add(chbox3);
		
		chbox6 = new JCheckBox("New check box");
		panel.add(chbox6);
		
		group = new ButtonGroup();
		group.add(chbox1);
		group.add(chbox2);
		group.add(chbox3);
		group.add(chbox4);
		group.add(chbox5);
		group.add(chbox6);		
	}
}
