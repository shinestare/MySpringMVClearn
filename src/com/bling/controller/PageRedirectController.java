package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageRedirectController {

	// ��Ϊ������ҳ���/index��ͻ�����Ƕ�����ת��ͬһ��ҳ�棬���������ע�͵���
	/*@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}*/
	
	@RequestMapping(value="/pageRedirect", method=RequestMethod.GET)
	public String redirect() {
		return "redirect:pageRedirectResultPage";
	}
	
	@RequestMapping(value="/pageRedirectResultPage", method=RequestMethod.GET)
	public String pageRedirectResultPage() {
		return "pageRedirectResult";
	}
}
