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
				<div><h1>회원정보</h1></div>
				<div>
					<table border="1">
						<tr>
							<th>아이디</th><th>비밀번호</th>
						</tr>
						<c:forEach items="${list }" var="dto">
							<tr>
								<td><a href="member_info2?id=${dto.id }&pw=${dto.pw}">${dto.id }</a></td>
								<td>${dto.pw }</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
	<jsp:include page="/WEB-INF/views/default/footer.jsp"/>

</body>
</html>