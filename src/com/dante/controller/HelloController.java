package com.dante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String myString(ModelMap model) {
		model.addAttribute("test123", "This is my test with model map 123");
		return "view";
	}

	@RequestMapping(value = "/myStringAgain", method = RequestMethod.GET)
	public String myStringAgain(ModelMap model) {
		model.addAttribute("test123", "This is my test with model map 123, Again, gain, ain, in!!");
		return "view";
	}
}