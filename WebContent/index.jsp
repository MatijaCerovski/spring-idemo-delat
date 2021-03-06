<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
<title>Welcome</title>
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
							<li><a href="${pageContext.request.contextPath}/logout">[Logout]</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="${pageContext.request.contextPath}/login">[Login]</a></li>
						</c:otherwise>

					</c:choose>

				</ul>
			</nav>
		</div>
	</header>



	Welcome Stranger! ${pageContext.request.userPrincipal.name}

</body>
</html>