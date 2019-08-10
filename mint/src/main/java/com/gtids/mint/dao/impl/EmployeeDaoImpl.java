/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.gtids.mint.dao.EmployeeDao;
import com.gtids.mint.model.Employee;

/**
 * @author {Rakesh K Ray}
 * @create Date : 29-Jul-2019 6:12:37 am
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public Employee save(Employee emp) {
		final String sql = "INSERT INTO employee (emp_name, emp_designation, emp_salary, mobile, email, dept_id, user_id, create_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, emp.getEmpName());
                ps.setString(2, emp.getEmpDesignation());
                ps.setDouble(3, emp.getEmpSalary());
                ps.setLong(4, emp.getMobile());
                ps.setString(5, emp.getEmail());
                ps.setLong(6, emp.getDeptId());
                ps.setLong(7, emp.getUserId());
                ps.setDate(8, new java.sql.Date(emp.getCreateTime().getTime()));
                return ps;
            }
        }, holder);

        int newEmpCode = holder.getKey().intValue();
        emp.setEmpCode(newEmpCode);
        return emp;
	}

	@Override
	public List<Employee> findAll() {
		/*
		 * return jdbcTemplate.query("select * from employee",new
		 * ResultSetExtractor<List<Employee>>(){
		 * 
		 * @Override public List<Employee> extractData(ResultSet rs) throws
		 * SQLException, DataAccessException {
		 * 
		 * List<Employee> list=new ArrayList<Employee>(); while(rs.next()){ Employee
		 * e=new Employee(); e.setEmpCode(rs.getInt(1)); e.setEmpName(rs.getString(2));
		 * e.setEmpSalary(rs.getInt(3)); list.add(e); } return list; } });
		 */  
		return jdbcTemplate.query("select * from employee", 
                new EmployeeRowMapper());
		  
	}

	@Override
	public Employee findEmployeeById(long id) {
//		return jdbcTemplate.queryForObject(
//	            "select * from employee where emp_code=?",
//	            new Object[]{id}, new EmployeeRowMapper());
		String sql = "select * from employee where emp_code = ?";
		Employee emp = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		return emp;
	}

	@Override
	public int deleteEmployeeById(long id) {
		String sql = "delete from employee where emp_code = ?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public int updateEmployeeById(Employee emp) {
		String sql = "update employee set emp_name =?, emp_designation=?, emp_salary=?, mobile=?, email=?, dept_id=?, user_id=? where emp_code=?";
		return jdbcTemplate.update(sql, emp.getEmpName(), emp.getEmpDesignation(), emp.getEmpSalary(), emp.getMobile(), emp.getEmail(),emp.getDeptId(), emp.getUserId(), emp.getEmpCode());
		//return 0;
		
	}

}
