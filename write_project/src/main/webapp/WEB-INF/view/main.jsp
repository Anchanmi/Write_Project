<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>메인</title>
</head>
<body>
	<p>글쓰는 페이지</p>
	<p>
		<c:url value="/register/registerPage" var="register" />
		<c:url value="/login/loginForm" var="login" />
		<button onclick="location.href='${login}'">로그인</button>
		<button onclick="location.href='${register}'">회원가입</button>
	</p>
</body>
</html>