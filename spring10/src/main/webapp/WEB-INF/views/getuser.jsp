<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
var cnt = 1;
	function getuser(){
		$("button").text("목록 더 보기")
		$.ajax({
			url:"user/"+ cnt++, 
			type:"GET",
			success: function(list){
				//$("#users").text(list)
				showUser(list)
			}, error: function() {
				console.log("문제 발생");
			}
		});
	}
	function showUser(list){
		/*
		let html ="<b>아이디 : </b>"+list[0].name+" 님<br>"
		html += "<b>나이 : </b>"+list[0].age+" 살<br>";
		html += "<b>아이디 : </b>"+list[1].name+" 님<br>"
		html += "<b>나이 : </b>"+list[1].age+" 살<br>";
		*/
		let html = ""
		$.each(list, function(index,item){
			html += "<b>아이디 : </b>"+item.name+" 님<br>"
			html += "<b>나이 : </b>"+item.age+" 살<hr>";
		})
		$("#users").html(html)
	}
</script>
</head>
<body>getuser.jsp<br>
	<span id="users"></span>
	<hr>
	<button onclick="getuser()">사용자 목록 보기</button>
</body>
</html>