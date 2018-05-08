<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta  charset="UTF-8">
	<link rel="stylesheet" href="loginStyles.css">
	<title>Login</title>
</head>
<body>
	<div id="container">
		<div class = "login-form">
			<div class="title">
				<h3>Login</h3>
			</div>
			<form method="POST" action="${request.contextPath}/spring-login/loginCheck" commandName="user">
				<table border="0">
					<tr>
						<td>
							<label>User name:</label>
						</td>
						<td>
							<input type="text" id="username" name="username" class="form-control">					
						</td>
					</tr>
					<tr>
						<td>
							<label>Password:</label>
						</td>
						<td>
							<input type="password" id="password" name="password" class="form-control">
						</td>
					</tr>
					</table>
					<div class="login-button">
						<button id="login-button" type="submit" class="form-control">Login</button>
					</div>
			</form>
		</div>
	</div>
</body>
</html>