<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

				<div id="register" class="animate form">
					<form action="<c:url value='/register' />" method="POST" autocomplete="on">
						<h1>Sign up</h1>
						<p>
							<label for="usernamesignup" class="uname" data-icon="u">Your
								username</label> <input id="usernamesignup" name="usernamesignup"
								required="required" type="text" placeholder="mysuperusername690" />
						</p>
						<p>
							<label for="emailsignup" class="youmail" data-icon="e">
								Your email</label> <input id="emailsignup" name="emailsignup"
								required="required" type="email"
								placeholder="mysupermail@mail.com" />
						</p>
						<p>
							<label for="passwordsignup" class="youpasswd" data-icon="p">Your
								password </label> <input id="passwordsignup" name="passwordsignup"
								required="required" type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p>
							<label for="passwordsignup_confirm" class="youpasswd"
								data-icon="p">Please confirm your password </label> <input
								id="passwordsignup_confirm" name="passwordsignup_confirm"
								required="required" type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p class="signin button">
							<input type="submit" value="Sign up" />
						</p>
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<p class="change_link">
							Already a member ? <a href="login" class="to_register"> Go
								and log in </a>
						</p>
					</form>
				</div>


			</div>
		</div>
	</div>


</body>
</html>