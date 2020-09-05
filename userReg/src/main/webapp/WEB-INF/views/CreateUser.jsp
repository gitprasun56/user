<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="saveUser" method="post">
		<pre>
		Id: <input type="text" name="id" /> 
		First Name: <input type="text"name="firstName" /> 
		Last Name: <input type="text" name="lastName">
		Gender:	Male<input type="radio" name="gender" value="male"/> 
			Female<input type="radio" name="gender" value="Female"/> 
			Email: <input type="text" name="email">
			Password: <input type="password" name="password">
				<input type="submit" value="Save" />
		</pre>
	</form>
	${msg}
	<pre>
	<a href="displayUser">View All</a>
	</pre>
</body>
</html>