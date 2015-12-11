package com.gzwabao.action;

import java.util.Map;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.gzwabao.entity.User;
import com.gzwabao.service.UserService;

/**
 * 后台管理Action
 * 
 * @since 2015年11月5日 下午5:45:16
 * @author Alex
 */
@IocBean
@At({ "/admin" })
public class AdminAction {
	@Inject(value = "userService")
	private UserService userService;

	@At("/user_list")
	@Ok("vm:template.admin.user_list")
	public Map<String, Object> getUserList(@Param("curPage") int curPage,
			@Param("pageSize") int pageSize, @Param("keyword") String keyword) {
		return userService.getUserList(curPage, pageSize, keyword);
	}

	@At("/add_user")
	@Ok("vm:template.admin.add_user")
	public void toCreateAdmin() {
		// 仅仅为了返回一个页面，这个时候也可以给该页面初始化点东西
	}

	@At("/addAdmin")
	@Ok("raw:html")
	public int addAdmin(@Param("..") User user) {
		int status = userService.addUser(user);
		return status;
	}
}
