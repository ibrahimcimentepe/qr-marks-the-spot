<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Username Exist</title>
</head>
<body>
<FORM action="/test1/userServlet" method="post">
User Name: <INPUT type="text" name="username" size="35">USERNAME ALREADY EXIST PLEASE TRY ANOTHER ONE<BR>
Password: <INPUT type="password" name="pass" size="35"><BR>

<INPUT type="submit" name="Submit" value="Sign Up">
</FORM>
</body>
</html>