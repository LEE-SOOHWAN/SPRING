<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>login.jsp<br>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<script>
		if ("${cook}" == "") {
			window.open("../popup01", "", "width=300,height=200,top=500,left=500");
		}
	</script>
	<c:choose>
		<c:when test="${loginUser != null}">
			${loginUser }님 로그인에 성공하셨습니다<br>
			<a href="main">메인 페이지</a>
		</c:when>
		<c:otherwise>
			<form method="post" action="chkuser">
				<input type="text" name="id"><br>
				<input type="text" name="pwd"><br>
				<input type="submit" value="submit"><br>
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>