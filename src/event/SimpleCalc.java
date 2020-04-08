package event;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SimpleCalc extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtOp1;
	private JTextField txtOp2;
	private JTextField txtResult;
	private JButton btnOk;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc frame = new SimpleCalc();
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
	public SimpleCalc() {
		setTitle("덧셈 전용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		panel.add(txtOp1);
		txtOp1.setColumns(5);
		
		JLabel labelPlus = new JLabel("+");
		panel.add(labelPlus);
		
		txtOp2 = new JTextField();
		panel.add(txtOp2);
		txtOp2.setColumns(5);
		
		JLabel labelEqual = new JLabel("=");
		panel.add(labelEqual);
		
		txtResult = new JTextField();
		panel.add(txtResult);
		txtResult.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		btnOk = new JButton("확 인");
		btnOk.addActionListener(this);
		panel_1.add(btnOk);
		
		btnCancel = new JButton("취 소");
		btnCancel.addActionListener(this);
		panel_1.add(btnCancel);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOk) {
			//txtOp1, txtOp2 숫자를 가져와서 더하기를 한 후 txtResult에 결과값 보여주기
			int op1=Integer.parseInt(txtOp1.getText());
			int op2=Integer.parseInt(txtOp2.getText());
			//txtResult 결과 표시
			txtResult.setText(String.valueOf(op1+op2));
		}else if(e.getSource()==btnCancel) {
			//txtOp1, txtOp2, txtResult 초기화
			txtOp1.setText("");
			txtOp2.setText("");
			txtResult.setText("");
		}
	}
}
