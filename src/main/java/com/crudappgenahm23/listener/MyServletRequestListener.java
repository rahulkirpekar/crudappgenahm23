package com.crudappgenahm23.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener	
{
	public void requestInitialized(ServletRequestEvent sre) 
	{
		System.out.println("Request Object Created");
	}
	public void requestDestroyed(ServletRequestEvent sre) 
	{
		System.out.println("Request Object Destroyed");
	}
}
