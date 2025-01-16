  <?xml version="1.0" encoding="UTF-8" ?>
  
  <%@page import="com.crudappgenahm23.bean.StudentBean"%>
  <%@page import="java.util.ArrayList"%>
  
  <!DOCTYPE html>
  <html lang="en">
  <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Student List Page</title>
      <style>
          body {
              font-family: Arial, sans-serif;
              margin: 0;
              padding: 0;
              background-color: #f4f4f9;
          }

          h2 {
              text-align: center;
              color: #2c3e50;
              margin-top: 20px;
          }

          table {
              width: 80%;
              margin: 20px auto;
              border-collapse: collapse;
              background-color: #ecf0f1;
              box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
          }

          th, td {
              padding: 10px;
              text-align: left;
              border-bottom: 1px solid #bdc3c7;
          }

          th {
              background-color: #3498db;
              color: white;
              text-transform: uppercase;
          }

          tr:nth-child(even) {
              background-color: #f9f9f9;
          }

          tr:hover {
              background-color: #dfe6e9;
          }

          td a {
              text-decoration: none;
              color: white;
              padding: 6px 12px;
              border-radius: 4px;
              font-size: 14px;
              font-weight: bold;
              box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
              transition: all 0.3s ease;
          }

          td a.edit {
              background-color: #27ae60;
          }

          td a.edit:hover {
              background-color: #229954;
              transform: scale(1.05);
          }

          td a.delete {
              background-color: #e74c3c;
          }

          td a.delete:hover {
              background-color: #c0392b;
              transform: scale(1.05);
          }

          .container {
              padding: 20px;
          }

          .btn-container {
              text-align: center;
              margin-top: 20px;
          }

          .btn {
              display: inline-block;
              padding: 10px 20px;
              background-color: #2980b9;
              color: #fff;
              text-decoration: none;
              border-radius: 5px;
              font-size: 14px;
              margin: 10px;
              box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
              transition: all 0.3s ease;
          }

          .btn:hover {
              background-color: #1f618d;
              transform: scale(1.05);
          }
      </style>
  </head>
      
    <%
    		if((session == null)  || (session.getAttribute("userName")==null))
    		{
    			response.sendRedirect("login.jsp");
    		}
    %>
  <body>
      <h2>Student Listing Page</h2>
      
      <a href="logoutServlet">Logout</a>

      <div class="container">
          <table>
              <thead>
                  <tr>
                      <th>Roll No</th>
                      <th>Name</th>
                      <th>Class</th>
                      <th>Marks</th>
                      <th>Action</th>
                  </tr>
              </thead>
              <tbody>
                  <% ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list"); %>
                  <% if (list != null && !list.isEmpty()) { %>
                      <% for (StudentBean s : list) { %>
                          <tr>
                              <td><%= s.getRno() %></td>
                              <td><%= s.getName() %></td>
                              <td><%= s.getStd() %></td>
                              <td><%= s.getMarks() %></td>
                              <td>
                                  <a href="editStudentServlet?rno=<%= s.getRno() %>" class="edit">Edit</a>
                                  <a href="deleteStudentServlet?rno=<%= s.getRno() %>" class="delete">Delete</a>
                              </td>
                          </tr>
                      <% } %>
                  <% } else { %>
                      <tr>
                          <td colspan="5" style="text-align: center; color: #7f8c8d;">No students available.</td>
                      </tr>
                  <% } %>
              </tbody>
          </table>
      </div>

      <div class="btn-container">
          <a href="registration.jsp" class="btn">Add New Student</a>
          <a href="home.jsp" class="btn">Back to Home</a>
      </div>
  </body>
  </html>
