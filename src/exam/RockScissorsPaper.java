package exam;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorsPaper extends JFrame implements ActionListener {
	private JPanel contentPane, btnPane;
	private JLabel labelInfo;
	private JButton btns[] = new JButton[3];
	private JTextField txt;
	//가위바위보에 대한 상수 지정
	private static final int SCISSOR=0;
	private static final int ROCK=1;
	private static final int PAPER=2;
	
	public RockScissorsPaper() {
		setTitle("가위 바위 보");
		setBounds(800, 400, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		labelInfo = new JLabel();
		labelInfo.setText("아래의 버튼 중에서 하나를 클릭하세요.");
		contentPane.add(labelInfo, BorderLayout.NORTH);
		
		btnPane = new JPanel();
		btnPane.setLayout(new GridLayout(0, 3));		
		for(int i=0 ; i<btns.length ; i++) {
			btns[i] = new JButton();
			btns[i].addActionListener(this);
			btnPane.add(btns[i]);
		}
		btns[0].setText("가위");
		btns[1].setText("바위");
		btns[2].setText("보");
		contentPane.add(btnPane, BorderLayout.CENTER);
		
		txt = new JTextField();
		contentPane.add(txt, BorderLayout.SOUTH);
		add(contentPane);
	}
	
	public static void main(String[] args) {
		RockScissorsPaper rcp = new RockScissorsPaper();
		int random = (int) (Math.random()*3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd=e.getActionCommand();
		//컴퓨터의 가위, 바위, 보 생성하기
		Random random = new Random();
		//random.nextInt(3) : 괄호안의 숫자는 미포함해서 0,1,2 중에서 나오게 함
		int cpu = random.nextInt(3);
		//사용자가 누른 버튼의 값을 가져온 후 가위, 바위 보를 해서 누가 이겼는지 txt에 보여주기
		switch (cmd) {
		case "가위":
			switch (cpu) {
			case SCISSOR:
				txt.setText("무");
				break;
			case ROCK:
				txt.setText("패");				
				break;
			case PAPER:
				txt.setText("승");						
				break;
			}
			break;
		case "바위":
			switch (cpu) {
			case SCISSOR:
				txt.setText("승");
				break;
			case ROCK:
				txt.setText("무");				
				break;
			case PAPER:
				txt.setText("패");						
				break;
			}
			break;
		case "보":
			switch (cpu) {
			case SCISSOR:
				txt.setText("패");
				break;
			case ROCK:
				txt.setText("승");				
				break;
			case PAPER:
				txt.setText("무");						
				break;
			}
			break;
		}
	}
}
