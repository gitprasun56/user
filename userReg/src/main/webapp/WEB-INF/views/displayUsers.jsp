<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Users</h2>
<table>
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Gender</th>
<th>Email</th>
<th>Operation</th>
</tr>
<c:forEach items="${users}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.firstName}</td>
<td>${user.lastName}</td>
<td>${user.gender}</td>
<td>${user.email}</td>
<td><a href="editUser?id=${user.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add User</a>
</body>
</html>