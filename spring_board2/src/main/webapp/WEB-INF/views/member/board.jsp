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
				<div><h1>게시판</h1></div>
				<div>
					<table border="1">
						<tr>
							<th>번호</th><th>이름</th><th>제목</th><th>날짜</th>
							<th>조회수</th><th>group</th><th>step</th><th>indent</th>
						</tr>
						<c:forEach items="${list2 }" var="dto2">
							<tr>
								<td>${dto2.id }</td><td>${dto2.name }</td>
								<td>
									<a href="modify?id=${dto2.id}">${dto2.title }</a>
								</td>
								<td>${dto2.savedate }</td><td>${dto2.hit }</td><td>${dto2.idgroup }</td>
								<td>${dto2.step }</td><td>${dto2.indent }</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="8">
								<a href="write">글작성</a>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
<jsp:include page="/WEB-INF/views/default/footer.jsp"/>
</body>
</html>