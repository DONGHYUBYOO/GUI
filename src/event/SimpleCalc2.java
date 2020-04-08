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

public class SimpleCalc2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtOp1, txtOp2, txtResult;
	private JButton btnReset, btnExit, btnPlus, btnSub, btnMulti, btnDivide;
	int op1, op2;
	private JLabel labelSymbol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc2 frame = new SimpleCalc2();
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
	public SimpleCalc2() {
		setTitle("사칙연산 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		txtOp1 = new JTextField();
		panel.add(txtOp1);
		txtOp1.setColumns(5);
		
		labelSymbol = new JLabel("?");
		panel.add(labelSymbol);
		
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
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(this);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(this);
		panel_1.add(btnPlus);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		panel_1.add(btnSub);
		
		btnMulti = new JButton("*");
		btnMulti.addActionListener(this);
		panel_1.add(btnMulti);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(this);
		panel_1.add(btnDivide);
		panel_1.add(btnReset);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		panel_1.add(btnExit);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		getOp();
		int result=0;
		if(btn==btnPlus) {
			labelSymbol.setText("+");
			result=op1+op2;
		}else if(btn==btnSub) {
			labelSymbol.setText("-");
			result=op1-op2;			
		}else if(btn==btnMulti) {
			labelSymbol.setText("*");
			result=op1*op2;			
		}else if(btn==btnDivide) {
			labelSymbol.setText("/");
			result=op1/op2;			
		}else if(btn==btnReset) {
			txtOp1.setText("");
			txtOp2.setText("");
			txtResult.setText("");			
		}else {
			System.exit(0);			
		}
		txtResult.setText(result+"");
//		if(e.getSource()==btnPlus) {
//			//txtOp1, txtOp2 숫자를 가져오기
//			getOp();
//			//사칙연산 라벨 표시
//			labelSymbol.setText("+");
//			//txtResult 결과 표시
//			txtResult.setText(String.valueOf(op1+op2));
//		}else if(e.getSource()==btnSub) {
//			getOp();
//			labelSymbol.setText("-");
//			txtResult.setText(String.valueOf(op1-op2));
//		}else if(e.getSource()==btnMulti) {
//			getOp();
//			labelSymbol.setText("*");
//			txtResult.setText(String.valueOf(op1*op2));
//		}else if(e.getSource()==btnDivide) {
//			getOp();
//			labelSymbol.setText("/");
//			txtResult.setText(String.valueOf(op1/op2));
//		}else if(e.getSource()==btnReset) {
//			//txtOp1, txtOp2, txtResult 초기화
//			txtOp1.setText("");
//			txtOp2.setText("");
//			txtResult.setText("");
//		}else {
//			System.exit(0);
//		}
	}
	public void getOp() {
		op1=Integer.parseInt(txtOp1.getText());
		op2=Integer.parseInt(txtOp2.getText());
	}
}
