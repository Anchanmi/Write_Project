<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>회원가입</title>
</head>
<body>
	<p><strong>${registerRequest.nickname}님</strong>
		회원가입을 완료했습니다.
	</p>
	<p>
		<c:url value="/main" var="main" />
		<button>로그인</button>
		<button onclick="location.href='${main}'">메인</button>
	</p>
</body>
</html>