<!DOCTYPE html>
<%@page import="com.crudappgenahm23.bean.StudentBean"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 20px 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        h3 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        table {
            width: 100%;
        }

        td {
            padding: 10px;
        }

        input[type="text"], input[type="submit"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            font-weight: bold;
            cursor: pointer;
            border: none;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
    
<%--     <% --%>
//     		if((session == null)  || (session.getAttribute("userName")==null))
//     		{
//     			response.sendRedirect("login.jsp");
//     		}
<%--     %> --%>
    
    	<%
    		StudentBean s = (StudentBean)request.getAttribute("sbean");
    		String userName = (String)session.getAttribute("userName");
    	%>
        <h3>Student Registration Page</h3>
        
        
        Welcome, <%=userName%>       
        
        <form action="insertStudentServlet" method="post">
            <table>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="${sbean.name}" /></td>
					<td>${nameErrMsg}</td>
                </tr>
                <tr>
                    <td>Class</td>
                    <td><input type="text" name="std" value="${sbean.std}" /></td>
                    <td>${stdErrMsg}</td>
                </tr>
                <tr>
                    <td>Marks</td>
                    <td><input type="text" name="marks" value="${sbean.marks}"  /></td>
                    <td>${marksErrMsg}</td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
