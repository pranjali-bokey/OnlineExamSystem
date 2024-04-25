

<html>

<head>

	<script>
	 
	        function change(input)
			{
		       		input.style.color="black";
		       		input.style.background="pink";
	        }
	        
	        
    </script>
    <style>
     body{
			      background-color: rgb(220, 229, 229);
      }
      h1{
	            font-family: verdana;
	        }
    </style>
   
	
</head>
<body>

<center><h1> <u><em>Register Page </em> </u></h1>
<p>
<form>
		  <label for="username"> Username :</label><br>
		<input type="text" name="username" size="50" placeholder="Enter username" onfocus="change(this)"><br><br>
		 <label for="username"> Password :</label><br>
		<input type="password" name="password" size="50" placeholder="Enter password" onfocus="change(this)"><br><br>
			  <label for="username"> MobileNo :</label><br>
		<input type="text" name="mobno" size="50" placeholder="Enter mobno" onfocus="change(this)"><br><br>
			  <label for="username">Email-id :</label><br>
		<input type="email" name="emailid" size="50" placeholder="Enter emailid" autofocus="change(this)"><br><br>
		
		
	<input type=submit value=Register formaction="saveToDb" formmethod=post>
		
		<br>
		 
		

</form>
</p>
</center>
</body>
</html>



		
	