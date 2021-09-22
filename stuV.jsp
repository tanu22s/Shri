<%@page import="Firservlet.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<table border="1" cellspacing="0" >
<thead>
<tr><th>ID</th>
<th>RollNo</th>
<th>FirstName</th>
<th>LastName</th>
<th>Session</th>
</tr></thead>
<%

 ArrayList<StudentBean> student = (ArrayList)request.getAttribute("student");  %>

<% for(int Cnt=0;Cnt< student.size();Cnt++){%>
<% StudentBean bean =(StudentBean)student.get(Cnt);%>
<tr><td><%=bean.getID() %></td>
<td><%=bean.getRollNo() %></td>
<td><%=bean.getFirstName() %></td>
<td><%=bean.getLastName() %></td>
<td><%=bean.getSession() %></td></tr>
<%} %>


</table>
</body>
</html>