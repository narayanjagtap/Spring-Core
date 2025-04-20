<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<h1>Registration form...</h1>
	
<form action="ureg" method="get">
Enter Name:<br>
<input type="text" name="uname"><br><br>
Enter Email:<br>
<input type="email" name="uemail"><br><br>
Enter Password:<br>

<input type="password" name="upass"><br><br>
Enter Mob No.:<br>
<input type="text" name="umobno"><br><br>
<input type="submit" value="Register">&nbsp;&nbsp;
<input type="reset" value="Clear"><br><br>
</form>
	Already Have An Account<a href="login">Login Here:</a>
</body>
</html>