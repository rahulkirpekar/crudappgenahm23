package com.crudappgenahm23.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
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
				// create session
				HttpSession session = request.getSession();// true
//				request.getSession(true);// true
//				request.getSession(false);// false
				
				
				session.setAttribute("userName", userName);
				
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
