/**
 * 
 */
package com.gzwabao.service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.nutz.dao.Cnd;
import org.nutz.dao.Condition;
import org.nutz.dao.pager.Pager;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.upload.TempFile;

import com.gzwabao.dao.PictureDao;
import com.gzwabao.entity.Picture;

/**
 * @author Alex
 *
 */
@IocBean
public class PictureService {
	private static final Log log = Logs.getLog(PictureService.class);

	@Inject(value = "pictureDao")
	private PictureDao pictureDao;

	/**
	 * 获取图片列表
	 * 
	 * @param curPage
	 * @param pageSize
	 * @param keyword
	 * @return
	 */
	public Map<String, Object> getPictureList(int curPage, int pageSize,
			String keyword) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			Pager pager = new Pager();
			int totalRecord = 0;
			Condition cnd = null;
			if (StringUtils.isBlank(keyword)) {
				totalRecord = pictureDao.getCount(Picture.class, cnd);

			} else {
				cnd = Cnd.where("name", "like", "%" + keyword + "%");
				totalRecord = pictureDao.getCount(Picture.class, cnd);
			}
			pager.setRecordCount(totalRecord);
			if (curPage <= 0 || pageSize <= 0) {
				pager.setPageNumber(1);
				pager.setPageSize(Pager.DEFAULT_PAGE_SIZE);
			} else {
				pager.setPageNumber(curPage);
				pager.setPageSize(pageSize);
			}
			resultMap.put("pager", pager);
			List<Picture> recordList = pictureDao.queryAll(Picture.class, cnd,
					pager);
			resultMap.put("recordList", recordList);
			return resultMap;
		} catch (Exception e) {
			log.error("获取图片列表失败!", e);
		}
		return null;
	}

	/**
	 * 添加图片
	 * 
	 * @param tf
	 * @param picture
	 * @param req
	 * @return
	 */
	public String addPicture(TempFile tf, Picture picture,
			HttpServletRequest req) {
		if (null == tf) {
			// 未选择图片
			return "not_select_img";
		}
		File f = tf.getFile();
		String parent = req.getSession().getServletContext()
				.getRealPath("/upload/image");
		File imgDir = new File(parent);
		if (!imgDir.exists()) {
			imgDir.mkdir();
		}
		File imgFile = new File(imgDir, System.currentTimeMillis()
				+ f.getName());
		try {
			FileUtils.copyFile(f, imgFile);
			picture.setPath("/upload/image/" + imgFile.getName());
			pictureDao.save(picture);
			if (f != null) {
				f.delete();
			}
		} catch (Exception e) {
			log.error("添加失败!", e);
			// 添加失败
			return "add_error";
		}
		return "add_success";
	}

}
