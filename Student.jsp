<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<center>
<H2>Student Management</H2>
<table>
<form method="get" action="StudCtrl" >

<tr><th>RollNo</th><td><input type="text" name="Rn"></td></tr>
<tr><th>FirstName</th><td><input type="text" name="Fn"></td></tr>
<tr><th>LastName</th><td><input type="text" name="Ln"></td></tr>
<tr><th>Session</th><td><input type="hidden" name="session" value="<%=session.getId()%>"></td></tr>
<tr>

<td><input type="submit" value="Delete" name="Operation"></td>
<td><input type="submit" value="Modify" name="Operation"></td></tr>
<tr><td><input type="submit" value="getRollNo" name="Operation"></td>
<td><input type="submit" value="Search" name="Operation"></td>
<td align="right"><input type="submit" value="Add" name="Operation"></td></tr>

</form>

</table>
</center>
</body>
</html>