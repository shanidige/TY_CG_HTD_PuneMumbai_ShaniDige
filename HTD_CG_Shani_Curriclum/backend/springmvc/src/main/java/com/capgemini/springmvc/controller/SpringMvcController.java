package com.capgemini.springmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.springmvc.beans.UserBean;

@Controller

public class SpringMvcController { //  how to get date 
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView displayHelloUser() {
		ModelAndView modelAndView = new ModelAndView();
		/* modelAndView.setViewName("/WEB-INF/views/helloUser.jsp"); */
		modelAndView.setViewName("helloUser");
		return modelAndView;

	}// end of displayHelloUser()

//View the login Form request to dispatcher & get response by servlet apporach
	@RequestMapping(path = "/loginForm", method = RequestMethod.GET)
	public ModelAndView displayLoginForm() {
		ModelAndView modelAndView = new ModelAndView();
		/* modelAndView.setViewName("/WEB-INF/views/loginForm.jsp"); */
		modelAndView.setViewName("loginForm");// as we using internal resource for login Form 3
		return modelAndView;

	}// end of displayLoginForm()

	// handler Methods

	// View the login Form2 request to dispatcher & get response by spring apporach
	@RequestMapping(path = "/login2", method = RequestMethod.POST)
	public String login2(@RequestParam("empId") int empId, @RequestParam("password") String password,
			ModelMap modelMap) {

		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);
		/* return "/WEB-INF/views/userDetails.jsp"; */
		return "UserDetails";// as we using internal resource for login Form 3
	}// end of login2()

	// View the login Form3 request to dispatcher & get response
	@PostMapping("/login3")
	public String login3(int empId, String password, ModelMap modelMap) {
		modelMap.addAttribute("empId", empId);
		modelMap.addAttribute("password", password);
		return "userDetails";// as we using internal resource for login Form 3

	}

	@PostMapping("/login4")
	public String login4(UserBean userBean, ModelMap modelMap) {
		modelMap.addAttribute("UserBean", userBean);

		return "userDetails";// as we using internal resource for login Form 3

	}

}
