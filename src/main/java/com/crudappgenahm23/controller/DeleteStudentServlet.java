package com.crudappgenahm23.controller;

import java.io.IOException;

import com.crudappgenahm23.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int rno = Integer.parseInt(request.getParameter("rno"));
		
		System.out.println("DeleteStudentServlet :: " + rno);
		
		StudentDao dao = new StudentDao();
		
		int rowAffected = dao.deleteStudent(rno);
		
		RequestDispatcher rd = null;
		
		if (rowAffected > 0) 
		{
			rd = request.getRequestDispatcher("listStudentServlet");
		} else 
		{
			rd = request.getRequestDispatcher("registration.jsp");
		}
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}