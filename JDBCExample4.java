package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao4;

public class JDBCExample4 {

	public static void main(String[] args) {
		int roleId = 500; // 삭제할 roleId값
		
		
		RoleDao4 dao = new RoleDao4();
		int deleteCount = dao.deleteRole(roleId);
		
		System.out.println(deleteCount);
	}
}
