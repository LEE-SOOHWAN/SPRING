<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>cookie.jsp<br>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	cookie페이지 입니다!!!
	
	<c:choose>
		<c:when test="${cookie.myCookie.value == null }">
			<script>
				window.open("popup", "", "width=200, height=100");
			</script>
		</c:when>
	</c:choose>
	
</body>
</html>