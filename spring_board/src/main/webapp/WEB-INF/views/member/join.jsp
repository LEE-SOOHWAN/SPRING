<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript">
		function check(){
			var id = document.getElementById("ID").value;
			var pw = document.getElementById("PW").value;
			if(id == ""){
				alert("아이디는 필수 입력사항 입니다");
			}else if(pw == ""){
				alert("비밀번호는 필수 입력사항 입니다");
			}else{
				send.submit()
			}
		}
	</script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/default/header.jsp"/>
	<h1 align="center">회원가입 페이지 입니다</h1>
	<form id="send" action="joinService" method="post">
		<div style="margin-left: 850px">
			<input type="text" name="id" id="ID" placeholder="아이디"><br>
			<input type="text" name="pw" id="PW" placeholder="비밀번호"><br>
			<input type="button" value="회원가입" onclick="check()" style="width: 175px; height: 30px;">
		</div>
	</form>
	<br><br>
	<jsp:include page="/WEB-INF/views/default/footer.jsp"/>

</body>
</html>