package com.bling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bling.model.Student;

/**
 * 示例springmvc错误处理
 * 
 * @author wangjian31
 *
 */
@Controller
public class StudentValidationController {
	
	@Autowired
	@Qualifier("studentValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
			binder.setValidator(validator);
	}
	   
	@RequestMapping(value = "/addStudentValidation", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("addStudentValidation", "command", new Student());
	}

	@ModelAttribute("studentValidation")
	public Student createStudentModel() {    
		return new Student();
	}

	@RequestMapping(value = "/addStudentValidation", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("studentValidation") @Validated Student student, 
			BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return "addStudentValidation";
		}
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
	
		return "studentResult";	// 和StudentController共用同一个结果页面
	}
}
