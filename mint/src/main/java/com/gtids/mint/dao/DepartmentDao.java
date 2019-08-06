/**
 * 
 */
package com.gtids.mint.dao;

import java.util.List;

import com.gtids.mint.model.Department;

/**
 * @author {Rakesh K Ray}
 * @create Date : 29-Jul-2019
 */
public interface DepartmentDao {

	public Department save(final Department dept);
	
	public List<Department> findAll();
	
	public Department findDepartmentById(long id);
	
}
