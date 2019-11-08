<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">


<style>
.container {
	width: 1024px;
	margin: 0px auto;
	margin-top: 30px;
	margin-bottom: 10px;
}

table {
	border-color: white;
	border-collapse: collapse;
	width: 800px;
	margin: 0 auto;
}

th, td {
	text-align: center;
	padding: 8px;
}

tr:nth-child(odd) {
	background-color: #f2f2f2;
}

th {
	background-color: darkorchid;
}

h3{
   margin-top: 15px;
   margin-bottom: 15px;
}
.btn-block{
	margin-top: 20px;
	text-align: center;
	float: right;
	color: grey;
}
</style>
</head>
<body>
	<div class="container">
		<h3 class="container">New Compliants</h3>
		<table border="1" bordercolor="moccasin" class="table">
			<thead>
				<tr style="background-color: lightcoral; color: white;">
					<th>Ticket ID</th>
					<th>UserId</th>
					<th>Contact Number</th>
					<th>Work Location</th>
					<th>Type Of Ticket</th>
					<th>Description</th>
					<th>Priority</th>
					<th>Status</th>
					<th>Assigned to</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty tickets}">
					<c:forEach var="listValue" items="${tickets}">
						<tr>
							<td><a href="/viewTicket/${listValue.id}">${listValue.id}</a></td>
							<td>${listValue.userId}</td>
							<td>${listValue.contact}</td>
							<td>${listValue.location}</td>
							<td>${listValue.type}</td>
							<td>${listValue.description}</td>
							<td>${listValue.priority}</td>
							<td>${listValue.status}</td>
							<td>${listValue.assign }</td>
						</tr>
					</c:forEach>

				</c:if>
			</tbody>

		</table>
		<p class="center">
			If you have any complaint click <a href="/create">here</a>
		</p>
		<div class="btn-block">
		<button type="submit">Logout</button>
		</div>
	</div>
</body>
</html>