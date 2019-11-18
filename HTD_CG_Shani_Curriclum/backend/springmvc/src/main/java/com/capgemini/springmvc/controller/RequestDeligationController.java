package com.capgemini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationController {
	@GetMapping("/redirect")
	public String redirectRequest() {
		return "redirect:http://www.google.com";
	}

	@GetMapping("/forward")
	public String forwardRequest() {
		return "forword:/loginForm";
	}
//@GetMapping("/include")
//public String includetRequest() {
//	return "include:http://www.google.com";
//}
}
