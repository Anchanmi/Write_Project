<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>게시글 작성</title>
</head>
<body>
	<p>
		글 작성을 완료했습니다.
	</p>
	<p>
		<c:url value="/main" var="main" />
		<button onclick="location.href='${main}'">메인으로 돌아가기</button>
	</p>
</body>
</html>