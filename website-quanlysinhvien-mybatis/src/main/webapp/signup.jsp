<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
        <form method="post" action="signup">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="firstName"/></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lastName"/></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email"/></td>
                    </tr>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" placeholder="Not blank!"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" placeholder="Not blank!"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="login.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>