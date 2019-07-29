/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.gtids.mint.dao.DepartmentDao;
import com.gtids.mint.model.Department;

/**
 * @author {Rakesh K Ray}
 * @create Date : 29-Jul-2019 6:09:57 am
 */

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private JdbcTemplateAutoConfiguration jdbcTemplate;

	@Override
	public Department save(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department findDepartmentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
