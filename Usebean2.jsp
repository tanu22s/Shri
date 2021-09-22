<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="std" class="Firservlet.studentB"></jsp:useBean>
<jsp:setProperty property="*" name="std"/>
<jsp:getProperty property="id" name="std"/>
<jsp:getProperty property="Uname" name="std"/>
<jsp:getProperty property="pwd" name="std"/>
</body>
</html>