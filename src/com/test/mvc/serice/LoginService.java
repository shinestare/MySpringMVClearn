package com.test.mvc.serice;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LoginService {

	public ModelAndView doLogin(String loginPageUrl, String successPageUrl,
			String username, String password) {

		if (username == null ||"".equals(username)) {
			return new ModelAndView(loginPageUrl, "error", "�û�������Ϊ��");
		}
		if (password == null ||"".equals(password)) {
			return new ModelAndView(loginPageUrl, "error", "���벻��Ϊ��");
		}
		
		// �˴�Ӧ�õ������ݿ��ѯ��Ϊ�˼�㣬����username=admin, password=123
		if (username.equals("admin") && password.equals("123")) {
			return new ModelAndView(successPageUrl);
		}
		
		return new ModelAndView(loginPageUrl, "error", "�û��������벻��Ϊ��");
	}

}
