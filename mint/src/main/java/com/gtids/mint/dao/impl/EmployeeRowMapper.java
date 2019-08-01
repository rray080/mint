/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gtids.mint.model.Employee;

/**
 * @author {Rakesh K Ray}
 * @create Date : 30-Jul-2019 5:15:23 am
 */
public class EmployeeRowMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpCode(rs.getLong("emp_code"));
		emp.setEmpName(rs.getString("emp_name"));
		emp.setEmpDesignation(rs.getString("emp_designation"));
		emp.setEmpSalary(rs.getDouble("emp_salary"));
		emp.setMobile(rs.getLong("mobile"));
		emp.setEmail(rs.getString("email"));
		emp.setDeptId(rs.getLong("dept_id"));
		emp.setUserId(rs.getLong("user_id"));
		emp.setCreateTime(rs.getDate("create_time"));
		return emp;
	}
}
