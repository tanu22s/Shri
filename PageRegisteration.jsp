<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here

</title> 
<style >
table.div{
background-color:teal;  background-size: 100%;
height: 500px;
width: 950px
top: -50%;}

h1{
    margin: 0;
    padding: 0 0 20px;
    text-align: center;
    font-size: 30px;
    position:absolute;
    top: 8%;
    Right: 51%;
    left: calc(50% -20px);
}

table{
 margin: 15;
    padding: 0 0 20px;
    text-align: center;
    font-size: 18px;
    font-family:sans-serif;
    position:absolute;
    top: 35%;
    Right:45%;
    height:15cm;
    width:8cm;
    
}

</style>
</head>
<body bgcolor="lightblue">

	<center>
	<jsp:include page="header.jsp"></jsp:include>
	

		<h1 > Registration</h1>
		
		<% String error = (String)request.getAttribute("error");
            if(error !=null){
            %>
            
           <center><font color="Red"><h1><%=error %></h1></font> </center> 
           
            <% } %>
		<br>
		<form action="RegCtrl" method="get"><br> 
		<table class="div">
		
		<tr> <th>Firstname :</th>
		<td> <input type="text" name="username" placeholder="enter first name here"></td>
		</tr>
		<tr> <th>Lastname  :</th>
		<td> <input type="text" name="lname" placeholder="enter last name here"></td>
		</tr>
		<tr> <th>Password :</th>
		<td>  <input type="password" name="pwd" placeholder="enter password here"></td>
		</tr>
		<tr> <th>Email-Id  :</th>
		<td> <input type="text" name="gmail"  placeholder=" enter email id here"></td>
		</tr>
		<tr> <th>Mobile no:</th>
		<td> <input type="text" name="mob" placeholder=" enter number here"></td>
		</tr>
		<tr> <th>Age:</th>
		<td> <input type="number" name="age" placeholder=" enter age"></td>
		</tr>
		<tr> <th>Gender:</th>
		<td>  <select><option>Female</option><option>Male</option></select></td>
		
		<tr> <th>Address:</th>
		<td> <input type="text" name="add" placeholder=" enter  address"></td>
		</tr>
		<tr><td align="right" colspan="2"> <input	type="submit" value= "SUBMIT"></td></tr>
			     
</table>
		</form>
		
	</center>
	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>