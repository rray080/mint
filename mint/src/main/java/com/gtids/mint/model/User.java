/**
 * 
 */
package com.gtids.mint.model;

/**
 * @author rakesh
 * Date : 28-Jul-2019
 * 
 * user_id	int(11) PK 
 * user_name	varchar(45)
 * user_pwd	varchar(45)
 * status	varchar(3)
 * role_id	int(1)
 */
public class User {
	private long userId;
	private String userName;
	private String userPwd;
	private String status;
	private byte roleId;
	
	public User() {
	}
	public User(long userId, String userName, String userPwd, String status, byte roleId) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.status = status;
		this.roleId = roleId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public byte getRoleId() {
		return roleId;
	}
	public void setRoleId(byte roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [userId=").append(userId).append(", userName=").append(userName).append(", userPwd=")
				.append(userPwd).append(", status=").append(status).append(", roleId=").append(roleId).append("]");
		return builder.toString();
	}
}
