package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MemberDAO {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="javadb";
		String password="12341234";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}	
	//데이터베이스 요청
	public Vector<MemberVO> getList() {
		Vector<MemberVO> vecList = new Vector<MemberVO>();	
		
		String sql="select * from memberTBL";		
		try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery()) {
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
				vecList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vecList;
	}
<<<<<<< master
	
	//데이터 삽입
	public int insertMember(MemberVO vo) {
		int result=0;		
		String sql="insert into memberTBL values(member_seq.nextval,?,?,?)";
		
		try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setString(1,vo.getName());
			pstmt.setInt(2,vo.getAge());
			pstmt.setString(3,vo.getGender());
			result=pstmt.executeUpdate();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}
	
	//회원 조회
	public  MemberVO searchMember(int no) {
		MemberVO vo=null;
		String sql="select * from memberTBL where no=?";
		
		try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql);) {
			
			pstmt.setInt(1, no);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {		//중복결과가 도출될 수 있을경우에는 while문 사용
				vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	//회원 삭제
	public int deleteMember(int no) {
		int result=0;
		String sql="delete from memberTBL where no=?";		
		
		try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			result=pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
=======
>>>>>>> 950558c 20200413 empty
}
