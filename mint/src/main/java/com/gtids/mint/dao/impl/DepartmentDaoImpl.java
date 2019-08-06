/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
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
	private JdbcTemplate jdbcTemplate;

	@Override
	public Department save(Department dept) {
		final String sql = "INSERT INTO department (dept_name, user_id, create_time) VALUES (?, ?, ?)";

        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, dept.getDeptName());
                ps.setLong(2, dept.getUserId());
                ps.setDate(3, new Date(dept.getCreateTime().getTime()));
                return ps;
            }
        }, holder);

        dept.setDeptId(holder.getKey().longValue());
        System.out.println("...................DAOImp...."+holder.getKey().intValue()+".........................");
        return dept;
	}

	@Override
	public List<Department> findAll() {
		return jdbcTemplate.query("select * from department", new DepartmentRowMapper());
	}

	@Override
	public Department findDepartmentById(long id) {
		return jdbcTemplate.queryForObject("select * from department where dept_id=?", new Object[] { id },
				new DepartmentRowMapper());
	}

}
