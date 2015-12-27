package com.gzwabao.action;

import java.util.Map;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

import com.gzwabao.entity.Module;
import com.gzwabao.entity.Page;
import com.gzwabao.service.ModuleService;
import com.gzwabao.service.PageService;

/**
 * 
 * @since 2015年11月5日 下午5:45:16
 * @author Alex
 */
@IocBean
@At({ "/", "/index" })
public class FrontAction {

	@Inject(value = "pageService")
	private PageService pageService;

	@Inject(value = "moduleService")
	private ModuleService moduleService;

	/**
	 * 首页
	 * 
	 * @return
	 */
	@At("")
	@Ok("vm:template.index")
	public Map<String, Module> index() {
		Page index = pageService.getPageByStrId("index");
		if (null != index) {
			return moduleService.getModuleMap(index.getId());
		}
		return null;
	}

	/**
	 * 关于
	 * 
	 * @return
	 */
	@At("/about")
	@Ok("vm:template.about")
	public Map<String, Module> about() {
		Page about = pageService.getPageByStrId("about");
		if (null != about) {
			return moduleService.getModuleMap(about.getId());
		}
		return null;
	}

	/**
	 * 加盟介绍
	 * 
	 * @return
	 */
	@At("/join")
	@Ok("vm:template.join")
	public Map<String, Module> join() {
		Page join = pageService.getPageByStrId("join");
		if (null != join) {
			return moduleService.getModuleMap(join.getId());
		}
		return null;
	}

	/**
	 * 奶茶饮品
	 * 
	 * @return
	 */
	@At("/tea")
	@Ok("vm:template.tea")
	public Map<String, Module> tea() {

		return null;
	}

	/**
	 * 新闻中心
	 * 
	 * @return
	 */
	@At("/news")
	@Ok("vm:template.news")
	public Map<String, Module> news() {

		return null;
	}

	/**
	 * 申请加盟
	 * 
	 * @return
	 */
	@At("/join_apply")
	@Ok("vm:template.join_apply")
	public Map<String, Module> joinApply() {

		return null;
	}

}
