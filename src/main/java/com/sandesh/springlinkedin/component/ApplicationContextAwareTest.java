package com.sandesh.springlinkedin.component;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAwareTest implements ApplicationContextAware  {
	ApplicationContext context;
	
	public ApplicationContext getContext() {
		return context;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context=context;
	}
} 
