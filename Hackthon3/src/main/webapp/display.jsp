<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Product</title>
</head>

<body>
	<c:forEach var="prod" items="${sessionScope.product.fetchProducts()}">
	<h5>
		${prod.id}
		${prod.productName}
		${prod.price}
		belongs to Category Name : ${prod.productCategory.categoryName} 
	</h5>
	<br/>
	</c:forEach>
	
</body>
</html>