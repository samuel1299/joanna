<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"></h1>
<form:form  action="edit" method="POST" modelAttribute="signup">
<table align="center">
	
	<tr>
	<td>Password</td>
	<td><form:input path="password" type="password"/></td>
	</tr>

	<tr>
	<td><input type="submit" value="Save"></td>
	
	</tr>
	
		

</table>
</form:form>
</body>
</html>