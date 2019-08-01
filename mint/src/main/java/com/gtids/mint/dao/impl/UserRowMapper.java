/**
 * 
 */
package com.gtids.mint.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gtids.mint.model.User;


/**
 * @author {Rakesh K Ray}
 * @create Date : 30-Jul-2019 4:54:29 am
 */
public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
        user.setUserId(rs.getLong("id"));
        user.setUserName(rs.getString("user_name"));
        user.setUserPwd(rs.getString("user_pws"));
        user.setStatus(rs.getString("status"));
        user.setRoleId(rs.getByte("role_id"));
        return user;
	}
}
