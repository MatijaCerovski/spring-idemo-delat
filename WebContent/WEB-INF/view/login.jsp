<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet">
<title>Welcome</title>
</head>
<body onload='document.loginForm.username.focus();'>

	<div class="outer">
		<div class="middle">
			<div class="inner">

				<div id="login-box">

					<h3>Login with Username and Password</h3>
					<h3>Or <a href="register">Register</a></h3>

					<c:if test="${not empty error}">
						<div class="error">${error}</div>
					</c:if>
					<c:if test="${not empty msg}">
						<div class="msg">${msg}</div>
					</c:if>

					<form name='loginForm' action="<c:url value='/login' />"
						method='POST'>

						<table>
							<tr>
								<td>User:</td>
								<td><input type='text' name='username'></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><input type='password' name='password' /></td>
							</tr>
							<tr>
								<td colspan='2'><input name="submit" type="submit"
									value="submit" /></td>
							</tr>
						</table>

						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />

					</form>
				</div>

			</div>
		</div>
	</div>


</body>
</html>