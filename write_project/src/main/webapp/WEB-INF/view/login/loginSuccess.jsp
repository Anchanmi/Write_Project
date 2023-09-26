<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
	<title>로그인</title>
</head>
<body>
	<p>
		<strong>로그인에 성공했습니다.</strong>
	</p>
	<p>
		<c:url value="/main" var="main" />
		<button onclick="location.href='${main}'">메인으로 돌아가기</button>
	</p>
</body>
</html>