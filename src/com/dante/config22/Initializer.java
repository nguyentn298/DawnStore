//package com.dante.config22;
//
//import javax.servlet.Filter;
//
//import org.sitemesh.webapp.SiteMeshFilter;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class Initializer extends
//		AbstractAnnotationConfigDispatcherServletInitializer {
//
//	private static final String MAPPING_URL = "/";
//
//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		System.out.println("in config");
//		return null;
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class[] { WebConfig.class };
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		System.out.println("dispatcher");
//		return new String[] { MAPPING_URL };
//	}
//
//	@Override
//	protected Filter[] getServletFilters() {
//		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//		characterEncodingFilter.setEncoding("UTF-8");
//		return new Filter[] { characterEncodingFilter, new SiteMeshFilter(null, null, null, false) };
//	}
//
//}
