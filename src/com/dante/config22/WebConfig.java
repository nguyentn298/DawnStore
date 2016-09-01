//package com.dante.config22;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@EnableWebMvc
//@Configuration
//@ComponentScan({ "com.dante.controller" })
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//	private static final String VIEW_LOCATION = "/WEB-INF/views/";
//	private static final String SUFFIX = ".jsp";
//
//	// @Override
//	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	// System.out.println("in resource");
//	// registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	// }
//
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		System.out.println("in view");
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		viewResolver.setPrefix(VIEW_LOCATION);
//		viewResolver.setSuffix(SUFFIX);
//		return viewResolver;
//	}
//
//}