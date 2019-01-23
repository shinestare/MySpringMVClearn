package com.bling.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bling.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/user", method=RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("user", "command", new User());
	}
	
	/**
	 * 单选按钮的index，为了不和/user冲突，改了名字
	 * @return
	 */
	@RequestMapping(value = "/user2", method = RequestMethod.GET)
	public ModelAndView userTest() {
		User user = new User();
		user.setFavoriteFrameworks(new String []{"Spring MVC","Struts 2"});
		user.setGender("M");
		ModelAndView modelAndView = new ModelAndView("user", "command", user);
		return modelAndView;
	}
	
	@RequestMapping(value="/adduser", method=RequestMethod.POST)
	public String adduser(@ModelAttribute("SpringWeb") User user,
			ModelMap model) {
		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("address", user.getAddress());
		model.addAttribute("receivePaper", user.isReceivePaper());
		model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
		model.addAttribute("gender", user.getGender());
		model.addAttribute("favoriteNumber", user.getFavoriteNumber());
		model.addAttribute("country", user.getCountry());
		model.addAttribute("skills", user.getSkills());
		
		return "userlist";
	}
	
	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList() {
		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Spring Boot");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("Apache Hadoop");
		
		return webFrameworkList;
	}
	
	@ModelAttribute("numbersList")
	public List<String> getNumberList(){
		List<String> numbersList = new ArrayList<String>();
		numbersList.add("1");
		numbersList.add("2");
		numbersList.add("3");
		numbersList.add("4");
		return numbersList;
	}
	
	@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {
		Map<String, String> countryList = new HashMap<String, String>();
		countryList.put("US", "United States");
		countryList.put("CH", "China");
		countryList.put("SG", "Singapore");
		countryList.put("MY", "Malaysia");
		return countryList;
   }
	
	@ModelAttribute("skillsList")
	public Map<String, String> getSkillsList() {
		Map<String, String> skillList = new HashMap<String, String>();
		skillList.put("Hibernate", "Hibernate");
		skillList.put("Spring", "Spring");
		skillList.put("Apache Hadoop", "Apache Hadoop");
		skillList.put("Struts", "Struts");
		return skillList;
	}
}
