package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao5;
import kr.or.connect.jdbcexam.dto.Role2;

public class JDBCExample5 {

	public static void main(String[] args) {
		//수정사항
		int roleId = 300;
		String description = "CEO";
		//조건
		int roleId2 = 510;
		
		Role2 role = new Role2(roleId, description, roleId2);
		RoleDao5 dao = new RoleDao5();
		
		int updateCount = dao.updateRole(role);
		
		System.out.println(updateCount);
	}
}
