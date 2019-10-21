package com.ss.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String display() {
		return "index";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		System.out.println("Application Startup Welcome Page");
		return "welcome";
	}
	@RequestMapping(value = "/redirect_page", method = RequestMethod.GET)
	public String redirect() {
		System.out.println("Redirecting Result To The Final Page");
		return "redirect:final_page";
	}

	@RequestMapping(value = "/final_page", method = RequestMethod.GET)
	public String finalPage() {
		System.out.println("Showing The Redirected Page");
		return "final";
	}
}
