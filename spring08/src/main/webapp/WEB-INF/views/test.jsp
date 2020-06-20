<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>test.jsp<br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="dto" items="${lists }">
	num: ${dto.num }<br>
	name: <a href="modify?num=${dto.num }">${dto.name }</a><br>
	mydate: ${dto.mydate }<hr>
</c:forEach>
<button onclick="location.href='inputuser'">등록</button>
<!-- 
<a href="inputuser">등록</a>
 -->
</body>
</html>