<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<jsp:include page="/WEB-INF/views/default/header.jsp"/>
	<c:choose>
		<c:when test="${user eq null}">
			<script type="text/javascript">
				location.href = "login";
				alert("로그인을 해주세요");
			</script>
		</c:when>
		<c:otherwise>
			<div align="center">
				<div><h1>${param.id }정보</h1></div>
				<div>
					<table border="1">
						<tr>
							<th width="200px;">아이디</th>
							<th width="200px;">${param.id }</th>
						</tr>
						<tr>
							<th>비밀번호</th>
							<th>${param.pw }</th>
						</tr>
					</table>
				</div>
				<input type="button" value="뒤로" onclick="location.href='member_info'">
			</div>
		</c:otherwise>
	</c:choose>
	<jsp:include page="/WEB-INF/views/default/footer.jsp"/>
</body>
</html>