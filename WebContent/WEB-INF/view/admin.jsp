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
					<li><a href="${pageContext.request.contextPath}/home">[Home]</a></li>
					<li><a href="${pageContext.request.contextPath}/about">[About]</a></li>
					<li><a href="${pageContext.request.contextPath}/admin/1">[Admin]</a></li>
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
						<th>Username</th>
						<th>Email</th>
						<th>Role</th>
						<th>Enabled</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${users}" var="user">
						<tr>
							<td><c:out value="${user.username}"></c:out></td>
							<td><c:out value="${user.email}"></c:out></td>
							<td><c:forEach items="${user.userRole}" var="userRole">
									<c:out value="${userRole.role}"></c:out>
								</c:forEach></td>
							<td><c:out value="${user.enabled}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>

			</table>

			<c:forEach var="i" begin="1" end="${totalPages}" varStatus="loop">
				<a href="${pageContext.request.contextPath}/admin/${i}"
					class="btn btn-default"><c:out value="${i}" /></a>
			</c:forEach>

		</div>

	</div>



</body>
</html>