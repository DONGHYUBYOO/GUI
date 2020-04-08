package radio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class JRadioTest4 extends JFrame implements ActionListener, ItemListener {

	private JPanel contentPane, btnPane, centerPane, pizzaPane, toppingPane, sizePane;
	private JButton btnOrder, btnCancel;
	private JLabel lblPrice, lblMain;
	private JRadioButton rdPizza1, rdPizza2, rdPizza3, rdTopping1, rdTopping2, rdTopping3, rdTopping4, rdSize1, rdSize2, rdSize3;
	private ButtonGroup groupPizza, groupTopping, groupSize;
	TitledBorder borderPizza, borderTopping, borderSize;
	private int total=0, pizzaPrice=0, toppingPrice=0, sizePrice=0, result=0;
	private String pizza, topping, size;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioTest4 frame = new JRadioTest4();
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
	public JRadioTest4() {
		setTitle("자바피자 메뉴판");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnPane = new JPanel();
		contentPane.add(btnPane, BorderLayout.SOUTH);
		
		btnOrder = new JButton("주 문");
		btnOrder.setFont(new Font("궁서체", Font.BOLD, 15));
		btnOrder.addActionListener(this);
		btnPane.add(btnOrder);
		
		btnCancel = new JButton("취 소");
		btnCancel.setFont(new Font("궁서체", Font.BOLD, 15));
		btnCancel.addActionListener(this);
		btnPane.add(btnCancel);
		
		lblPrice = new JLabel("금액 : ");
		lblPrice.setFont(new Font("궁서체", Font.BOLD, 15));
		btnPane.add(lblPrice);
		
		lblMain = new JLabel("자바 피자에 오신 것을 환영합니다");
		lblMain.setForeground(Color.RED);
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setFont(new Font("궁서체", Font.BOLD, 20));
		contentPane.add(lblMain, BorderLayout.NORTH);
		
		centerPane = new JPanel();
		contentPane.add(centerPane, BorderLayout.CENTER);
		centerPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		borderPizza = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		borderPizza.setTitle("종류");
		borderPizza.setTitleFont(new Font("궁서체", Font.BOLD, 15));
		borderPizza.setTitleColor(Color.DARK_GRAY);
		borderPizza.setTitleJustification(TitledBorder.LEFT);
		borderPizza.setTitlePosition(TitledBorder.TOP);
		pizzaPane = new JPanel();
		pizzaPane.setBorder(borderPizza);
		centerPane.add(pizzaPane);
		pizzaPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdPizza1 = new JRadioButton("콤보");
		rdPizza1.setFont(new Font("궁서체", Font.BOLD, 20));
		pizzaPane.add(rdPizza1);
		
		rdPizza2 = new JRadioButton("포테이토");
		rdPizza2.setFont(new Font("궁서체", Font.BOLD, 20));
		pizzaPane.add(rdPizza2);
		
		rdPizza3 = new JRadioButton("불고기");
		rdPizza3.setFont(new Font("궁서체", Font.BOLD, 20));
		pizzaPane.add(rdPizza3);
		rdPizza1.addActionListener(this);
		rdPizza2.addActionListener(this);
		rdPizza3.addActionListener(this);
		groupPizza = new ButtonGroup();
		groupPizza.add(rdPizza1);
		groupPizza.add(rdPizza2);
		groupPizza.add(rdPizza3);
		
		toppingPane = new JPanel();
		borderTopping = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		borderTopping.setTitle("토핑");
		borderTopping.setTitleFont(new Font("궁서체", Font.BOLD, 15));
		borderTopping.setTitleColor(Color.DARK_GRAY);
		borderTopping.setTitleJustification(TitledBorder.LEFT);
		borderTopping.setTitlePosition(TitledBorder.TOP);
		toppingPane.setBorder(borderPizza);
		centerPane.add(toppingPane);
		toppingPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdTopping1 = new JRadioButton("피망");
		rdTopping1.setFont(new Font("궁서체", Font.BOLD, 20));
		toppingPane.add(rdTopping1);
		
		rdTopping2 = new JRadioButton("치즈");
		rdTopping2.setFont(new Font("궁서체", Font.BOLD, 20));
		toppingPane.add(rdTopping2);
		
		rdTopping3 = new JRadioButton("페퍼로니");
		rdTopping3.setFont(new Font("궁서체", Font.BOLD, 20));
		toppingPane.add(rdTopping3);
		
		rdTopping4 = new JRadioButton("베이컨");
		rdTopping4.setFont(new Font("궁서체", Font.BOLD, 20));
		toppingPane.add(rdTopping4);
		rdTopping1.addActionListener(this);
		rdTopping2.addActionListener(this);
		rdTopping3.addActionListener(this);
		rdTopping4.addActionListener(this);
		groupTopping = new ButtonGroup();
		groupTopping.add(rdTopping1);
		groupTopping.add(rdTopping2);
		groupTopping.add(rdTopping3);
		groupTopping.add(rdTopping4);
		
		sizePane = new JPanel();
		borderSize = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		borderSize.setTitle("크기");
		borderSize.setTitleFont(new Font("궁서체", Font.BOLD, 15));
		borderSize.setTitleColor(Color.DARK_GRAY);
		borderSize.setTitleJustification(TitledBorder.LEFT);
		borderSize.setTitlePosition(TitledBorder.TOP);
		sizePane.setBorder(borderSize);
		centerPane.add(sizePane);
		sizePane.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdSize1 = new JRadioButton("작은거");
		rdSize1.setFont(new Font("궁서체", Font.BOLD, 20));
		sizePane.add(rdSize1);
		
		rdSize2 = new JRadioButton("중간거");
		rdSize2.setFont(new Font("궁서체", Font.BOLD, 20));
		sizePane.add(rdSize2);
		
		rdSize3 = new JRadioButton("큰거");
		rdSize3.setFont(new Font("궁서체", Font.BOLD, 20));
		sizePane.add(rdSize3);
		rdSize1.addActionListener(this);
		rdSize2.addActionListener(this);
		rdSize3.addActionListener(this);
		groupSize = new ButtonGroup();
		groupSize.add(rdSize1);
		groupSize.add(rdSize2);
		groupSize.add(rdSize3);
		
		rdPizza1.addItemListener(this);
		rdPizza2.addItemListener(this);
		rdPizza3.addItemListener(this);
		rdTopping1.addItemListener(this);
		rdTopping2.addItemListener(this);
		rdTopping3.addItemListener(this);
		rdTopping4.addItemListener(this);
		rdSize1.addItemListener(this);
		rdSize2.addItemListener(this);
		rdSize3.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		AbstractButton btn = (AbstractButton) e.getSource();
//		JRadioButton radio = (JRadioButton) e.getSource();
		String order = "주문 내역 \n종류 : "+pizza+"\n토핑 : "+topping+"\n크기 : "+size+"\n가격 : "+total+" 원\n";
		if(btn==btnOrder) {
			if(pizza==null) {
				//피자종류를 선택 안했을 시 진행 되지 않도록 안내 팝업 표시
				result=JOptionPane.showConfirmDialog(getParent(), "주문 내역을 확인해 주세요.","주문 내역",
						JOptionPane.CLOSED_OPTION,JOptionPane.ERROR_MESSAGE);				
			}else {
				result=JOptionPane.showConfirmDialog(getParent(), order+"결제를 진행 하시겠습니까?","주문 내역",
						JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			}
			if(result!=0) {
				//기존 주문내역 취소
				groupPizza.clearSelection();
				groupTopping.clearSelection();
				groupSize.clearSelection();
			}
		}else if(btn==btnCancel) {
			groupPizza.clearSelection();
			groupTopping.clearSelection();
			groupSize.clearSelection();
		}
		
//		if(btn==rdPizza1) {
//			pizzaPrice=10000;
//		}else if(btn==rdPizza2) {
//			pizzaPrice=11000;
//		}else if(btn==rdPizza3){
//			pizzaPrice=12000;
//		}else if(btn==rdTopping1){
//			toppingPrice=500;
//		}else if(btn==rdTopping2) {
//			toppingPrice=1000;
//		}else if(btn==rdTopping3) {
//			toppingPrice=1500;
//		}else if(btn==rdTopping4) {
//			toppingPrice=2000;
//		}else if(btn==rdSize1) {
//			sizePrice=1000;
//		}else if(btn==rdSize2) {
//			sizePrice=2000;
//		}else if(btn==rdSize3) {
//			sizePrice=3000;
//		}		
//		total=pizzaPrice+toppingPrice+sizePrice;	
//		lblPrice.setText("금액 : "+total+"원");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		if(e.getStateChange()==ItemEvent.SELECTED) {			
			if(radio==rdPizza1) {
				total+=10000;
				pizza=rdPizza1.getText();
			}else if(radio==rdPizza2) {
				total+=11000;
				pizza=rdPizza2.getText();
			}else if(radio==rdPizza3) {
				total+=12000;
				pizza=rdPizza3.getText();
			}else if(radio==rdTopping1) {
				total+=500;
				topping=rdTopping1.getText();
			}else if(radio==rdTopping2) {
				total+=1000;
				topping=rdTopping2.getText();
			}else if(radio==rdTopping3) {
				total+=1500;
				topping=rdTopping3.getText();
			}else if(radio==rdTopping4) {
				total+=2000;
				topping=rdTopping4.getText();
			}else if(radio==rdSize1) {
				total+=1000;	
				size=rdSize1.getText();
			}else if(radio==rdSize2) {
				total+=2000;
				size=rdSize2.getText();
			}else if(radio==rdSize3) {
				total+=3000;
				size=rdSize3.getText();
			}
		}else {
			if(radio==rdPizza1) {
				total-=10000;
			}else if(radio==rdPizza2) {
				total-=11000;
			}else if(radio==rdPizza3) {
				total-=12000;
			}else if(radio==rdTopping1) {
				total-=500;
			}else if(radio==rdTopping2) {
				total-=1000;
			}else if(radio==rdTopping3) {
				total-=1500;
			}else if(radio==rdTopping4) {
				total-=2000;
			}else if(radio==rdSize1) {
				total-=1000;
			}else if(radio==rdSize2) {
				total-=2000;
			}else if(radio==rdSize3) {
				total-=3000;			
			}
		}
		lblPrice.setText("금액 : "+total+" 원");	
	}
}
