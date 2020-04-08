package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JComboTest5 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnDelete;
	private JComboBox<String> combo;
	private DefaultComboBoxModel<String> model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest5 frame = new JComboTest5();
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
	public JComboTest5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);		
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		btnDelete = new JButton("삭제");
		panel.add(btnDelete);
		
		model = new DefaultComboBoxModel<String>();
		model.addElement("망고");
		model.addElement("딸기");
		combo = new JComboBox<>(model);
		panel.add(combo);
		
		btnDelete.addActionListener(this);		
		textField.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getActionCommand().equals("삭제")) {
			model.removeElement(combo.getSelectedItem());			
		}else if(e.getSource()==textField) {
			model.addElement(textField.getText());
			textField.setText("");			
		}
	}
}
