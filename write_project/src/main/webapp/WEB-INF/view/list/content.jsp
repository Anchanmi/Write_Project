<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>게시글</title>
</head>
<body>
	<p>
		<strong>제목</strong>	${board.subject}		| 
		<strong>작성자</strong> | ${board.nickname}
	</p>
	<p>
		<strong>내용</strong>	${board.content}
	</p>
	<p>
		<strong>작성 날짜</strong> | 
		<tf:formatDateTime value="${board.write_time}" pattern="yyyy-MM-dd HH:mm" /> |
		<strong>조회수</strong> | ${board.views + 1} |
	</p>
	<c:url value="/main" var="main" />
	<button onclick="location.href='${main}'">메인으로 돌아가기</button>
</body>
</html>