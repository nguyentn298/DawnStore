package com.dante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "testAjax")
public class TestAjax {

	@RequestMapping(value = "testLoad", method = RequestMethod.GET)
	public String loadAjax() {
		return "test-jquery";
		
	}
	
	@RequestMapping(value = "testLoadPage", method = RequestMethod.GET)
	public String loadAjaxPage() {
		return "test-jquery-load";
		
	}
}
