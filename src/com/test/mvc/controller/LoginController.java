package com.test.mvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.mvc.serice.LoginService;

@Controller
public class LoginController {

	@Resource
	LoginService service;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping("index")
	public ModelAndView toLoginPage() {
		return new ModelAndView("WEB-INF/jsp/login.jsp");
	}
	
	@RequestMapping("login")
	public ModelAndView doLogin() {
		
		String loginPageUrl = "WEB-INF/jsp/login.jsp";
		String successPageUrl = "WEB-INF/jsp/success.jsp";
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		 
		return service.doLogin(loginPageUrl, successPageUrl, username, password);
	}
}
