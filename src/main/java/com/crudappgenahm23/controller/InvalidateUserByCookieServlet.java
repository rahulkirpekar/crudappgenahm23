package com.crudappgenahm23.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InvalidateUserByCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie cookies[] = request.getCookies();

		for (int i = 0; i < cookies.length; i++) 
		{
			Cookie cookie = cookies[i];
			
			if (cookie.getName().equals("userName")) 
			{
				cookie.setMaxAge(0);// cookie.setValue("");
				response.addCookie(cookie);
			}
//			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		response.sendRedirect("login.jsp");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}

/*
 * 
 * 
 * Cookie-----data---session---j-session-Id



	Cookie cookie = new Cookie("userName",userName);

	cookie.setMaxAge(60*60*24);// 1 day
	
	response.addCookie(cookie);
	
	*
	*/
