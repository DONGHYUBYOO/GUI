package optionPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class JOptionPaneTest1 extends JFrame implements ActionListener{

	private JPanel contentPane, panel;
	private JButton btnConfirm, btnMsg, btnInput, btnOpt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneTest1 frame = new JOptionPaneTest1();
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
	public JOptionPaneTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);
		
		btnMsg = new JButton("Message");
		btnMsg.addActionListener(this);
		panel.add(btnMsg);
		
		btnInput = new JButton("Input");
		btnInput.addActionListener(this);
		panel.add(btnInput);
		
		btnOpt = new JButton("Option");
		btnOpt.addActionListener(this);
		panel.add(btnOpt);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		if(btn==btnConfirm) {
			JOptionPane.showConfirmDialog(getParent(), "대화상자 만들기","대화상자",JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
		}else if(btn==btnMsg) {
			JOptionPane.showMessageDialog(this, "정말 삭제하시겠습니까?", "삭제", JOptionPane.WARNING_MESSAGE, null);
		}else if(btn==btnInput) {
//			JOptionPane.showInputDialog(this, "입력하세요.");
			String values[] = {"=== 선 택 ===", "감자", "고구마", "수박"};
			JOptionPane.showInputDialog(this, "선택하세요", "선택", JOptionPane.PLAIN_MESSAGE, null, values, values[0]);
		}else if(btn==btnOpt){
			String options[] = {"Well-Done", "Medium", "Rare"};
			JOptionPane.showOptionDialog(this, "굽기 정도 선택", "굽기", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		}
	}
}
