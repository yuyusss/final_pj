<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="<c:url value='/css/signUp.css'/>" rel="stylesheet">
<script src="<c:url value='/js/signUp.js'/>"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</head>
<body>

		<div class="signUpTitle">
			<h2 class = "signUpText">회원가입</h2>
		</div>
		
		<div id="main">
			<div id="content">
					<div id="necessaryTxt_box">						
						<span class="necessary">*</span> 필수입력사항
					</div>
					<hr width="600px" size="3px" color="gray">
					
				<form id="form" name="memberForm" method="post">
					
					
					<table class="memberTable">
						<tbody>
							<tr class=first>
							<th>
								아이디
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="text" name="memberID" maxlength="20" placeholder="아이디는 6자 이상 입력해주세요.">
								<a class="IDdouble_check">중복확인</a>
							</td>
							</tr>
							
							<tr>
							<th>
								비밀번호
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="password" name="memberPW" maxlength="20" placeholder="비밀번호를 입력해주세요.">
							</td>
							</tr>
							
							<tr>
							<th>
								비밀번호 확인
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="password" name="memberPW_check" maxlength="20" placeholder="비밀번호를 한 번 더 입력해주세요.">
							</td>
							</tr>
							
							<tr>
							<th>
								성명
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="text" name="memberName" maxlength="20" placeholder="성명을 입력해주세요.">
							</td>
							</tr>
							
							<tr>
							<th>
								이메일
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="text" name="memberEmail" maxlength="25" placeholder="이메일을 입력해주세요.">
								<a class="Emaildouble_check">중복확인</a>
							</td>
							</tr>
							
							<tr>
							<th>
								휴대폰
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="text" name="memberPhone" maxlength="25" placeholder="휴대폰 번호를 입력해주세요.">
							</td>
							</tr>
							
							<tr>
							<th>
								주소
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="text" id="memberAddress" name="Address" placeholder="주소를 입력해주세요." readonly>
							</td>
							</tr>
							
							<tr>
							<th>
								상세주소
								<span class="necessary">
									*
								</span>
							</th>
							<td>
								<input type="text" name="memberAddress_Detail" placeholder="상세 주소를 입력해주세요.">
								
							</td>
							</tr>
														
							<tr>
							<th>
								생년월일
							</th>
							<td>
								<div id="birth">
									<input type="text" name="birthYear" placeholder="YEAR">
									<input type="text" name="birthMonth" placeholder="MONTH">
									<input type="text" name="birthDay" placeholder="DAY">
								</div>
							</td>
							</tr>
							
							<tr>
							<th>
								좋아하는 장르
							</th>
							<td>
								<%--장르 뭐 있는지 물어봐야함 --%>
								<div id="checkboxBox">
								<input type="checkbox" name="genre" value="">
									<label for="original">오리지널/내한공연</label>
								<input type="checkbox" name="genre" value="">
									<label for="license">라이센스</label><br>
								<input type="checkbox" name="genre" value="">
									<label for="creation">창작뮤지컬</label>
								<input type="checkbox" name="genre" value="">
									<label for="family">아동/가족</label>
								</div>
							</td>
							</tr>					
						</tbody>
					</table>
				</form>
				
					<br><br>
					<div class="submitBox">
					<button type="submit" id="submitBox">회원가입</button>
					</div>
			</div>
		</div>	
</body>
</html>