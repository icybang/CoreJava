<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%--session.getAttribute("user") -- null -- session.setAttribute("user",new UserBeam()); --%>
<jsp:useBean id="user" class="beans.UserBean" scope="session" />
<jsp:setProperty property="*" name="user" />
<%-- WC tries to call ALL MATCHING setters --%>
<body>
	<%--invoke B.L method of Java bean --%>
<%-- <h5>Status : 	${sessionScope.user.validateUser()} </h5> --%>
<%--forward the clnt to the next page in the SAME request --%>
<%--RD rd=request.getRD(session.getAttribute("user").validateUser().concat(".jsp"); rd.forward(request,resp); --%>
<jsp:forward page="${sessionScope.user.validateUser()}.jsp"/>
</body>
</html>