<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname= request.getParameter("fname");
String lname= request.getParameter("lname");
String pwd= request.getParameter("pwd");
String gmail= request.getParameter("gmail");
String mob= request.getParameter("mob");
String age= request.getParameter("age");
String gen= request.getParameter("gen");
String add= request.getParameter("add");
String dob= request.getParameter("dob");


%>
<%=fname %>
<%=lname %>
<%=pwd %>
<%=gmail %>
<%=mob %>
<%=age %>
<%=gen %><%=add %><%=dob %>

</body>
</html>