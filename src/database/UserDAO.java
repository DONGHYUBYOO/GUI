package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class UserDAO {

	static {
		//드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		
		String url="jdbc:mysql://localhost:3306/javadb?useSSL=false&serverTimezone=UTC";
		String user="javadb";
		String password="12345";
		
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//전체 리스트 가져오기
	public Vector<UserVO> allUser(){
		Vector<UserVO> vectorList = new Vector<UserVO>();
		
		String sql="select * from userTBL";
		try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery()) {
			
			while(rs.next()) {
				UserVO vo = new UserVO();
				vo.setNo(rs.getInt(1));
				vo.setUserName(rs.getString(2));
				vo.setBirthday(rs.getDate(3));
				vo.setAddress(rs.getString(4));
				vo.setGrender(rs.getString(5));
				vectorList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vectorList;
	}
}
