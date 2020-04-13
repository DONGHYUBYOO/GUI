package table;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import database.MemberDAO;
import database.MemberVO;

import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;

public class MemberTable extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtName, txtAge, txtGender, txtSearch, txtDelete, txtModifyNo, txtModifyAge;
	private JTable table_1;
	private JButton btnSearch, btnModify, btnDelete;
	
	private MemberDAO dao;
	private DefaultTableModel model, model1;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberTable frame = new MemberTable();
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
	public MemberTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//DB 객체 생성
		dao = new MemberDAO();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("회원등록", null, panel_3, null);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		panel_3.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setFont(new Font("굴림", Font.BOLD, 30));
		panel_3.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("나이");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		panel_3.add(lblNewLabel_1);
		
		txtAge = new JTextField();
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setFont(new Font("굴림", Font.BOLD, 30));
		panel_3.add(txtAge);
		txtAge.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("성별");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		panel_3.add(lblNewLabel_2);
		
		txtGender = new JTextField();
		txtGender.setHorizontalAlignment(SwingConstants.CENTER);
		txtGender.setFont(new Font("굴림", Font.BOLD, 30));
		panel_3.add(txtGender);
		txtGender.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("회원조회", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.NORTH);
		
		JLabel lblNewLabel_3 = new JLabel("회원 번호");
		panel_4.add(lblNewLabel_3);
		
		txtSearch = new JTextField();
		panel_4.add(txtSearch);
		txtSearch.setColumns(10);
		
		btnSearch = new JButton("조회");
		panel_4.add(btnSearch);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1, BorderLayout.CENTER);
		
		model1=getModel();
		table = new JTable(model1);
		scrollPane_1.setViewportView(table);
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("회원수정", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnModify = new JButton("수정");
		panel_1.add(btnModify, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_1.add(lblNewLabel_4, BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_4_1 = new JLabel("번호");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("굴림", Font.BOLD, 30));
		panel_5.add(lblNewLabel_4_1);
		
		txtModifyNo = new JTextField();
		txtModifyNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtModifyNo.setFont(new Font("굴림", Font.BOLD, 30));
		txtModifyNo.setColumns(10);
		panel_5.add(txtModifyNo);
		
		JLabel lblNewLabel_5 = new JLabel("나이");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 30));
		panel_5.add(lblNewLabel_5);
		
		txtModifyAge = new JTextField();
		txtModifyAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtModifyAge.setFont(new Font("굴림", Font.BOLD, 30));
		txtModifyAge.setColumns(10);
		panel_5.add(txtModifyAge);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("회원삭제", null, panel_2, null);
		
		JLabel lblNewLabel_6 = new JLabel("회원번호");
		panel_2.add(lblNewLabel_6);
		
		txtDelete = new JTextField();
		panel_2.add(txtDelete);
		txtDelete.setColumns(10);
		
		btnDelete = new JButton("삭제");
		panel_2.add(btnDelete);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("전체조회", null, panel_6, null);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_6.add(scrollPane, BorderLayout.CENTER);
				
		table_1 = new JTable(getModel());
		list();
		scrollPane.setViewportView(table_1);

		txtGender.addActionListener(this);
		btnSearch.addActionListener(this);
		btnDelete.addActionListener(this);
	}	
	
	//MemberTBL의 전체 내용 가져오기
	public DefaultTableModel getModel() {		
		String columnNames[] = {"번호", "이름", "나이", "성별"};
		model = new DefaultTableModel(columnNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		return model;
	}	
	
	public void list() {
		Vector<MemberVO> vecList=dao.listMember();
		//vecList에 들어있는 값을 table에 보여주기
		for(MemberVO vo:vecList) {
			Object[] rowData= {vo.getNo(),vo.getName(),vo.getAge(),vo.getGender()};
			model.addRow(rowData);
		}		
//		for(MemberVO vo:vecList) {			
//			Vector<Object> rowData = new Vector<>();
//			rowData.add(vo.getNo());
//			rowData.add(vo.getName());
//			rowData.add(vo.getAge());
//			rowData.add(vo.getGender());
//			model.addRow(rowData);
//		}				
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	//컴포넌트에서 바로 수행하지 않고 이벤트로 작업을 위임하여 수행		
		//이름과 나이와 성별을 가져온 후 데이터베이스에 입력하기
		if(e.getSource()==txtGender) {			
			//텍스트필드에 작성된 (이름, 나이, 성별)을 가져온 후
			MemberVO vo = new MemberVO();
			vo.setName(txtName.getText());
			vo.setAge(Integer.parseInt(txtAge.getText()));
			vo.setGender(txtGender.getText());
			txtName.setText("");
			txtAge.setText("");
			txtGender.setText("");
			
			//데이터베이스에 입력하기
			int result=dao.insertMember(vo);
			if(result>0) {	//성공
				JOptionPane.showMessageDialog(this, "INSERT 성공");
				//모델이 가지고 있던 데이터 초기화
				model.setNumRows(0);
				list();
			}else {	//실패
				JOptionPane.showMessageDialog(this, "INSERT 실패");			
			}
			
		}else if(e.getActionCommand().equals("조회")) {
			//사용자가 입력한 번호 가져오기
			int no=Integer.parseInt(txtSearch.getText());
			//번호에 해당하는 정보 가져온 후 보여주기
			MemberVO vo=dao.searchMember(no);
			Object[] rowData= {vo.getNo(),vo.getName(),vo.getAge(),vo.getGender()};
			model1.addRow(rowData);
			txtSearch.setText("");
			
		}else if(e.getActionCommand().equals("삭제")) {
			//사용자가 입력한 번호 가져오기
			int no=Integer.parseInt(txtDelete.getText());
			//해당하는 회원 삭제
			int result=dao.deleteMember(no);
			if(result>0) {
				JOptionPane.showMessageDialog(this, "DELETE 성공");
				//모델이 가지고 있던 데이터 초기화
				model.setNumRows(0);
				txtDelete.setText("");
				list();
			}else {
				JOptionPane.showMessageDialog(this, "DELETE 실패");
			}
		}
	}
}
