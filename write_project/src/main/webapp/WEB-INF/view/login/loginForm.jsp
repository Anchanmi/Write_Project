<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
	<title>로그인</title>
</head>
<body>
	<form:form modelAttribute="loginCommand">
		<form:errors />
		<p>
			<label><strong>아이디</strong> : 
				<form:input path="id" />
				<form:errors path="id" />
			</label>
		</p>
		<p>
			<label><strong>비밀번호</strong> : 
				<form:password path="password" />
				<form:errors path="password" />
			</label>
		</p>
		<p>
			<label>아이디 저장 
				<form:checkbox path="rememberId" />
			</label>
		</p>
		<input type="submit" value="로그인">
	</form:form>
</body>
</html>