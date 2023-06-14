package com.springSecurityConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
         Class [] config = {AppConfig.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() {
	     String [] mapping = {"/"};
		return mapping;
		
	}

}
