package com.crudappgenahm23.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetAllCookiesServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Cookie cookies[] = request.getCookies();

		for (int i = 0; i < cookies.length; i++) 
		{
			Cookie cookie = cookies[i];
			
			if (cookie.getValue().equals("admin")) 
			{
				PrintWriter out =	response.getWriter();
				out.print("<h2>UserName : </h2>"+cookie.getValue());
				System.out.println(cookie.getName() +" " + cookie.getValue());
			} else 
			{
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
