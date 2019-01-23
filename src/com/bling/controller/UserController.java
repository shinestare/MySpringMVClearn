package com.bling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.bling.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("user", "command", new User());
	}
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public String adduser(@ModelAttribute("SpringWeb") User user,
			ModelMap model) {
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("address", user.getAddress());
		model.addAttribute("receivePaper", user.isReceivePaper());
		
		return "userlist";
	}
}
