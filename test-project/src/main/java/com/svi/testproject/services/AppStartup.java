package com.svi.testproject.services;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.svi.testproject.enums.Config;

@WebListener
public class AppStartup implements ServletContextListener{
	private static final String CONFIG_INI_LOCATION = "CONFIG_INI_LOCATION";
	private ServletContext context;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		this.context = sce.getServletContext();
		
		Config.setContext(context.getResourceAsStream(context.getInitParameter(CONFIG_INI_LOCATION)));
		
		//setup config
		//database connection
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//database close
	}

}
