package com.crudappgenahm23.listener;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener 
{
	public void attributeAdded(HttpSessionBindingEvent se) 
	{
		System.out.println("MyHttpSessionAttributeListener : attributeAdded()");
	}
	public void attributeReplaced(HttpSessionBindingEvent se) 
	{
		System.out.println("MyHttpSessionAttributeListener : attributeReplaced()");
	}
	public void attributeRemoved(HttpSessionBindingEvent se) 
	{
		System.out.println("MyHttpSessionAttributeListener : attributeRemoved()");
	}
}
