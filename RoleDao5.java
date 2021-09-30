package kr.or.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import kr.or.connect.jdbcexam.dto.Role2;

public class RoleDao5 {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=UTC";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
	
	public int updateRole(Role2 role) {
		int updateCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {//드라이버가 로딩되는 일을 수행
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "UPDATE role SET description=?, role_id=? WHERE role_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, role.getDescription());
			ps.setInt(2, role.getRoleId());
			ps.setInt(3,  role.getRoleId2());
			
			
			updateCount = ps.executeUpdate();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// 반드시 실행해주는 finally를 이용하여 닫아주는 코드 작성
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {}
			}	
		}	
		return updateCount;
	}
	
}
