<html>

<head>
    <%@ page isELIgnored="false"%>
 </head>
<body>
<p>Welcome to stackroute : ${greeting} Have a good day</p>

<form action="/user" >
First name: <input type="text" name="firstName" value=""><br>
Password   : <input type="text" name="password" value=""><br>
<input type="submit" value="Submit">
</form>

<p>Click the "Submit" button and the form-data will be sent to a page on the server".</p>

</body>
</html>
