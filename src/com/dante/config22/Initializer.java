package com.dante.config22;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	private static final String MAPPING_URL = "/";

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("in config");
		return new Class[] { WebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("dispatcher");
		return new String[] { MAPPING_URL };
	}

}
