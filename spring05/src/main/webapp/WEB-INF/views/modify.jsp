<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>modify.jsp<br>
	<form action="modifySave" method="post">
		<input type="text" name="id" value="${list.id }"><br>
		<input type="text" name="name" value="${list.name }"><br>
		<input type="submit" value="수정">
		<a href="content">목록이동</a>
		<a href="delete?id=${list.id }">삭제</a>
	</form>

</body>
</html>