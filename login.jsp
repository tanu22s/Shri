<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
h2.a{

margin-top:10%;
margin-left: -17%;
background-color:black;
width:50cm;

}
table.b{
padding-top: 20;
margin-top: 4%;
margin-left: -6%;

background-color:aqua;
height: 6cm;
}
</style>
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
            
		
		<tr> <th>Firstname :</th>
		<td> <input type="text" name="fname" placeholder="enter first name here"></td>
		</tr>
		<tr> <th>Lastname  :</th>
		<td> <input type="text" name="lname" placeholder="enter last name here"></td>
		</tr>
		<tr> <th>Password:</th>
        <td> <input type="password" name ="pwd"><td> </tr>
        <tr> <th>Language:</th>
        <td> <input type="checkbox" name="lan" value= "English">English
             <input type="checkbox" name="lan" value= "Hindi">Hindi
             <input type="checkbox" name="lan" value= "French">French</td></tr>
             <tr><th><td><input type ="hidden" name= "jsessionid" value="<%=session.getId() %>" ></td></th></tr>
        <tr><td> <input type="submit" value ="login"></td> </tr>
        

</table>
</form>

</center>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>