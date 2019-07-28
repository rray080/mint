/**
 * 
 */
package com.gtids.mint.model;

import java.util.Date;

/**
 * @author rakesh
 * Date : 28-Jul-2019
 * 
 * dept_id	int(11) PK
 * dept_name	varchar(45) 
 * user_id	int(11) 
 * create_time	datetime
 * 
 */
public class Department {
	private long deptId;
	private String deptName;
	private long userId;
	private Date createTime;
	
	public Department() {
	}
	public Department(long deptId, String deptName, long userId, Date createTime) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.userId = userId;
		this.createTime = createTime;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Department [deptId=").append(deptId).append(", deptName=").append(deptName).append(", userId=")
				.append(userId).append(", createTime=").append(createTime).append("]");
		return builder.toString();
	}
	
}
