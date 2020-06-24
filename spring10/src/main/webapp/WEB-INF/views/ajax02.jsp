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
		var n = document.getElementById("name").value;
		var a = $("#age").val();
		var form = { name:n , age:a }
		
		$.ajax({
			url: "ajax_result02",
			type: "GET",
			data: form,
			success: function(data){ 
				$("#result").text(data);
				console.log("성공")	
			},
			error: function(){	console.log("실패")	}
		})
	}
</script>
</head>
<body>ajax02.jsp<br>
	이름 : <input type="text" id="name"><br>
	나이 : <input type="text" id="age"><br>
	<button onclick="test()">클릭</button><br>
	<label id="result"></label>
</body>
</html>