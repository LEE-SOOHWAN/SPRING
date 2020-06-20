<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<div align="center" >
		<h1 style="color:burlywood; font-size:60px; font-family:Gabriola;">
			CARE &nbsp; LAB
		</h1>
	</div>
	<div align="right">
		<hr><br>
			<c:choose>
				<c:when test="${user eq null }">
					<a style="padding-right: 30px; font-size: 20px;" href="index">HOME</a>
					<a style="padding-right: 30px; font-size: 20px;" href="login">로그인</a>
				</c:when>
				<c:otherwise>
					<a style="padding-right: 30px; font-size: 20px;" href="index">HOME</a>
					<a style="padding-right: 30px; font-size: 20px;" href="logout">로그아웃</a>
					<a style="padding-right: 30px; font-size: 20px;" href="member_info">회원정보</a>
				</c:otherwise>
			</c:choose>
			<br><br>
		<hr>
	</div>
</body>
</html>