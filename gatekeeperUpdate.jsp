<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>GateKeeper Form</title>
<link
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">

<style>
html, body {
	min-height: 100%;
}

body, div, form, input, select, p {
	padding: 0;
	margin: 0;
	outline: none;
	font-family: Roboto, Arial, sans-serif;
	font-size: 14px;
	color: #666;
	line-height: 22px;
}

p{
font-weight: bold;
}

h1 {
	margin: 15px 0;
	font-weight: 400;
	text-align: center;
}

.testbox {
	display: flex;
	justify-content: center;
	align-items: center;
	height: inherit;
	padding: 3px;
}

form {
	width: 100%;
	padding: 20px;
	background: #fff;
	box-shadow: 0 2px 5px #ccc;
}

input, select, textarea {
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input:hover, select:hover, textarea:hover {
	outline: none;
	border: 1px solid #095484;
}

input {
	width: calc(100% - 10px);
	padding: 5px;
}

select {
	width: 100%;
	padding: 7px 0;
	background: transparent;
}

textarea {
	width: calc(100% - 6px);
}

.item {
	position: relative;
	margin: 10px 0;
}

input[type="date"]::-webkit-inner-spin-button {
	display: none;
}

.item i, input[type="date"]::-webkit-calendar-picker-indicator {
	position: absolute;
	font-size: 20px;
	color: #a9a9a9;
}

.item i {
	right: 2%;
	top: 30px;
	z-index: 1;
}

[type="date"]::-webkit-calendar-picker-indicator {
	right: 1%;
	z-index: 2;
	opacity: 0;
	cursor: pointer;
}

.btn-block {
	margin-top: 20px;
	text-align: center;
}

.button {
	width: 150px;
	padding: 10px;
	border: none;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	background-color: #095484;
	font-size: 16px;
	color: #fff;
	cursor: pointer;
}

.button:hover {
	background-color: #0666a3;
}

.container {
	width: 1024px;
	margin: 0px auto;
}
</style>
</head>
<body>
	<div class="container">
		<div class="testbox">
			<form action="/update">
				<h1>Tem Member Assignation</h1>
				<div class="item">
					<p>Ticket Id</p>
					<div>
						<input type="text" name="id" value="${ticket.id}" readonly />
					</div>
				</div>
				<div class="item">
					<p>User Id</p>
					<div>
						<input type="text" name="userId" value="${ticket.userId}" readonly/>
					</div>
				</div>
				<div class="item">
					<p>Contact No.</p>
					<div>
						<input type="text" name="contactNo" value="${ticket.contact} "readonly/>
					</div>
				</div>
				<div class="item">
					<p>Type of Ticket</p>
					<div>
						<input type="text" name="typeOfTicket" value="${ticket.type}" readonly/>
					</div>
				</div>
				<div class="item">
					<p>Description</p>
					<textarea rows="5" name="description" readonly>${ticket.description}</textarea>
				</div>
				<div class="item">
					<p>Work Location</p>
					<div>
						<input type="text" name="workLocation" value="${ticket.location}" readonly />
					</div>
				</div>
				
				<div class="item">
					<p>Priority</p>
					<div>
						<input type="text" name="priority" value="${ticket.priority}" readonly/>
					</div>
				</div>
				<div class="item">
					<p>Status</p>
					<div>
						<input type="text" name="status" value="${ticket.status}" readonly />
					</div>
				</div>


				<div class="item">
					<p>Assign to</p>
					<c:if test="${not empty team}">

						<select name="assign">
							<c:forEach var="listValue" items="${team}">


								<option>${listValue}</option>


							</c:forEach>

						</select>

					</c:if>
				</div>
				<div class="btn-block">
					<input type="submit" value="Confirm" class="button button:hover">
					</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>


<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/update">
		Id:<input type="text" name="id" value="${ticket.id}" /> Contact:<input
			type="text" name="contactNo" value="${ticket.contact}" />
		Description:<input type="text" name="description"
			value="${ticket.description}" /> Location:<input type="text"
			name="workLocation" value="${ticket.location}" /> Type of Ticket:<input
			type="text" name="typeOfTicket" value="${ticket.type}" /> User Id:<input
			type="text" name="userId" value="${ticket.userId}" /> Priority:<input
			type="text" name="priority" value="${ticket.priority}" /> Status:<input
			type="text" name="status" value="${ticket.status}" /> 
			
			Assign:
			<c:if test="${not empty team}">

									<select name="assign">
										<c:forEach var="listValue" items="${team}">


											<option >${listValue}</option>


										</c:forEach>

									</select>

								</c:if>
			 <input
			type="submit">


	</form>


</body>
</html> --%>