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
	private String email;
	private String status;
	
	
	public User() {
	}
	public User(long userId, String userName, String userPwd,String email, String status) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.status = status;
		
		this.email=email;
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
	public String getemail()
	{
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [userId=").append(userId).append(", userName=").append(userName).append(", userPwd=")
				.append(userPwd).append(", email=").append(email).append(", status=").append(status).append("]");
		return builder.toString();
	}
}
