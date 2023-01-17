<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create|Lead</h2>
<form action="saveData" method="post">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="firstName"/>
</td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/>
</td>
</tr>
<tr>
<td>Email Id</td>
<td><input type="email" name="email"/>
</td>
</tr>
<tr>
<td>Mobile Number</td>
<td><input type="number" name="mobile"/>
</td>
</tr>
<tr>
<td><input type="submit" value="save"/></td>
</tr>
</table>
</form>
   ${msg}
</body>
</html>