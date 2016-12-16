<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
<title>Register</title>
</head>
<body>


	<div class="outer">
		<div class="middle">
			<div class="inner">

				<form:form action="register" modelAttribute="user" method="POST">
					<h1>Sign up</h1>
					<p>
						Your username
						<form:input path="username" id="username" required="required"
							type="text" placeholder="makoa" />
						<c:if test="${not empty usernameError}">
							<c:out value="${usernameError}" />
						</c:if>
					</p>
					<p>
						Your email
						<form:input path="email" id="email" required="required"
							type="email" placeholder="makoa@mail.com" />
						<c:if test="${not empty emailError}">
							<c:out value="${emailError}" />
						</c:if>
					</p>
					<p>
						Your password
						<form:input path="password" id="password" required="required"
							type="password" placeholder="eg. X8df!90EO" />
						<c:if test="${not empty passwordError}">
							<c:out value="${passwordError}" />
						</c:if>
					</p>
					<p>
						Please confirm your password
						<form:input path="confirmedPassword" id="confirmedPassword"
							required="required" type="password" placeholder="eg. X8df!90EO" />
					</p>
					<p>
						<input type="submit" value="Sign up" />
					</p>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					<p>
						Already a member ? <a href="login" class="to_register"> Go and
							log in </a>
					</p>
				</form:form>



			</div>
		</div>
	</div>


</body>
</html>