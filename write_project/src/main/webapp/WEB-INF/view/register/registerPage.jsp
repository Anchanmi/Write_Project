<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>회원 가입</title>
</head>
<body>
	<h2>회원 정보 입력</h2>
	<form:form action="registerComplete" method="get" modelAttribute="registerRequest">
		<p>
			<label><strong>닉네임</strong><br>
				<form:input path="nickname" />
			</label>
		</p>
		<p>
			<label><strong>아이디</strong><br>
				<form:input path="id" />
			</label>
		</p>
		<p>
			<label><strong>비밀번호</strong><br>
				<form:password path="password" />
			</label>
		</p>
		<p>
			<label><strong>비밀번호 확인</strong><br>
				<form:password path="confirmPassword" />
			</label>
		</p>
		<p>
			<label><strong>이름</strong><br>
				<form:input path="name" />
			</label>
		</p>
		<p>
			<label><strong>이메일</strong><br>
				<form:input path="email" />
			</label>
		</p>
		<input type="submit" value="가입">
	</form:form>
</body>
</html>