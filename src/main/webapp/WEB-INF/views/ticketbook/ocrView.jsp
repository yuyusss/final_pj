<%@ page language="java" contentType="text/html; charset=UTF-8"
 	  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>OCR</title>
		<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
		<script src="<c:url value='/js/ocr.js'/>"></script>		
		
	</head>
	<body>
	<div id = "wrap">
	<!-- 탑 -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		<!--  파일 업로드 -->
		<h3>촬영한 티켓사진 업로드</h3>
		<form id="ocrForm" enctype="multipart/form-data">
			사진 : <input type="file" id="uploadFile" name="uploadFile"> 
			<input type="submit" value="결과 확인">		
		</form>
		<br><br>
		
		<!-- 결과 출력 (텍스트) -->
		<h3 id="resultH3"></h3>
		<div id="resultDiv"></div>
		<br><br>
		
		<!-- 이미지 출력 (새로운 방법으로 알려줄 것임)  -->
		<div id="image"></div>
		
		<br><br>
		<a href="/ticketDetailView">티켓리스트로 이동</a>
		
	<!-- 바텀 -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
	</div>
	</body>
	
</html>