/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
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
	public Employee save(Employee dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>(){  
		    @Override  
		     public List<Employee> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Employee> list=new ArrayList<Employee>();  
		        while(rs.next()){  
		        Employee e=new Employee();  
		        e.setEmpCode(rs.getInt(1));  
		        e.setEmpName(rs.getString(2));  
		        e.setEmpSalary(rs.getInt(3));  
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
		  
	}

	@Override
	public Employee findEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
