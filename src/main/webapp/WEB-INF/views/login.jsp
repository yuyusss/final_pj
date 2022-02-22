<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value='/css/login.css'/>" rel="stylesheet">
</head>

<body>
	<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
	<script src="<c:url value='/js/login.js'/>"></script>
	<div id="main">
		<div id="content">
			<div class="loginSection">
				<form method="post" id = "loginForm">
						<div id="logintitle_text">
						<h3 class="logintitle">로그인</h3></div><br>
						<input type="text" id="id" name="id" size="20" placeholder="아이디를 입력해주세요."><br/>
						<input type="password" id="pw" name="pw" size="20" placeholder="비밀번호를 입력해주세요."><br/>
	
						<input type="submit" class="loginButton" value="로그인">


						<%-- 회원가입 onclick 만들어야함 --%>
						<button class="SingupButton">
							<span class="text_type">회원가입</span>
						</button><br/>
					
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
</body>

</html>