<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/hall2.css'/>" rel="stylesheet" type="text/css">
		<title>티켓 등록</title>
		
		<!-- include libraries(jQuery, bootstrap) -->   <!--  ********* -->
		<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		
		<!-- include summernote css/js -->
		<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
		
	</head>
	
	<body>
		<div id = "wrap">
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
	
		<form method = "post" action="/ticketbook/insertticket">
		
		
		<!-- sessionScope._____ 로그인 처리한 팀원에게 세션에 멤버 아이디 저장해주세요. 어떤 이름으로 저장했는지 알려주세요.-->
	 		아이디 : <input type="text" id="memID" name="memID" value="pjh" ><br>
			공연 제목 : <input type="text" id="subject" name="subject" ><br>
			공연 날짜 : <input type="text" id="date" name="date" ><br>
			공연 시간 : <input type="text" id="time" name="time" ><br>
			장소 : <input type="text" id="thater" name="theater" ><br>
			좌석 : <input type="text" id="seat" name="seat" ><br>
			캐스팅 : <input type="text" id="casting" name="casting" ><br>
			가격 : <input type="text" id="price" name="price" ><br>
			
			<!--  ********* -->
			  <textarea id="review" name="review">   </textarea>

			<div id = "button"><input type="submit" value="등록"><input type="reset" value="취소"></div>
		</form>
		
			<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		</div>
		<script>
		    $(document).ready(function() {
		        $('#review').summernote();
		    });
		  </script>
	</body>
</html>