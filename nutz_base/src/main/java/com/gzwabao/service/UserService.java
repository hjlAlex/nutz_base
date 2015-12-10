/**
 * 
 */
package com.gzwabao.service;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import com.gzwabao.dao.UserDao;
import com.gzwabao.entity.User;

/**
 * @author Alex
 *
 */
@IocBean
public class UserService {
	private static final Log log = Logs.getLog(UserService.class);

	@Inject(value = "userDao")
	private UserDao userDao;

	/**
	 * 新增一个用户
	 * 
	 * @param user
	 * @return
	 */
	public User addUser(User user) {
		return userDao.save(user);
	}

	/**
	 * 更新一个用户(所有字段)
	 * 
	 * @param user
	 * @return
	 */
	public int updateUser(User user) {
		return userDao.updateAll(user);
	}

	/**
	 * 通过id获取用户
	 * 
	 * @param id
	 * @return
	 */
	public User getUserById(int id) {
		return userDao.getById(User.class, id);
	}

	public int deleteUserById(int id) {
		return userDao.deleteById(User.class, id);
	}
}
