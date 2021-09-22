<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
table.c{
padding:10;
margin-top: -10%;
margin-left:30%;
margin-right:-6%;
height: 5%;
width:120mm;

}
</style>
</head>
<body align="left">
<table align="left" class="c" cellspacing=20%>
<tr colspace ="2"><hr>
<td><%

  
String fname=(String)session.getAttribute("fname");
%>
<% out.println("Hi "+ fname);%></td>
<td><h5 align="left"> <a href="LoginView.jsp"><font color="deep pink">Home</font></a></h5></td> <br>
<td><h5 align="left"> <a href="LoginView.jsp"><font color="deep pink">My profile</font></a></h5></td> <br>
<td><h5 align="left"> <a href="LoginView.jsp"><font color="deep pink">Result</font></a></h5></td> <br>
<td><h5 align="left"> <a href="LoginView.jsp"><font color="deep pink">Performance</font></a></h5></td>
<td><h5 align="left"> <a href="logout.jsp"><font color="deep pink">logout</font></a></h5></td>

</tr>



</table>
</body>
</html>