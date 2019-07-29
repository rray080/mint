/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.gtids.mint.dao.UserDao;
import com.gtids.mint.model.User;

/**
 * @author {Rakesh K Ray}
 * @create Date : 29-Jul-2019 6:03:15 am
 */

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private JdbcTemplateAutoConfiguration jdbcTemplate;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
