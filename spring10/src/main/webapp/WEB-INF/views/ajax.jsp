<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	function test(){
		$.ajax({
			url: "ajax_result",
			type: "GET",
			success: function(data){ 
				$("#result").text(data);
				console.log("성공")	
			},
			error: function(){	console.log("실패")	}
		})
	}
</script>
</head>
<body>
	<h1>일</h1>	<h1>이</h1>	<h1>삼</h1>
	<h1>사</h1>	<h1>오</h1>	<h1>육</h1>
	<h1>칠</h1>	<h1>팔</h1>
	<button onclick="test()">클릭</button>
	<label id="result">0</label>
</body>
</html>
