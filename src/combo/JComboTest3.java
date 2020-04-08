package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.IconUIResource;

public class JComboTest3 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest3 frame = new JComboTest3();
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
	public JComboTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String items[] = {"Bird", "Cat", "Dog", "Pig", "Rabbit"};
		JComboBox<String> combo = new JComboBox<String>(items);
		combo.setSelectedIndex(-1);
		contentPane.add(combo, BorderLayout.NORTH);
		
		label = new JLabel("",SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
		
		combo.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
//		String animal = (String) e.getItem();
//		updateIcon(animal);
		
		String cBox = (String) e.getItem();
		ImageIcon icon = null;		
		if(cBox.equals("Bird")) {
			icon = new ImageIcon(getClass().getResource("Bird.gif"));
			label.setIcon(icon);
		}else if(cBox.equals("Cat")) {
			icon = new ImageIcon(getClass().getResource("Cat.gif"));
			label.setIcon(icon);
		}else if(cBox.equals("Dog")) {
			icon = new ImageIcon(getClass().getResource("Dog.gif"));
			label.setIcon(icon);
		}else if(cBox.equals("Pig")) {
			icon = new ImageIcon(getClass().getResource("Pig.gif"));
			label.setIcon(icon);
		}else if(cBox.equals("Rabbit")) {
			icon = new ImageIcon(getClass().getResource("Rabbit.gif"));
			label.setIcon(icon);
		}		
	}	
	
	public void updateIcon(String animal) {
		ImageIcon icon = new ImageIcon(getClass().getResource(animal+".gif"));
		label.setIcon(icon);
	}
}
