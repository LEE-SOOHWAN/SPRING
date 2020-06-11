<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>member.jsp<br>
	<h3>입력 결과</h3>
	이름: ${mb.name }<br>
	나이: ${mb.age }<br>
	주소: ${mb.addr }<br>
	<img width="100px" src="http://localhost:9000/mvc_ex04/resources/test.jpg"><br>
	<button onclick="location.href='login'">뒤로</button>
</body>
</html>