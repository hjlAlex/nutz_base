/**
 * 
 */
package com.gzwabao.dao;

import java.io.Serializable;

import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

/**
 * 数据库操作基类
 * 
 * @author Alex
 *
 */
@IocBean
public abstract class BaseDao<T extends Serializable> {

	@Inject(value = "dao")
	protected Dao dao;

	/**
	 * 保存一个对象
	 * 
	 * @param o
	 * @return
	 */
	public T save(T o) {
		return dao.insert(o);
	}

	/**
	 * 更新一个对象的所有字段<br>
	 * (一定要有@Id或者@Name或者@PK声明,且一定主键的值必须保证是有效的)
	 * 
	 * @param o
	 * @return
	 */
	public int updateAll(T o) {
		return dao.update(o);
	}

	/**
	 * 根据id获取一个对象
	 * 
	 * @param c
	 * @param id
	 * @return
	 */
	public T getById(Class<T> c, int id) {
		return dao.fetch(c, id);
	}

	public int deleteById(Class<T> c, int id) {
		return dao.delete(c, id);
	}
}
