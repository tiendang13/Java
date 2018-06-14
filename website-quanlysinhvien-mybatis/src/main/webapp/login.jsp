<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<meta charset="utf-8">
	<link rel="stylesheet" href="styles.css">
</head>
<body>
	<form method=post action="login">
		<table>
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" placeholder="Type username here!"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password"placeholder="Type password here!"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                                        <tr>
                        <td colspan="2">Have no account? <a href="signup.jsp">Sign up here!</a></td>
                    </tr>
                </tbody>
            </table>
	</form>
</body>
</html>