package com.bling.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bling.others.ResourceNotFoundException;
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
	private Logger logger = Logger.getLogger(HelloController.class);
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model, HttpServletResponse response){
		boolean dealed = true;
		logger.error("helloaaaa");
		if (dealed) {
			model.addAttribute("message", "Hello Spring MVC Framework!");
			return "hello";
		} else {
//			response.setStatus(HttpServletResponse.SC_NOT_FOUND);//设置状态码，好像没什么用
//			response.sendError(HttpServletResponse.SC_NOT_FOUND, "我说资源没有找到你信吗");//设置状态码，好像有问题，不知道为什么
			throw new ResourceNotFoundException();//把这个异常抛出，就能返回异常类标注的状态码
		}
	}
}
