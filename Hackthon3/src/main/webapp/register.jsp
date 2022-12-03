<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>New User</h2>
    <form action="registerUser.jsp">
        <table>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="userName" id="userEmail"></td>
            </tr>
            <tr>
                <td>Email :</td>
                <td><input type="text" name="userEmail" id="userEmail"></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input type="password" name="userPass" id="userPass"></td>
            </tr>
            <tr>
                <td>PhoneNumber :</td>
                <td><input type="text" name="num" id="usernum"></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Sign Up">
                    <a href="login">Sign In</a>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>