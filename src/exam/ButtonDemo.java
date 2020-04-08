package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonDemo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnD, btnM, btnE;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonDemo frame = new ButtonDemo();
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
	public ButtonDemo() {
		setTitle("버튼 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnD = new JButton("Disable Middle Button");
		btnD.setActionCommand("Disable");
		btnD.addActionListener(this);
		btnD.setMnemonic('D');
		btnD.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/left.gif")));
		panel.add(btnD);
		
		btnM = new JButton("Middle Button");
		btnM.setActionCommand("Middle");
		btnM.addActionListener(this);
		btnM.setMnemonic('M');
		btnM.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/middle.gif")));
		panel.add(btnM);
		
		btnE = new JButton("Enable Middle Button");
		btnE.setActionCommand("Enable");
		btnE.addActionListener(this);
		btnE.setMnemonic('E');
		btnE.setIcon(new ImageIcon(ButtonDemo.class.getResource("/exam/right.gif")));
		panel.add(btnE);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String cmd=e.getActionCommand();
		
		switch (cmd) {
		case "Disable":
			btnD.setEnabled(false);
			btnM.setEnabled(false);
			btnE.setEnabled(true);
			break;
		case "Middle":
			btnD.setEnabled(true);
			btnM.setEnabled(false);
			btnE.setEnabled(true);			
			break;
		case "Enable":
			btnD.setEnabled(true);
			btnM.setEnabled(true);
			btnE.setEnabled(false);			
			break;
		default:
			break;
		}
	}
}
