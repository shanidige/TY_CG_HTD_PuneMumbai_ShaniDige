package com.capgemini.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

	@GetMapping("/cookiePage")
	public String displayCookiePage() {
		return "cookiePage";
	}

	@GetMapping("/createCookie")
	public String createCookiePage(HttpServletResponse resp, ModelMap modelMap) {
		Cookie myCookie = new Cookie("name", "shani");
		resp.addCookie(myCookie);
		modelMap.addAttribute("msg", "Cookie Create Succesfully");
		return "cookiePage";
	}
	
	@GetMapping("/readCookie")
	public String readCookiePage(@CookieValue(name="name") String name, ModelMap modelMap) {
		
	
		modelMap.addAttribute("msg", "Cookie value is "+name );
		return "cookiePage";
	}
	

}
