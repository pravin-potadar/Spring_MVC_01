<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style type="text/css">


table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>





</head>
<body>




	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Salary</th>

		</tr>

	<c:forEach items="${emplist}" var="emp">
		<tr>
			<td>${emp.id }</td>
			<td>${emp.name }</td>
			<td>${emp.sal }</td>
		</tr>
	</c:forEach>	
	
			

	</table>




</body>
</html>