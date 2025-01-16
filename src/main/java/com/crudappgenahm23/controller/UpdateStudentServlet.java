package com.crudappgenahm23.controller;

import java.io.IOException;

import com.crudappgenahm23.bean.StudentBean;
import com.crudappgenahm23.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("UpdateStudentServlet---dogGet()");
		String rnoStr = request.getParameter("rno");		
		String nameStr = request.getParameter("name");
		String stdStr = request.getParameter("std");
		String marksStr = request.getParameter("marks");
		
		int rno = Integer.parseInt(rnoStr);
		int std = Integer.parseInt(stdStr);
		int marks = Integer.parseInt(marksStr);
		
		StudentBean sbean = new StudentBean(rno, nameStr, std, marks);
		
		System.out.println("sbean ==>"+sbean);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,rno);
		
		RequestDispatcher rd = null;
		
		if (rowsAffected > 0) 
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
