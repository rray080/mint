/**
 * 
 */
package com.gtids.mint.dao;

import java.util.List;

import com.gtids.mint.model.User;

/**
 * @author rakesh
 *
 */
public interface UserDao {

	public User save(final User user);

	public List<User> findAll();

	public User findUserById(long id);

	/**
	 * @param user
	 * @return
	 */
	public User checkLogin(User user);

}
