/**
 * 
 */
package com.gtids.mint.dao;

import java.util.List;

import com.gtids.mint.model.Employee;


/**
 * @author {Rakesh K Ray}
 * @create Date : 29-Jul-2019 5:30:03 am
 */
public interface EmployeeDao {
public Employee save(final Employee dept);
	
	public List<Employee> findAll();
	
	public Employee findEmployeeById(long id);
	
	public int deleteEmployeeById(long id);
	public int updateEmployeeById(Employee emp);
	
	
}
