<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Shift_JIS">
<title>Regist Form</title>
<script type="text/javascript">

function checkPasswd() {	
	var form = document.register;

	if(document.getElementById("passwd").value != document.getElementById("passwd2").value) {
		alert('Password check');
	}

	form.action="regist.do";
	form.method="post";
	form.submit();
	
}
</script>
</head>
<body>
	<div align="center">
		<form name="register">
			<h3>Sign Up</h3>
			<h6>ID</h6>
			<input type="text" name="id" >
			<h6>Password</h6>
			<input type="password" id="passwd" name="passwd" >
			<h6>Password Verify</h6>
			<input type="password" id="passwd2" name="passwd2" >
			<h6>Name</h6>
			<input type="text" name="name" >
			<p></p>
			<input type="button" value="Submit" onclick="checkPasswd();">
		</form>
	</div>
</body>
</html>