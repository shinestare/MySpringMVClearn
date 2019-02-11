package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageRedirectController {

	// 因为和其他页面的/index冲突，但是都是跳转到同一个页面，所以这里就注释掉了
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
