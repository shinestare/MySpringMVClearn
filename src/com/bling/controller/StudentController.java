package com.bling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.bling.model.Student;

/**
 * 示例演示如何编写一个简单的基于Web的应用程序，它使用Spring Web MVC框架使用HTML表单。
 *  首先使用Eclipse IDE，并按照以下步骤使用Spring Web Framework开发基于动态表单的Web应用程序：web.xml和spring-mvc.xml和jar包
 *  创建两个Java类Student，StudentController。在jsp子文件夹下创建两个视图文件student.jsp，studentResult.jsp。
 * 
 * @author wangjian31
 *
 */
@Controller
public class StudentController {
	
	/**
	 * 这里的第一个服务方法student()，我们已经在ModelAndView对象中传递了一个名为“command”的空对象，
	 * 因为如果在JSP中使用<form：form>标签，spring框架需要一个名为“command”的对象文件。
	 *  所以当调用student()方法时，它返回student.jsp视图。
	 * @return
	 */
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}
	
	/**
	 * 第二个服务方法addStudent()将在 /addStudent上的POST方法提交时调用。
	 * 将根据提交的信息准备模型对象。最后，将从服务方法返回“studentResult”视图，这将最终渲染studentResult.jsp视图。
	 * @param student
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("springWeb") Student student,
			ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		model.addAttribute("gender", student.getGender());
		
		return "studentResult";
	}
}
