package com.crudappgenahm23.listener;

import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

public class MyServletContextAttributeListener implements ServletContextAttributeListener 
{
	public void attributeAdded(HttpSessionBindingEvent se) 
	{
		System.out.println("MyServletContextAttributeListener : attributeAdded()");
	}
	public void attributeReplaced(HttpSessionBindingEvent se) 
	{
		System.out.println("MyServletContextAttributeListener : attributeReplaced()");
	}
	public void attributeRemoved(HttpSessionBindingEvent se) 
	{
		System.out.println("MyServletContextAttributeListener : attributeRemoved()");
	}	
}
