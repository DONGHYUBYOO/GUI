package radio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.StyledEditorKit.BoldAction;

public class JRadioTest3 extends JFrame implements ActionListener {

	private JPanel contentPane, panel, panel_1, panel_2;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JRadioButton rdSmall, rdMedium, rdLarge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest3 frame = new JRadioTest3();
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
	public JRadioTest3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("어떤 크기의 피자를 주문하시겠습니까?");
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uC0AC\uC774\uB4DC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setToolTipText("");
		contentPane.add(panel_1);
		
		rdSmall = new JRadioButton("작은거");
		panel_1.add(rdSmall);
		
		rdMedium = new JRadioButton("중간거");
		panel_1.add(rdMedium);
		
		rdLarge = new JRadioButton("큰거");
		panel_1.add(rdLarge);
		rdSmall.addActionListener(this);
		rdMedium.addActionListener(this);
		rdLarge.addActionListener(this);
		ButtonGroup group = new ButtonGroup();
		group.add(rdSmall);
		group.add(rdMedium);
		group.add(rdLarge);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource()==rdSmall) {
			textField.setText("작은거 피자 선택 되었습니다.");
		}else if(e.getSource()==rdMedium) {
			textField.setText("중간거 피자 선택 되었습니다.");			
		}else {
			textField.setText("큰거 피자 선택 되었습니다.");			
		}
		textField.setForeground(Color.RED);
	}
}
