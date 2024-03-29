/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.gtids.mint.dao.UserDao;
import com.gtids.mint.model.User;

/**
 * @author {Rakesh K Ray}
 * @create Date : 29-Jul-2019 6:03:15 am
 */

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User save(User user) {
		final String sql = "INSERT INTO user (user_name, user_pwd, status, role_id) VALUES (?, ?, ?, ?)";

		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getUserPwd());
				ps.setString(3, user.getStatus());
				ps.setInt(4, user.getRoleId());
				return ps;
			}
		}, holder);

		int newUserId = holder.getKey().intValue();
		user.setUserId(newUserId);
		return user;
	}

	@Override
	public List<User> findAll() {
		return jdbcTemplate.query("select * from user", new UserRowMapper());
	}

	@Override
	public User findUserById(long id) {
		try {
			return jdbcTemplate.queryForObject("select * from user where user_id=?", new Object[] { id },
					new UserRowMapper());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User checkLogin(User user) {
		try {
			return jdbcTemplate.queryForObject("select * from user where user_name=? and user_pwd=?",
					new Object[] { user.getUserName(), user.getUserPwd() }, new UserRowMapper());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
