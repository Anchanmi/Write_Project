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
			<label><strong>아이디 : 
				<form:input path="id" />
				<form:errors path="id" />
		</p>
		<p>
			<label><strong>비밀번호 : 
				<form:password path="password" />
				<form:errors path="password" />
		</p>
		<input type="submit" value="로그인">
	</form:form>
</body>
</html>