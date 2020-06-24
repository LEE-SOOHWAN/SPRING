<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/default/header.jsp"/>
	<form action="save_write">
		<div align="center">
			<table border="1">
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" size="50"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" size="50"></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><textarea name="content" rows="10" cols="150"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="저장">&nbsp;
						<a href="board">목록보기</a></td>
				</tr>
			</table>
		</div>
	</form>
	<jsp:include page="/WEB-INF/views/default/footer.jsp"/>
</body>
</html>