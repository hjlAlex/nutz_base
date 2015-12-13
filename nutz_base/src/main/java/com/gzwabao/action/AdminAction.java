package com.gzwabao.action;

import java.awt.image.BufferedImage;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.gzwabao.entity.Page;
import com.gzwabao.entity.User;
import com.gzwabao.filter.LoginFilter;
import com.gzwabao.service.PageService;
import com.gzwabao.service.PictureService;
import com.gzwabao.service.UserService;
import com.gzwabao.util.CodeUtil;

/**
 * 后台管理Action
 * 
 * @since 2015年11月5日 下午5:45:16
 * @author Alex
 */
@IocBean
@At({ "/admin" })
@Filters(@By(type = LoginFilter.class))
public class AdminAction {
	@Inject(value = "userService")
	private UserService userService;

	@Inject(value = "pageService")
	private PageService pageService;

	@Inject(value = "pictureService")
	private PictureService pictureService;

	/**
	 * 管理首页
	 */
	@At("/index")
	@Ok("vm:template.admin.index")
	public void adminMain() {

	}

	// =============用户业务相关开始=============
	/**
	 * 获取用户列表
	 * 
	 * @param curPage
	 * @param pageSize
	 * @param keyword
	 * @return
	 * @since 2015年12月11日 下午5:52:12
	 */
	@At("/user_list")
	@Ok("vm:template.admin.user_list")
	public Map<String, Object> getUserList(@Param("curPage") int curPage,
			@Param("pageSize") int pageSize, @Param("keyword") String keyword) {
		return userService.getUserList(curPage, pageSize, keyword);
	}

	/**
	 * 跳往添加用户页面
	 * 
	 * @since 2015年12月11日 下午5:52:22
	 */
	@At("/add_user")
	@Ok("vm:template.admin.add_user")
	public void toCreateAdmin() {
		// 仅仅为了返回一个页面，这个时候也可以给该页面初始化点东西
	}

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 * @since 2015年12月11日 下午5:52:47
	 */
	@At("/addAdmin")
	@Ok("raw:html")
	public int addAdmin(@Param("..") User user) {
		int status = userService.addUser(user);
		return status;
	}

	/**
	 * 跳往更新页面
	 * 
	 * @param uid
	 * @return
	 */
	@At("/update_user")
	@Ok("vm:template.admin.update_user")
	public User toUpdateAdmin(@Param("uid") int uid) {
		// 仅仅为了返回一个页面，这个时候也可以给该页面初始化点东西
		return userService.getUserById(uid);
	}

	/**
	 * 更新用户
	 * 
	 * @param oldId
	 * @param user
	 * @return
	 */
	@At("/updateAdmin")
	@Ok("raw:html")
	public int updateAdmin(@Param("oldId") int oldId, @Param("..") User user) {
		int status = userService.updateUserByOid(oldId, user);
		return status;
	}

	/**
	 * 删除单个用户
	 * 
	 * @param oldId
	 * @param user
	 * @return
	 */
	@At("/deleteAdmin")
	@Ok("raw:html")
	public int deleteAdmin(@Param("delId") int delId) {
		int status = userService.delAdminById(delId);
		return status;
	}

	/**
	 * 批量删除用户
	 * 
	 * @param adminIds
	 * @return
	 * @since 2015年12月12日 下午12:49:45
	 */
	@At("/deleteMoreAdmin")
	@Ok("raw:html")
	public int deleteMoreAdmin(@Param("adminIds") String adminIds) {
		int status = userService.delMoreAdmin(adminIds);
		return status;
	}

	/**
	 * 获取验证码
	 * 
	 * @param req
	 * @return
	 * @since 2015年12月11日 下午5:52:59
	 */
	@At("/code")
	@Ok("raw:jpg")
	public BufferedImage getValidateCode(HttpServletRequest req) {
		String randomString = CodeUtil.getRandomString();
		// 将getSession（）设置为true，当会话不存在是返回null
		HttpSession session = req.getSession(true);
		session.setMaxInactiveInterval(180 * 1000);
		String sid = session.getId();
		session.setAttribute(sid, randomString);
		// 创建一个彩色图片
		BufferedImage bimage = CodeUtil.getCodeImg(randomString);
		return bimage;
	}

	/**
	 * 登录
	 * 
	 * @param name
	 * @param password
	 * @param code
	 * @param req
	 * @return
	 */
	@At("/login")
	@Ok("redirect:/admin/index.html?tip=${obj}")
	public String login(@Param("name") String name,
			@Param("password") String password, @Param("code") String code,
			HttpServletRequest req) {
		return userService.login(name, password, code, req);
	}

	/**
	 * 登出
	 * 
	 * @param req
	 */
	@At("/logout")
	@Ok("vm:template.admin.login")
	public void logout(HttpServletRequest req) {
		userService.logout(req);
	}

	// =============用户业务相关结束=============

	// =============页面业务相关开始=============
	@At("/add_page")
	@Ok("vm:template.admin.add_page")
	public void toCreatePage() {
		// 仅仅为了返回一个页面，这个时候也可以给该页面初始化点东西
	}

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 * @since 2015年12月11日 下午5:52:47
	 */
	@At("/addPage")
	@Ok("raw:html")
	public int addPage(@Param("..") Page page) {
		int status = pageService.addPage(page);
		return status;
	}

	/**
	 * 获取前端所有页面
	 * 
	 * @param curPage
	 * @param pageSize
	 * @param keyword
	 * @return
	 */
	@At("/page_list")
	@Ok("vm:template.admin.page_list")
	public Map<String, Object> getPageList(@Param("curPage") int curPage,
			@Param("pageSize") int pageSize, @Param("keyword") String keyword) {
		return pageService.getPageList(curPage, pageSize, keyword);
	}

	/**
	 * 跳往更新页面
	 * 
	 * @param uid
	 * @return
	 */
	@At("/update_page")
	@Ok("vm:template.admin.update_page")
	public Page toUpdatePage(@Param("pid") int pid) {
		// 仅仅为了返回一个页面，这个时候也可以给该页面初始化点东西
		return pageService.getPageById(pid);
	}

	/**
	 * 更新页面
	 * 
	 * @param oldId
	 * @param page
	 * @return
	 */
	@At("/updatePage")
	@Ok("raw:html")
	public int updatePage(@Param("oldId") int oldId, @Param("..") Page page) {
		int status = pageService.updatePageByOid(oldId, page);
		return status;
	}

	/**
	 * 删除页面
	 * 
	 * @param delId
	 * @return
	 */
	@At("/deletePage")
	@Ok("raw:html")
	public int deletePage(@Param("delId") int delId) {
		int status = pageService.delPageById(delId);
		return status;
	}

	/**
	 * 删除多个页面
	 * 
	 * @param pageIds
	 * @return
	 */
	@At("/deleteMorePage")
	@Ok("raw:html")
	public int deleteMorePage(@Param("pageIds") String pageIds) {
		int status = pageService.delMorePage(pageIds);
		return status;
	}

	// =============页面业务相关结束=============

	@At("/picture_list")
	@Ok("vm:template.admin.picture_list")
	public Map<String, Object> getPictureList(@Param("curPage") int curPage,
			@Param("pageSize") int pageSize, @Param("keyword") String keyword) {
		return pictureService.getPictureList(curPage, pageSize, keyword);
	}
}
