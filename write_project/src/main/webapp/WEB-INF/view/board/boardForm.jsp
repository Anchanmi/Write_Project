<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<title>게시글 작성</title>
</head>
<body>
	<h2>게시글 작성</h2>
	<form:form action="boardSuccess" modelAttribute="boardRequest">
		<p>
			<label>
				<strong>글 제목 : </strong>
				<form:input path="subject" />
				<form:errors path="subject" />
			</label>
		</p>
		<p>
			<label>
				<strong>글 내용 : </strong>
				<form:textarea path="content" cols="20" rows="10"/>
				<form:errors path="content" />
			</label>
		</p>
		<input type="submit" value="글 작성">
	</form:form>
</body>
</html>