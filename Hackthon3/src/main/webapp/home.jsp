<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
</head>
<jsp:useBean id="user" class="beans.UserBean" scope="session"/>
<body>

<h5><a href="login.jsp" >LOGIN</a></h5>
<h5><a href="register.jsp" >REGISTER</a></h5>
</body>
</html>