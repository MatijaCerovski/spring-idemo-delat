<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
<link
	href="<c:url value='/resources/bootstrap/css/bootstrap-iso.css' />"
	rel="stylesheet">
<title>Admin</title>
</head>
<body>

	<header>
		<div>
			<h1 class="title-global">
				<a href="#">Matija Cerovski</a>
			</h1>
			<nav>
				<ul>
					<li><a href="home">[Home]</a></li>
					<li><a href="about">[About]</a></li>
					<li><a href="admin">[Admin]</a></li>
					<c:choose>
						<c:when test="${not empty pageContext.request.userPrincipal}">
							<li><a href="logout">[Logout]</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="login">[Login]</a></li>
						</c:otherwise>

					</c:choose>

				</ul>
			</nav>
		</div>
	</header>


	<div class="container">
		<div class="bootstrap-iso">
			<h2>Admin Controls</h2>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Username</th>
						<th>Email</th>
						<th>Role</th>
						<th>Enabled</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>Anna</td>
					</tr>
					<tr>
						<td>2</td>
						<td>Debbie</td>
					</tr>
					<tr>
						<td>3</td>
						<td>John</td>
					</tr>
				</tbody>
			</table>
		</div>

	</div>



</body>
</html>