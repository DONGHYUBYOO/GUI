package checkBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class JCheckTest2 extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chbox3;
	private JCheckBox chbox1;
	private JCheckBox chbox2;
	private JTextArea textArea;
	private String a="",b="",c="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckTest2 frame = new JCheckTest2();
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
	public JCheckTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		chbox1 = new JCheckBox("망고");
		panel_1.add(chbox1);
		
		chbox2 = new JCheckBox("수박");
		panel_1.add(chbox2);
		
		chbox3 = new JCheckBox("딸기");
		panel_1.add(chbox3);
		
		textArea = new JTextArea();
		panel.add(textArea);
		
		chbox1.addItemListener(this);
		chbox2.addItemListener(this);
		chbox3.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//각 체크박스가 체크되면 체크된 과일의 이름을 textArea에 보여주기 
		//체크가 해제되면 textArea에 있던 과일의 이름은 삭제 
		//textArea -> setText(), append()		
		
		JCheckBox chbox = (JCheckBox) e.getItem();
		if(e.getStateChange()==e.SELECTED) {
			textArea.append(""+chbox.getText());
		}else {
			String chTxt = textArea.getText();	//textArea의 전체 문자열
			//체크가 해제된 체크박스 문자열
			String delTxt = chbox.getText();
			
			//String에서는 문자열의 수정이 불가능 하기 때문에
			StringBuffer sb = new StringBuffer(chTxt);
			int start=sb.indexOf(delTxt);	//삭제할 단어의 시작위치 설정
			int end=start+delTxt.length();	//시작위치+삭제할 단어의 길이를 통해 끝위치 설정
			sb.delete(start, end);	//해당 인덱스를 통해 글자 삭제
			textArea.setText(sb.toString());
			
			//replace 사용시
			
		}
//		if(e.getStateChange()==e.SELECTED) {
//			if(chbox==chbox1) {
//				a=chbox1.getText();								
//			}else if(chbox==chbox2) {
//				b=chbox2.getText();
//			}else {
//				c=chbox3.getText();
//			}
//		}else {
//			if(chbox==chbox1) {
//				a="";
//			}else if(chbox==chbox2) {
//				b="";
//			}else {
//				c="";
//			}
//		}
//		textArea.setText(a+b+c);
	}
}
