<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="com.crudappgenahm23.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Student List Page</title>
</head>
	<body>
	
		<h2> Student Listing Page</h2>
		
		<%
			ArrayList<StudentBean> list = (ArrayList<StudentBean>)request.getAttribute("list");	
		%>
	<table border="1">
		<tr>
			<td>Rno</td>
			<td>Name</td>
			<td>Std</td>
			<td>Marks</td>
			<td>ACTION</td>
			
		</tr>
		<%
			for(int i = 0 ; i < list.size();i++)
			{
				StudentBean s = list.get(i);
		%>	
				<tr>
					<td><%=s.getRno() %></td>
					<td><%=s.getName() %></td>
					<td><%=s.getStd() %></td>
					<td><%=s.getMarks() %></td>
					<td>EDIT | <a href="#">DELETE</a> </td>
					
				</tr>
		<%  } %>
	</table>
	</body>
</html>
