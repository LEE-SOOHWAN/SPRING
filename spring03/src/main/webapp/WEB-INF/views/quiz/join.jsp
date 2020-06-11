<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>join.jsp<br>
	<h3>회원 정보 입력</h3>	
	<form action="member">
		이름:	 <input type="text" name="name"><br>
		나이: <input type="text" name="age"><br>
		주소: <input type="text" name="addr"><br>
		<input type="submit" value="전송">
	</form>
	<img width="100px" src="http://localhost:9000/mvc_ex04/resources/test.jpg"><br>
	<button onclick="location.href='login'">뒤로</button>
</body>
</html>