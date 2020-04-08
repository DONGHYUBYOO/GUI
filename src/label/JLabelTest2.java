package label;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

public class JLabelTest2 extends JFrame implements ItemListener{

	private JPanel contentPane, centerPane;
	private JToggleButton tgl;
	private JLabel label;
	private ImageIcon dog;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelTest2 frame = new JLabelTest2();
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
	public JLabelTest2() {
		setTitle("토글버튼을 이용한 아이콘");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout());
		setContentPane(contentPane);
		
		tgl = new JToggleButton("이미지를 보려면 클릭하세요.");
		tgl.addItemListener(this);
		contentPane.add(tgl, BorderLayout.SOUTH);
		
		label = new JLabel("버튼을 눌러주세요.");
//		centerPane = new JPanel();
//		centerPane.add(label, BorderLayout.CENTER);
//		contentPane.add(centerPane, BorderLayout.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		dog = new ImageIcon(getClass().getResource("dog.gif"));
		if(e.getStateChange()==e.SELECTED) {
			label.setText("그림이 나타났어요.");
			label.setIcon(dog);
		}else {		
			label.setText("그림이 사라졌어요.");
			label.setIcon(null);
		}
	}
}
