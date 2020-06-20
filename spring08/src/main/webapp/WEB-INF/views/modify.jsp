<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>modify.jsp<br>
	<form action="modifysave">
		번호 : <input type="text" name="num" value="${list.num }"> <br>
		이름 : <input type="text" name="name" value="${list.name }"><br>
		날짜 : <input type="date" name="mydate" value="${list.mydate }"><br>
		<input type="submit">
	</form>
	<button onclick="location.href='delete?num=${list.num }'">삭제</button>
	<!-- 
	<a href="delete?num=${list.num }">삭제</a>
	 -->

</body>
</html>