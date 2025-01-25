package com.crudappgenahm23.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginByCoockieServlet extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		if (   ((userName!=null)  && (userName.trim().length()>0))  && ((password!=null)  && (password.trim().length()>0))   ) 
		{
			if(("admin".equals(userName))  && ("admin@123".equals(password))) 
			{
				Cookie cookie = new Cookie("userName", userName);
				
				// 1--day
				cookie.setMaxAge(60*60 *24);
				
				response.addCookie(cookie);
				
				rd = request.getRequestDispatcher("registration.jsp");
			}else 
			{
				rd = request.getRequestDispatcher("login.jsp");
			}
		} else 
		{
			rd = request.getRequestDispatcher("login.jsp");
		}
		rd.forward(request, response);
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
