//package com.dante.config;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//import javax.servlet.ServletRegistration.Dynamic;
//
//import org.springframework.context.annotation.Profile;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class HelloWorldInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext container) throws ServletException {
//
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(HelloWordConfig.class);
//		
//		ctx.setServletContext(container);
//
//		ServletRegistration.Dynamic servlet = container.addServlet(
//				"Dawn", new DispatcherServlet(ctx));
//
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
//	}
////	dispatcher
////	public void onStartup(ServletContext container) throws ServletException {
////		 
////		 AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
////		 ctx.register(HelloWordConfig.class);
////		 
////		 ctx.setServletContext(container);
////		 
////		 Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
////		 servlet.addMapping("/");
////		 servlet.setLoadOnStartup(1);
////		 
////		 }
//}
