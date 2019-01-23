package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

/**
 * Spring MVC Hello Worldʾ��
 *	1������jar��
 *	2������Controller��
 *	3��WebContent/WEB-INF�ļ����´���Spring�����ļ�web.xml��HelloWeb-servlet.xml��
 *	4����WebContent/WEB-INF�ļ����´���һ����Ϊjsp�����ļ��С��ڴ����ļ����´�����ͼ�ļ�hello.jsp
 *	5����������Դ�������ļ������ݲ�����Ӧ�ó����ֱ����Eclipse�����С��ο�web.xml��spring-mvc.xml��jsp/hello.jsp�ļ�������
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
