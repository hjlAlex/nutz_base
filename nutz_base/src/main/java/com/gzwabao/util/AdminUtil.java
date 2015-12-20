/**
 * 
 */
package com.gzwabao.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;

import com.gzwabao.entity.Module;
import com.gzwabao.entity.Navigation;
import com.gzwabao.entity.News;
import com.gzwabao.entity.Page;
import com.gzwabao.entity.Picture;
import com.gzwabao.service.ModuleService;
import com.gzwabao.service.NavService;
import com.gzwabao.service.NewsService;
import com.gzwabao.service.PageService;
import com.gzwabao.service.PictureService;

/**
 * 网站管理工具
 * 
 * @author Alex
 *
 */
@IocBean
public class AdminUtil {

	@Inject(value = "pageService")
	private PageService pageService;

	@Inject(value = "moduleService")
	private ModuleService moduleService;

	@Inject(value = "pictureService")
	private PictureService pictureService;

	@Inject(value = "newsService")
	private NewsService newsService;

	@Inject(value = "navService")
	private NavService navService;

	/**
	 * 用于检测字符串(有分隔符)是否包含某个元素
	 * 
	 * @param relateIds
	 * @param checkId
	 * @return
	 */
	public static boolean isChecked(String relateIds, int checkId) {
		if (StringUtils.isBlank(relateIds)) {
			return false;
		}
		String[] rids = relateIds.split(",");
		for (String rid : rids) {
			if (rid.equals(checkId + "")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 把字符串(有分隔符)变成list集合
	 * 
	 * @param relateIds
	 * @return
	 */
	public static List<Integer> toIntList(String relateIds) {
		List<Integer> resultList = new ArrayList<Integer>();
		if (StringUtils.isBlank(relateIds)) {
			return resultList;
		}
		String[] rids = relateIds.split(",");
		for (String rid : rids) {
			resultList.add(new Integer(rid));
		}
		return resultList;
	}

	/**
	 * 根据id获取图片
	 * 
	 * @param picId
	 * @return
	 */
	public Picture getPicture(int picId) {
		return pictureService.getPictureById(picId);
	}

	/**
	 * 根据relateIds，返回图片列表
	 * 
	 * @param relateIds
	 * @return
	 */
	public List<Picture> getPictureList(String relateIds) {
		List<Picture> resultList = new ArrayList<Picture>();
		if (StringUtils.isBlank(relateIds)) {
			return resultList;
		}
		String[] rids = relateIds.split(",");
		for (String rid : rids) {
			resultList
					.add(pictureService.getPictureById(Integer.parseInt(rid)));
		}
		// 根据ext5排序后返回
		Collections.sort(resultList, new Comparator<Picture>() {

			public int compare(Picture o1, Picture o2) {
				if (StringUtils.isBlank(o1.getExt5())
						|| StringUtils.isBlank(o2.getExt5())) {
					return 0;
				}
				int sort1 = Integer.parseInt(o1.getExt5());
				int sort2 = Integer.parseInt(o2.getExt5());
				return sort1 - sort2;
			}
		});
		return resultList;
	}

	/**
	 * 根据id获取资讯
	 * 
	 * @param newsId
	 * @return
	 */
	public News getNews(int newsId) {
		return newsService.getNewsById(newsId);
	}

	/**
	 * 根据relateIds获取资讯列表
	 * 
	 * @param relateIds
	 * @return
	 */
	public List<News> getNewsList(String relateIds) {
		List<News> resultList = new ArrayList<News>();
		if (StringUtils.isBlank(relateIds)) {
			return resultList;
		}
		String[] rids = relateIds.split(",");
		for (String rid : rids) {
			resultList.add(newsService.getNewsById(Integer.parseInt(rid)));
		}
		// 根据ext5排序后返回
		Collections.sort(resultList, new Comparator<News>() {

			public int compare(News o1, News o2) {
				if (StringUtils.isBlank(o1.getExt5())
						|| StringUtils.isBlank(o2.getExt5())) {
					return 0;
				}
				int sort1 = Integer.parseInt(o1.getExt5());
				int sort2 = Integer.parseInt(o2.getExt5());
				return sort1 - sort2;
			}
		});
		return resultList;
	}

	/**
	 * 根据id获取导航
	 * 
	 * @param navId
	 * @return
	 */
	public Navigation getNav(int navId) {
		return navService.getNavById(navId);
	}

	/**
	 * 根据relateIds获取导航列表
	 * 
	 * @param relateIds
	 * @return
	 */
	public List<Navigation> getNavList(String relateIds) {
		List<Navigation> resultList = new ArrayList<Navigation>();
		if (StringUtils.isBlank(relateIds)) {
			return resultList;
		}
		String[] rids = relateIds.split(",");
		for (String rid : rids) {
			resultList.add(navService.getNavById(Integer.parseInt(rid)));
		}
		// 根据ext5排序后返回
		Collections.sort(resultList, new Comparator<Navigation>() {

			public int compare(Navigation o1, Navigation o2) {
				if (StringUtils.isBlank(o1.getExt5())
						|| StringUtils.isBlank(o2.getExt5())) {
					return 0;
				}
				int sort1 = Integer.parseInt(o1.getExt5());
				int sort2 = Integer.parseInt(o2.getExt5());
				return sort1 - sort2;
			}
		});
		return resultList;
	}

	/**
	 * 获取公用导航
	 * 
	 * @return
	 */
	public List<Navigation> getCommonNav() {
		Page page = pageService.getPageByStrId("common");
		Map<String, Module> commonModules = moduleService.getModuleMap(page
				.getId());
		Module commonNav = commonModules.get("common_nav");
		return getNavList(commonNav.getRelateIds());
	}

	/**
	 * 获取公用轮播图
	 * 
	 * @return
	 */
	public List<Picture> getCommonPicture() {
		Page page = pageService.getPageByStrId("common");
		Map<String, Module> commonModules = moduleService.getModuleMap(page
				.getId());
		Module commonPic = commonModules.get("common_shuff");
		return getPictureList(commonPic.getRelateIds());
	}

	/**
	 * 获取公用友情链接
	 * 
	 * @return
	 */
	public List<Navigation> getCommonFriendLink() {
		Page page = pageService.getPageByStrId("common");
		Map<String, Module> commonModules = moduleService.getModuleMap(page
				.getId());
		Module commonFriend = commonModules.get("common_friend");
		return getNavList(commonFriend.getRelateIds());
	}

	/**
	 * 获取公用logo
	 * 
	 * @return
	 */
	public Picture getCommonLogo() {
		Page page = pageService.getPageByStrId("common");
		Map<String, Module> commonModules = moduleService.getModuleMap(page
				.getId());
		Module commonLogo = commonModules.get("common_logo");
		return getPictureList(commonLogo.getRelateIds()).get(0);
	}
}
