package com.test.mvc.serice;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {

	public ModelAndView doLogin(String loginPageUrl, String successPageUrl,
			String username, String password) {

		if (username == null ||"".equals(username)) {
			return new ModelAndView(loginPageUrl, "error", "用户名不能为空");
		}
		if (password == null ||"".equals(password)) {
			return new ModelAndView(loginPageUrl, "error", "密码不能为空");
		}
		
		// 此处应该调用数据库查询，为了简便，假设username=admin, password=123
		if (username.equals("admin") && password.equals("123")) {
			return new ModelAndView(successPageUrl);
		}
		
		return new ModelAndView(loginPageUrl, "error", "用户名或密码不能为空");
	}

}
