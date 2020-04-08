package list;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class JListTest4 extends JFrame implements ListSelectionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JList<String> list; 
	private DefaultListModel<String> model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest4 frame = new JListTest4();
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
	public JListTest4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addElement(textField.getText());
				textField.setText("");
			}
		});		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 10, 0));
		
		model = new DefaultListModel<String>();
		list = new JList<>(model);
		
		
		panel.add(list);
		list.addListSelectionListener(this);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		panel.add(textArea);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {		
		//JtextField에 작성한 단어 JList 추가
		//JList 목록 클릭시 삭제
		if(e.getValueIsAdjusting()) {
			model.removeElement(list.getSelectedValue());
		}
		
//		int pos = list.getSelectedIndex();
//		if(pos!=-1) {
//			model.removeElementAt(pos);
//		}
	}
}
