package kr.or.connect.jdbcexam.dto;


//DB에서 정보를 담을 객체를 생성
public class Role2 {
	private Integer roleId;
	private String description;
	private Integer roleId2;
	
	public Role2() {
	
	}
	
	public Role2(Integer roleId, String description, Integer roleId2) {
		super();
		this.roleId = roleId;
		this.description = description;
		this.roleId2 = roleId2;
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	
	public Integer getRoleId2() {
		return roleId2;
	}
	
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	public void setRoleId2(Integer roleId2) {
		this.roleId2 = roleId2;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
	
}
