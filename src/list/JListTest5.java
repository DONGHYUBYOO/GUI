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

public class JListTest5 extends JFrame implements ListSelectionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JList<String> list; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListTest5 frame = new JListTest5();
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
	public JListTest5() {
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
		panel.setLayout(new GridLayout(0, 2, 10, 0));
		
		list = new JList<>();
		list.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "명왕성", "해왕성"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(list);
		list.addListSelectionListener(this);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		panel.add(textArea);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {		
		//ListSelectionEvent
		//	아이템을 선택하는 시점, 마우스에서 손을 떼는 시점
		
		List<String> select = null; /*new ArrayList<String>();*/
		if(e.getValueIsAdjusting()) {
			select = list.getSelectedValuesList();
			for(String selects:select) {
				textArea.append(selects+" ");				
			}
			System.out.println(select);			
		}
	}
}
