package com.crudappgenahm23.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("SecondServlet--doGet()");
		
		String value = (String)request.getAttribute("test1");
		
		System.out.println("SecondServlet---Value : " + value);
		
		request.removeAttribute("test1");
		
		System.out.println("SecondSerlvet---test1---removed from request");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
