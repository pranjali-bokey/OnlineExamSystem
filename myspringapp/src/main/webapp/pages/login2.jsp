

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logindb</title>
</head>
 <style>
     body{
			      background-color: rgb(240, 249, 229);
      }
      h1{
	         font-family: emoji;
	        }
    </style>


<body>
<center><h1>
<h1 style="color:red">${message}</h1>

<form>
<h1><u>Register/Login Here</u></h1>

	
 <label for="username"> Username :</label><br>
		<input type="text" name="username" size="50" placeholder="Enter username" onfocus="change(this)">
<span style="color:blue;font-size: 40px"> ${message1}</span>  <br>
	  
	 <label for="username"> Password :</label><br>
		<input type="password" name="password" size="50" placeholder="Enter password" onfocus="change(this)">
<span style="color:blue;font-size:40px"> ${message2}</span>
<br>
	

 <h3><input type=submit value="login" formaction="validate" formmethod="get">
<input type=submit value="Register" formaction="showRegister" formmethod="get"></h3>
	

	
</form>


</center>
</body>
</html>


</center>
</body>
</html>