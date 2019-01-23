package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 以下示例显示如何使用Spring MVC Framework编写一个简单的基于Web的应用程序，它可以使用<mvc:resources>标记访问静态页面和动态页面。
 * 
 * @author wangjian31
 *
 */
@Controller
public class StaticPageController {

	/**
	 * 这个方法使用有问题，因为返回index之后，默认的路径是/WEB-INF/jsp/index.jsp，但是实际不是这个路径找不到文件。
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
