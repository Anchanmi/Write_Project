<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>메인</title>
</head>
<body>
	<p><strong>Write</strong> 페이지</p>
	<c:if test="${empty authInfo}">
	<p>
		<c:url value="/register/registerPage" var="register" />
		<c:url value="/login" var="login" />
		<button onclick="location.href='${login}'">로그인</button>
		<button onclick="location.href='${register}'">회원가입</button>
	</p>
	</c:if>

	<c:if test="${!empty authInfo}">
		<c:url value="/logout" var="logout" />
		<p>${authInfo.nickname}님		
			<button>마이페이지</button>
			<button onclick="location.href='${logout}'">로그아웃</button>
		</p>
		<p>
			<button>글쓰기</button>
		</p>
	</c:if>
</body>
</html>