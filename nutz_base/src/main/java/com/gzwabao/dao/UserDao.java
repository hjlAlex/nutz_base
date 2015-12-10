/**
 * 
 */
package com.gzwabao.dao;

import org.nutz.dao.Sqls;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.sql.Sql;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import com.gzwabao.entity.User;

/**
 * @author Alex
 *
 */
@IocBean
public class UserDao extends BaseDao<User> {
	private static final Log log = Logs.getLog(UserDao.class);

	/**
	 * 更新User单个字段
	 * 
	 * @param id
	 * @param colName
	 * @param colValue
	 * @return
	 */
	public boolean updateOne(int id, String colName, Object colValue) {
		Class<User> c = User.class;
		if (c.isAnnotationPresent(Table.class)) {
			String tName = c.getAnnotation(Table.class).value();
			Sql sql = Sqls.create("UPDATE " + tName + " SET " + colName + "="
					+ colValue + " WHERE id = " + id);
			dao.execute(sql);
			return true;
		} else {
			log.error("更新失败," + c.getClass().getName() + "没有@Table注解!");
			return false;
		}
	}
}
