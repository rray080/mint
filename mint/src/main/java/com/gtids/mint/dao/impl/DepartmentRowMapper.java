/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gtids.mint.model.Department;

/**
 * @author {Rakesh K Ray}
 * @create Date : 30-Jul-2019 6:17:06 am
 */
public class DepartmentRowMapper implements RowMapper<Department> {

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department dept = new Department();
		dept.setDeptId(rs.getLong("dept_id"));
		dept.setDeptName(rs.getString("dept_name"));
		dept.setUserId(rs.getLong("user_id"));
		dept.setCreateTime(rs.getDate("create_Time"));
		return dept;
	}

}
