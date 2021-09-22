<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="WelcomeCtrl.do" method="get">
<jsp:include page="header.jsp"></jsp:include>
<center>
<h2><font color="GREEN" > Welcome to World of stars</font></h2>
<h5 align="left"> <a href="logout.jsp"><font color="deep pink">logout</font></a></h5>
</center>
<jsp:include page="footer.jsp"></jsp:include>
</form>
</body>
</html>