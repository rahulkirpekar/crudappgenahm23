package com.crudappgenahm23.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent sce) 
	{
		System.out.println("Context object Created : contextInitialized()");
	}
	public void contextDestroyed(ServletContextEvent sce) 
	{
		System.out.println("Context object Created : contextDestroyed()");
	}
}
