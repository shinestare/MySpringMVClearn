package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * Spring MVC Hello World示例
 *	1、导入jar包
 *	2、创建Controller类
 *	3、WebContent/WEB-INF文件夹下创建Spring配置文件web.xml和HelloWeb-servlet.xml。
 *	4、在WebContent/WEB-INF文件夹下创建一个名为jsp的子文件夹。在此子文件夹下创建视图文件hello.jsp
 *	5、创建所有源和配置文件的内容并导出应用程序或直接在Eclipse中运行。参考web.xml和spring-mvc.xml和jsp/hello.jsp文件的内容
 * 
 * @author wangjian31
 * 
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message", "Hello Spring MVC Framework!");
		
		return "hello";
	}
}
