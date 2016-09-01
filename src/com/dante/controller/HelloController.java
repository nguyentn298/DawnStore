package com.dante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String myString(Model model) {
		model.addAttribute("test123", "This is my test with model map 123");
		return "view";
	}

	@RequestMapping(value = "/myStringAgain", method = RequestMethod.GET)
	public String myStringAgain(Model model) {
		model.addAttribute("test123", "This is my test with model map 123, Again, gain, ain, in!!");
		return "view";
	}
}
