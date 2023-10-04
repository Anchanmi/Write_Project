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
			<c:url value="/board/boardForm" var="board" />
			<button onclick="location.href='${board}'">글쓰기</button>
		</p>
	</c:if>

	<table border="1">
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>조회수</th>
		<th>작성 날짜</th>

		<c:if test="${!empty boardList}">
			<c:forEach var="list" items="${boardList}">
				<tr>
					<td>${list.id}</td>
					<td>${list.subject}</td>
					<td>${list.nickname}</td>
					<td>${list.views}</td>
					<td>${list.write_time}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>