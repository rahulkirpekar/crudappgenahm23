package com.crudappgenahm23.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener
{
	public void sessionCreated(HttpSessionEvent se) 
	{
		System.out.println("sessionCreated()---Session Object Created");
	}
	public void sessionDestroyed(HttpSessionEvent se) 
	{
		System.out.println("sessionDestroyed()---Session Object Destroyed");
	}
}
