<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value='/css/login.css'/>" rel="stylesheet">
</head>

<body>
	<div id="main">
		<div id="content">
			<div class="loginSection">
				<form action="login.jsp" method="post">
					
						<h3 class="logintitle">로그인</h3>
						<input type="text" name="id" size="20" placeholder="아이디를 입력해주세요."><br/>
						<input type="password" name="pw" size="20" placeholder="비밀번호를 입력해주세요."><br/>
	
						<button type="submit" class="loginButton">
							<span class="text_type">로그인</span>
						</button><br/>
						<%-- 회원가입 onclick 만들어야함 --%>
						<button class="SingupButton">
							<span class="text_type">회원가입</span>
						</button><br/>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>