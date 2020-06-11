<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>index.jsp<br>
	<h1>기본 페이지 입니다!!!</h1>
	이름 : ${name }<br>
	<a href="/controller/login">로그인 페이지</a>	
	<!-- 컨트롤러로부터 경로를 받아오므로 옆에처럼 표현 -> /controller/login -->
	<!-- 전체경로(절대경로) 표현 -> http://localhost:9000/controller/login -->
	<a href="logout">로그아웃 페이지</a>
	
</body>
</html>