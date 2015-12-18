/**
 * 
 */
package com.gzwabao.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.pager.Pager;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import com.gzwabao.dao.ModuleDao;
import com.gzwabao.entity.Module;

/**
 * @author Alex
 *
 */
@IocBean
public class ModuleService {
	private static final Log log = Logs.getLog(ModuleService.class);

	@Inject(value = "moduleDao")
	private ModuleDao moduleDao;

	/**
	 * 新增一个模块v
	 * 
	 * @param module
	 * @return
	 * @since 2015年12月18日 下午1:26:32
	 */
	public int addModule(Module module) {
		int result = 400;
		try {
			if (StringUtils.isBlank(module.getStrFlag())) {
				log.error("模块字符串标识非法!");
				return result;
			}
			if (0 == module.getPageId()) {
				log.error("模块所属页面非法!");
				return result;
			}
			if (0 == module.getType()) {
				log.error("模块所属类型非法!");
				return result;
			}
			if (StringUtils.isBlank(module.getRelateIds())) {
				log.error("模块关联实体非法!");
				return result;
			}
			return moduleDao.save(module) != null ? 200 : 400;
		} catch (Exception e) {
			log.error("新增模块失败!strFalg=" + module.getStrFlag(), e);
		}
		return result;
	}

	/**
	 * 页面关联模块
	 * 
	 * @param pageId
	 * @return
	 * @since 2015年12月18日 下午1:31:49
	 */
	public List<Module> getModuleList(int pageId) {
		List<Module> resultList = new ArrayList<Module>();
		try {
			Pager pager = new Pager();
			int totalRecord = 0;
			Condition cnd = Cnd.where("pageId", "=", pageId);
			totalRecord = moduleDao.getCount(Module.class, cnd);
			pager.setRecordCount(totalRecord);
			pager.setPageNumber(1);
			pager.setPageSize(totalRecord);
			resultList = moduleDao.queryAll(Module.class, cnd, pager);
			return resultList;
		} catch (Exception e) {
			log.error("获取模块列表失败!", e);
		}
		return null;
	}

	/**
	 * 根据id获取模块
	 * 
	 * @param mid
	 * @return
	 * @since 2015年12月18日 下午1:37:09
	 */
	public Module getModuleById(int mid) {
		try {
			return moduleDao.getById(Module.class, mid);
		} catch (Exception e) {
			log.error("获取模块失败!id=" + mid, e);
		}
		return null;
	}

	/**
	 * 更新页面
	 * 
	 * @param oldId
	 * @param page
	 * @return
	 */
	public int updateModuleByOid(int oldId, Module module) {
		int result = 400;
		try {
			Module oldModule = getModuleById(oldId);
			if (null == oldModule) {
				log.error("模块不存在!");
				return result;
			}
			if (oldModule.getPageId() != module.getPageId()) {
				oldModule.setPageId(module.getPageId());
			}
			if (oldModule.getType() != module.getType()) {
				oldModule.setType(module.getType());
			}
			if (StringUtils.isNotBlank(module.getRelateIds())) {
				oldModule.setRelateIds(module.getRelateIds());
			}
			if (StringUtils.isNotBlank(module.getRemark())) {
				oldModule.setRemark(module.getRemark());
			}
			if (StringUtils.isNotBlank(module.getExt1())) {
				oldModule.setExt1(module.getExt1());
			}
			if (StringUtils.isNotBlank(module.getExt2())) {
				oldModule.setExt2(module.getExt2());
			}
			if (StringUtils.isNotBlank(module.getExt3())) {
				oldModule.setExt3(module.getExt3());
			}
			if (StringUtils.isNotBlank(module.getExt4())) {
				oldModule.setExt4(module.getExt4());
			}
			if (StringUtils.isNotBlank(module.getExt5())) {
				oldModule.setExt5(module.getExt5());
			}
			return moduleDao.updateAll(oldModule) > 0 ? 200 : 400;
		} catch (Exception e) {
			log.error("更新模块失败!id=" + oldId, e);
		}
		return result;
	}

	/**
	 * 删除模块
	 * 
	 * @param delId
	 * @return
	 */
	public int delModuleById(int delId) {
		int result = 400;
		try {
			Module oldModule = getModuleById(delId);
			if (null == oldModule) {
				log.error("模块不存在!");
				return result;
			}
			return moduleDao.deleteById(Module.class, delId) > 0 ? 200 : 400;
		} catch (Exception e) {
			log.error("删除模块失败!id=" + delId, e);
		}
		return result;
	}

	/**
	 * 删除多个模块
	 * 
	 * @param mids
	 * @return
	 */
	public int delMoreModule(String mids) {
		int result = 400;
		try {
			if (StringUtils.isBlank(mids)) {
				return result;
			}
			String[] delIds = mids.split(",");
			for (String delId : delIds) {
				moduleDao.deleteById(Module.class, Integer.parseInt(delId));
			}
			return 200;
		} catch (Exception e) {
			log.error("删除模块失败!mids=" + mids, e);
		}
		return result;
	}

}
