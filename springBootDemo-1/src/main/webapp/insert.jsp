<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<form action="/insertAction" method="post">
	<table>
		<tr>
			<td>UserName</td>
			<td><input type="text" name="username" placeholder="Username"></td>
		
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="text" name="password" placeholder="Password"></td>
		
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Insert"></td>
		
		</tr>
	</table>
	</form>
	<a href="/view">View</a>
		
</div>
</body>
</html>