package com.crudappgenahm23.controller;

import java.io.IOException;

import com.crudappgenahm23.bean.StudentBean;
import com.crudappgenahm23.dao.StudentDao;
import com.crudappgenahm23.util.StringUtils;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String nameStr = request.getParameter("name");
		String stdStr = request.getParameter("std");
		String marksStr = request.getParameter("marks");
		
		boolean flag = false;
		
		StudentBean sbean = new StudentBean();
		
		// Backend validations
		// name--validation
		if(StringUtils.isValidString(nameStr)) 
		{
			// nameStr set -->sbean
			sbean.setName(nameStr);
		}else 
		{
			String nameErrMsg = "<font color='red'>Please enter valid Name</font>";
			request.setAttribute("nameErrMsg", nameErrMsg);
			flag = true;
		}
		
		// std--validation
		if(StringUtils.isValidString(stdStr)) 
		{
			// std set -->sbean
			int std = Integer.parseInt(stdStr);
			sbean.setStd(std);
		}else 
		{
			String stdErrMsg = "<font color='red'>Please enter valid Std</font>";
			request.setAttribute("stdErrMsg", stdErrMsg);
			flag = true;
		}
		
		// marks--validation
		if(StringUtils.isValidString(marksStr)) 
		{
			// marks set -->sbean
			int marks = Integer.parseInt(marksStr);
			sbean.setMarks(marks);
		}else 
		{
			String marksErrMsg = "<font color='red'>Please enter valid Marks</font>";
			request.setAttribute("marksErrMsg", marksErrMsg);
			flag = true;
		}
		RequestDispatcher rd = null;
		if (flag) 
		{
			request.setAttribute("sbean", sbean);
			
			rd = request.getRequestDispatcher("registration.jsp");
		} else 
		{
			StudentDao dao = new StudentDao();
			int rowsAffected = dao.insertStudent(sbean);
			
			if (rowsAffected > 0) 
			{
				rd = request.getRequestDispatcher("listStudentServlet");
			}else 
			{
				request.setAttribute("siteDown", ".......");
				rd = request.getRequestDispatcher("registration.jsp");
			}
		}
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}