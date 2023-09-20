<%@ page contentType = "text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>회원 가입</title>
</head>
<body>
	<h2>회원 정보 입력</h2>
	<form action="registerComplete">
		<p>
			<label><h4>닉네임</h4><br>
				<input type="text" name="nickname" id="nickname">
			</label>
		</p>
		<p>
			<label><h4>아이디</h4><br>
				<input type="text" name="id" id="id">
			</label>
		</p>
		<p>
			<label><h4>비밀번호</h4><br>
				<input type="password" name="password" id="password">
			</label>
		</p>
		<p>
			<label><h4>비밀번호 확인</h4><br>
				<input type="password" name="confirmPassword" id="confirmPassword">
			</label>
		</p>
		<p>
			<label><h4>이름</h4><br>
				<input type="text" name="name" id="name">
			</label>
		</p>
		<p>
			<label><h4>이메일</h4><br>
				<input type="text" name="email" id="email">
			</label>
		</p>
		<input type="submit" value="가입">
</body>
</html>