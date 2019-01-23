package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ����ʾ����ʾ���ʹ��Spring MVC Framework��дһ���򵥵Ļ���Web��Ӧ�ó���������ʹ��<mvc:resources>��Ƿ��ʾ�̬ҳ��Ͷ�̬ҳ�档
 * 
 * @author wangjian31
 *
 */
@Controller
public class StaticPageController {

	/**
	 * �������ʹ�������⣬��Ϊ����index֮��Ĭ�ϵ�·����/WEB-INF/jsp/index.jsp������ʵ�ʲ������·���Ҳ����ļ���
	 * @return
	 */
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/staticPage", method=RequestMethod.GET)
	public String redirect() {
		return "redirect:/jsp/staticPage.html";
	}
}
