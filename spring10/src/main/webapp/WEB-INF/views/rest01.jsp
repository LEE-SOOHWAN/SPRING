<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	function ajaxGet(){
		$.ajax({
			url:"rest",
			type:"GET",
			success: function(data){
				$("#label").text(data)
			}, error: function(){ alert('문제 발생') }
		})
	}
</script>
<script>
	function ajaxPost(){
		$.ajax({
			url:"rest",
			type:"POST",
			success: function(data){
				$("#label").text(data)
			}, error: function(){ alert('문제 발생') }
		})
	}
</script>
<script>
	function ajaxPut(){
		$.ajax({
			url:"rest",
			type:"PUT",
			success: function(data){
				$("#label").text(data)
			}, error: function(){ alert('문제 발생') }
		})
	}
</script>
<script>
	function ajaxDel(){
		$.ajax({
			url:"rest",
			type:"DELETE",
			success: function(data){
				$("#label").text(data)
			}, error: function(){ alert('문제 발생') }
		})
	}
</script>
</head>
<body>rest01.jsp<br>
	<label id="label"></label>
	<hr>
	<button onclick="ajaxGet()">Get방식</button>
	<button onclick="ajaxPost()">Post방식</button>
	<button onclick="ajaxPut()">Put방식</button>
	<button onclick="ajaxDel()">Delete방식</button>
</body>
</html>