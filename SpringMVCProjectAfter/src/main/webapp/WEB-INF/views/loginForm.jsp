<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>Login Form...</h1>
	
	<form action = "ulogin" method="post">
    Enter The Email:<br>
    <input type="email" name="uemail"><br><br>
    Enter The Password:<br>
    <input type="password" name="upass"><br><br>
    <input type="submit" value="Login">&nbsp;&nbsp;
    <input type="reset" value="Clear"><br><br>
	</form>
	
	Don't have an account <a href="reg">Register here</a>
</body>
</html>