package kr.or.connect.jdbcexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import kr.or.connect.jdbcexam.dto.Role;

public class RoleDao4 {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=UTC";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
	
	public int deleteRole(int roleId) {
		int deleteCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {//드라이버가 로딩되는 일을 수행
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "DELETE FROM role WHERE role_id =?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId);
			
			
			deleteCount = ps.executeUpdate();
		
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
		return deleteCount;
	}
	
}
