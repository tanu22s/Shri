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

<form action="Usebean2.jsp" method="get">
                    <h2 align="center" class="a"> <font color="Grey">Login Form </font></h2>

          
<table align="center" class="b">
        <tr> <th>ID :</th>
		<td> <input type="text" name="id" placeholder="enter ID"></td>
		</tr> 
		
		<tr> <th>Username :</th>
		<td> <input type="text" name="Uname" placeholder="enter your name here"></td>
		</tr>
		
		<tr> <th>Password:</th>
        <td> <input type="password" name ="pwd"><td> </tr>
        
        <tr><td> <input type="submit" value ="login"></td> </tr>
        

</table>
</form>

</center>
</body>
</html>