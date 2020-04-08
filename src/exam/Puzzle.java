package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyBtn extends JButton {
	static int COUNT=1;
	int index;	//자리값을 표시하기 위한 index
	
	public MyBtn(String str) {
		super(str);
		index=COUNT++;
	}
}
public class Puzzle extends JFrame implements ActionListener {

	private JPanel contentPane, keyPane;
	private JButton btnReset;
	private JButton btns[] = new JButton[9];
	
	public Puzzle() {
		setTitle("퍼즐");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		keyPane = new JPanel();
		keyPane.setLayout(new GridLayout(0, 3));
		contentPane.add(keyPane, BorderLayout.CENTER);
		
		for(int i=0 ; i<btns.length-1 ; i++) {
			btns[i] = new MyBtn(i+1+"");
			btns[i].addActionListener(this);
//			btns[i].setActionCommand(i+1+"");
			keyPane.add(btns[i]);			
		}
		btns[8] = new MyBtn("");
		btns[8].addActionListener(this);
//		btns[8].setActionCommand(9+"");
		keyPane.add(btns[8]);
		
		btnReset = new MyBtn("리 셋");
		btnReset.addActionListener(this);
		contentPane.add(btnReset, BorderLayout.SOUTH);
		
		add(contentPane);
	}
	
	public static void main(String[] args) {
		Puzzle puzzle = new Puzzle();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		MyBtn btn = (MyBtn) e.getSource();
		System.out.println(btn.index);
		System.out.println(btn);
		
		if(btn.index==1) {
			if(btns[1].getText().equals("")) {
				btns[1].setText(btn.getText());
				btn.setText("");
			}
			if(btns[3].getText().equals("")) {
				btns[3].setText(btn.getText());
				btn.setText("");
			}			
		}else if(btn.index==2) {
			if(btns[0].getText().equals("")) {
				btns[0].setText(btn.getText());
				btn.setText("");
			}
			if(btns[2].getText().equals("")) {
				btns[2].setText(btn.getText());
				btn.setText("");
			}
			if(btns[4].getText().equals("")) {
				btns[4].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==3) {
			if(btns[1].getText().equals("")) {
				btns[1].setText(btn.getText());
				btn.setText("");
			}
			if(btns[5].getText().equals("")) {
				btns[5].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==4) {
			if(btns[0].getText().equals("")) {
				btns[0].setText(btn.getText());
				btn.setText("");
			}
			if(btns[4].getText().equals("")) {
				btns[4].setText(btn.getText());
				btn.setText("");
			}
			if(btns[6].getText().equals("")) {
				btns[6].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==5) {
			if(btns[1].getText().equals("")) {
				btns[1].setText(btn.getText());
				btn.setText("");
			}
			if(btns[3].getText().equals("")) {
				btns[3].setText(btn.getText());
				btn.setText("");
			}
			if(btns[5].getText().equals("")) {
				btns[5].setText(btn.getText());
				btn.setText("");
			}
			if(btns[7].getText().equals("")) {
				btns[7].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==6) {
			if(btns[2].getText().equals("")) {
				btns[2].setText(btn.getText());
				btn.setText("");
			}
			if(btns[4].getText().equals("")) {
				btns[4].setText(btn.getText());
				btn.setText("");
			}
			if(btns[8].getText().equals("")) {
				btns[8].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==7) {
			if(btns[3].getText().equals("")) {
				btns[3].setText(btn.getText());
				btn.setText("");
			}
			if(btns[7].getText().equals("")) {
				btns[7].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==8) {
			if(btns[8].getText().equals("")) {
				btns[8].setText(btn.getText());
				btn.setText("");
			}
			if(btns[4].getText().equals("")) {
				btns[4].setText(btn.getText());
				btn.setText("");
			}
			if(btns[6].getText().equals("")) {
				btns[6].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.index==9) {
			if(btns[5].getText().equals("")) {
				btns[5].setText(btn.getText());
				btn.setText("");
			}
			if(btns[7].getText().equals("")) {
				btns[7].setText(btn.getText());
				btn.setText("");
			}
		}else if(btn.getText().equals("리 셋")) {
			for(int i=0;i<btns.length-1;i++) {
				btns[i].setText((i+1)+"");
			}				
			//8번 버튼은 비워놓기
			btns[8].setText("");
		}
	}
}
