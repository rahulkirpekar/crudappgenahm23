<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Login Page</title>
</head>
<body>
	<jsp:include page="header.jsp" />  
	<form action="loginByCoockieServlet" method="post">
	
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="userName"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"/></td>
			</tr>
		</table>
	</form>
		<jsp:include page="footer.jsp" /> 
</body>
</html>
