package layout;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class CardLayout1 extends JFrame {
	private JPanel contentPane, redCard, blueCard, orangeCard;
		
	public CardLayout1() {
		setTitle("카드레이아웃");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(new CardLayout());
		
		contentPane.add("RedCard",getCard());
		contentPane.add("BlueCard",getCard());
		contentPane.add("OrangeCard",getCard());
		setContentPane(contentPane);
	}
	
	public JPanel getCard() {
		if(redCard==null) {
			redCard = new JPanel();
			redCard.setBackground(Color.RED);
			return redCard;
		}else if(blueCard==null) {
			blueCard = new JPanel();
			blueCard.setBackground(Color.BLUE);
			return blueCard;
		}else {
			orangeCard = new JPanel();
			orangeCard.setBackground(Color.ORANGE);
			return orangeCard;			
		}
	}
	public static void main(String[] args) {
		CardLayout1 card = new CardLayout1();
		card.setVisible(true);
		Thread t = new Thread() {
			@Override
			public void run() {
				while(true) {
					
				
//				for(int i=0 ; i<2 ; i++) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					SwingUtilities.invokeLater(new Runnable() {
						@Override
						public void run() {
							CardLayout cardLayout=(CardLayout) card.getContentPane().getLayout();
							//다음 카드패널을 보여주기 -> contentPane에 add한 순서
							cardLayout.next(card.getContentPane());
						}
					});
				}
			}
		};
		t.start();
	}
}
