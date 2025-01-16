<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="com.crudappgenahm23.bean.StudentBean"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Student Details</title>
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
        <h3>Student Edit Registration Page</h3>
        <% 
            StudentBean s = (StudentBean)request.getAttribute("studentBean");
        %>
        <form action="updateStudentServlet" method="post">
            <table>
                <tr>
                    <td>Roll No</td>
                    <td><input type="text" name="rno" value="<%=s.getRno()%>" readonly="readonly"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" value="<%=s.getName()%>"/></td>
                </tr>
                <tr>
                    <td>Class</td>
                    <td><input type="text" name="std" value="<%=s.getStd()%>"/></td>
                </tr>
                <tr>
                    <td>Marks</td>
                    <td><input type="text" name="marks" value="<%=s.getMarks()%>"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"/></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
