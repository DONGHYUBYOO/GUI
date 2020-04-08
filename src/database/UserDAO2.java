package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class UserDAO2 {

	static {
		//드라이버 로드
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
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//전체 리스트 가져오기
	public Vector<UserVO2> allUser(){
		Vector<UserVO2> vectorList = new Vector<UserVO2>();
		
		String sql="select * from userTBL";
		try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery()) {
			
			while(rs.next()) {
				UserVO2 vo = new UserVO2();
				vo.setNo(rs.getInt(1));
				vo.setUsername(rs.getString(2));
				vo.setBirthYear(rs.getInt(3));
				vo.setAddr(rs.getString(4));
				vo.setMobile(rs.getString(5));
				vectorList.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vectorList;
	}
}
