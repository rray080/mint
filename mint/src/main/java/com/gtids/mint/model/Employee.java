/**
 * 
 */
package com.gtids.mint.model;

import java.util.Date;

/**
 * @author rakesh
 * Date : 28-Jul-2019
 * 
 * emp_code	int(11) PK
 * emp_name	varchar(45)
 * emp_designation	varchar(45)
 * emp_salary	decimal(8,2)
 * mobile	int(11)
 * email	varchar(45)
 * dept_id	int(11)
 * user_id	int(11)
 * create_time	datetime
 */
public class Employee {
	private long empCode;
	private String empName;
	private String empDesignation;
	private double empSalary;
	private long mobile;
	private String email;
	private long deptId;
	private long userId;
	private Date createTime;
	
	
	public Employee() {
	}
	public Employee(long empCode, String empName, String empDesignation, double empSalary, long mobile, String email,
			long deptId, long userId, Date createTime) {
		this.empCode = empCode;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
		this.mobile = mobile;
		this.email = email;
		this.deptId = deptId;
		this.userId = userId;
		this.createTime = createTime;
	}
	public long getEmpCode() {
		return empCode;
	}
	public void setEmpCode(long empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
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
		builder.append("Employee [empCode=").append(empCode).append(", empName=").append(empName)
				.append(", empDesignation=").append(empDesignation).append(", empSalary=").append(empSalary)
				.append(", mobile=").append(mobile).append(", email=").append(email).append(", deptId=").append(deptId)
				.append(", userId=").append(userId).append(", createTime=").append(createTime).append("]");
		return builder.toString();
	}
	
}
