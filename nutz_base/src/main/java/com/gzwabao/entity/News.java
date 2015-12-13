package com.gzwabao.entity;

import java.io.Serializable;
import java.util.Date;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * 前端资讯
 * 
 * @since 2015年11月5日 上午11:10:12
 * @author Alex
 */
@Table(value = "news")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id(auto = true)
	// id主键,自增
	private int id;

	@Column(value = "title")
	@ColDefine(type = ColType.VARCHAR, width = 50, notNull = true)
	private String title;

	@Column(value = "content")
	@ColDefine(type = ColType.VARCHAR, width = 1024, notNull = true)
	private String content;

	@Column(value = "create_time")
	@ColDefine(type = ColType.DATETIME, notNull = true)
	private Date createTime;

	@Column(value = "update_time")
	@ColDefine(type = ColType.DATETIME, notNull = true)
	private Date updateTime;

	@Column(value = "remark")
	@ColDefine(type = ColType.VARCHAR, width = 250, notNull = false)
	private String remark;

	@Column(value = "ext1")
	@ColDefine(type = ColType.VARCHAR, width = 250, notNull = false)
	private String ext1;

	@Column(value = "ext2")
	@ColDefine(type = ColType.VARCHAR, width = 250, notNull = false)
	private String ext2;

	@Column(value = "ext3")
	@ColDefine(type = ColType.VARCHAR, width = 250, notNull = false)
	private String ext3;

	@Column(value = "ext4")
	@ColDefine(type = ColType.VARCHAR, width = 250, notNull = false)
	private String ext4;

	@Column(value = "ext5")
	@ColDefine(type = ColType.VARCHAR, width = 250, notNull = false)
	private String ext5;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getExt2() {
		return ext2;
	}

	public void setExt2(String ext2) {
		this.ext2 = ext2;
	}

	public String getExt3() {
		return ext3;
	}

	public void setExt3(String ext3) {
		this.ext3 = ext3;
	}

	public String getExt4() {
		return ext4;
	}

	public void setExt4(String ext4) {
		this.ext4 = ext4;
	}

	public String getExt5() {
		return ext5;
	}

	public void setExt5(String ext5) {
		this.ext5 = ext5;
	}

}
