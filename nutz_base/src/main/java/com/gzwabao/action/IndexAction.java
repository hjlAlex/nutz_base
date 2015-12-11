package com.gzwabao.action;

import java.io.File;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.AdaptBy;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;
import org.nutz.mvc.upload.TempFile;
import org.nutz.mvc.upload.UploadAdaptor;

import com.gzwabao.service.UserService;

/**
 * 
 * @since 2015年11月5日 下午5:45:16
 * @author Administrator
 */
@IocBean
@At({ "/", "/index" })
public class IndexAction {
	@Inject(value = "userService")
	private UserService userService;

	@At("")
	@Ok("vm:template.index")
	public void main() {

	}

	@At("/welcome")
	@Ok("vm:template.welcome")
	public String welcome() {
		return "";
	}

	@At("/upload")
	@Ok("vm:template.upload")
	@AdaptBy(type = UploadAdaptor.class, args = { "${app.root}/WEB-INF/tmp" })
	public void upload(@Param("file1") TempFile tf) {
		File f = tf.getFile();
		System.out.println(f.getName());
	}

}
