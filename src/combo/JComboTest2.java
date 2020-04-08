package combo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.lang.reflect.Field;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JComboTest2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField field;
	JComboBox<String> comboBox, combo, combo1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboTest2 frame = new JComboTest2();
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
	public JComboTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		comboBox = new JComboBox<>();	//제네릭 타입이 정의되지 않으면 노란표시줄 활성화 but, 없어도 실행에 지장을 주지는 않는다.
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"수성", "금성", "지구", "화성", "목성", "토성", "천왕성", "명왕성"}));
		contentPane.add(comboBox, BorderLayout.NORTH);
		
		//콤보박스에 들어갈 아이템 설정 (String)
		String[] items = {"일", "월", "화", "수", "목", "금", "토"};
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(items);
		combo = new JComboBox<String>();
		combo.setModel(model);
		contentPane.add(combo,BorderLayout.SOUTH);
		
		//콤보박스에 들어갈 아이템 설정 (Vector)
		Vector<String> vector = new Vector<String>();
		vector.add("사과");
		vector.add("딸기");
		vector.add("망고");
		vector.add("수박");
		vector.add("키위");
		combo1 = new JComboBox<String>(vector);
		combo1.setSelectedIndex(-1);
//		combo1.setSelectedItem("딸기");
		contentPane.add(combo1, BorderLayout.WEST);
		
		field = new JTextField();
		contentPane.add(field, BorderLayout.EAST);
		
		combo1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		field.setText(combo1.getSelectedItem().toString());
	}
}
