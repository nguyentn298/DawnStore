package com.dante.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class HelloWorldInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(HelloWordConfig.class);

		ctx.setServletContext(servletContext);
		
		EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.ERROR);

		configureSiteMeshFilter(servletContext, dispatcherTypes);
		
		Dynamic servlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);

	}

	private void configureSiteMeshFilter(ServletContext servletContext, EnumSet<DispatcherType> dispatcherTypes) {
		SiteMeshFilter siteMeshFilter = new SiteMeshFilter();
		FilterRegistration.Dynamic sitemesh = servletContext.addFilter("sitemesh", siteMeshFilter);
		sitemesh.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
	}
	// Use for Jboss
	// @Override
	// public void onStartup(ServletContext servletContext) throws
	// ServletException {
	//
	// AnnotationConfigWebApplicationContext ctx = new
	// AnnotationConfigWebApplicationContext();
	// ctx.register(HelloWordConfig.class);
	//
	// ctx.setServletContext(servletContext);
	//
	// Dynamic servlet = servletContext.addServlet("dispatcher",
	// new DispatcherServlet(ctx));
	// servlet.addMapping("*.do");
	// servlet.setLoadOnStartup(1);
	//
	// }

}
