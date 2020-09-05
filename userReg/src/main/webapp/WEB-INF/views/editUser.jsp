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

	<form action="updateUser" method="post">
		<pre>
		Id: <input type="text" name="id" value="${users.id }" readonly/> 
		First Name: <input type="text"name="firsteName" value="${users.firstName}" /> 
		Last Name: <input type="text" name="lastName" value="${users.lastName}">
		Gender:	Male<input type="radio" name="type" value="male" ${users.gender=='male'?'Checked':''}/> 
			Female<input type="radio" name="type" value="female" ${users.gender=='female'?'Checked':''}/> 
				<input type="submit" value="Save" />
		</pre>
	</form>
	${msg}
	<pre>
	<a href="displayUser">View All</a>
	</pre>
</body>
</html>