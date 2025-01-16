package com.crudappgenahm23.controller;

import java.io.IOException;

import com.crudappgenahm23.bean.StudentBean;
import com.crudappgenahm23.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditStudentServlet
 */
public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int rno = Integer.parseInt(request.getParameter("rno"));

		StudentDao dao = new StudentDao();
		
		StudentBean s = (StudentBean)dao.getStudentByRno(rno);
		
		request.setAttribute("studentBean", s);
		
		request.getRequestDispatcher("editstudent.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
