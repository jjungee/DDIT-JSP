package com.jsp.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class GetInitParamListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce)  { 
		ServletContext sc = sce.getServletContext();
		
		String message = sc.getInitParameter("message");
		
		System.out.println("message	");
	}
	
	public void contextDestroyed(ServletContextEvent sce)  { 
		System.out.println("listener 종료");
    }

}
