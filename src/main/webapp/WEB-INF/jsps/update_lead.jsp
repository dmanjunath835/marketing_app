<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<h2>Create|Lead</h2>
<form action="updateLead" method="post">
<table>
<tr>
<td><input type="hidden" name="id" value="${lead.id}"/></td>
</tr>
<tr>
<td>First Name</td>
<td><input type="text" name="firstName" value="${lead.firstName}"/>
</td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" value="${lead.lastName}"/>
</td>
</tr>
<tr>
<td>Email Id</td>
<td><input type="email" name="email" value="${lead.email}"/>
</td>
</tr>
<tr>
<td>Mobile Number</td>
<td><input type="number" name="mobile" value="${lead.mobile}"/>
</td>
</tr>
<tr>
<td><input type="submit" value="update"/></td>
</tr>
</table>
</form>
 ${msg}

</body>
</html>