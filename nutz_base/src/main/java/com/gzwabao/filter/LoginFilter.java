package com.gzwabao.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.View;

import com.gzwabao.entity.User;
import com.gzwabao.view.VelocityLayoutView;

public class LoginFilter implements ActionFilter {

	public View match(ActionContext actionContext) {
		HttpServletRequest req = actionContext.getRequest();
		String uri = req.getRequestURI().toLowerCase();
		if (uri.endsWith("login") || uri.endsWith("logout")
				|| uri.endsWith("code")) {
			return null;
		} else {
			if (req.getSession().getAttribute(User.SESSION_USER) != null) {
				return null;
			} else {
				String loginTip = req.getParameter("tip");
				if (StringUtils.isNotBlank(loginTip)) {
					req.setAttribute("tip", loginTip);
				}
				return new VelocityLayoutView("template.login");
			}
		}
	}

}
