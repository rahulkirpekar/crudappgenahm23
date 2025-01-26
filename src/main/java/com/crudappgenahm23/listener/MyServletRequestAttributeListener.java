package com.crudappgenahm23.listener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener 
{
	public void attributeAdded(ServletRequestAttributeEvent srae) 
	{
		System.out.println("MyServletRequestAttributeListener---attributeAdded()");
	}
	public void attributeReplaced(ServletRequestAttributeEvent srae) 
	{
		System.out.println("MyServletRequestAttributeListener---attributeReplaced()");
	}
	public void attributeRemoved(ServletRequestAttributeEvent srae) 
	{
		System.out.println("MyServletRequestAttributeListener---attributeRemoved()");
	}
}
