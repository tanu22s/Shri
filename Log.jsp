<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<center>

<form action="Newshri" method="get">
                    <h2 align="center" class="a"> <font color="silver">Login Form </font></h2>

            <jsp:include page="header.jsp"></jsp:include>

<table align="center" class="b">

            
            <% String error = (String)request.getAttribute("error");
            if(error !=null){
            %>
            
           <center><font color="Red"><h1><%=error %></h1></font> </center> 
           
            <% } %>
            
		
		<tr> <th>Username :</th>
		<td> <input type="text" name="Username" placeholder="enter first name here"></td>
		</tr>
	
		<tr> <th>Password:</th>
        <td> <input type="password" name ="pwd"><td> </tr>
        
        <tr><th><td><input type ="hidden" name= "jsessionid" value="<%=session.getId() %>" ></td></th></tr>
        <tr><td> <input type="submit" value ="login"></td> </tr>
        

</table>
</form>

</center>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>