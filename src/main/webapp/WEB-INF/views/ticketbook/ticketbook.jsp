<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>티켓북</title>
	</head>
	
	<body>
	<div id = "wrap">
		<!-- 탑 -->
		 <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		
		<!-- 티켓북 -->
	<div>
		<div>나의 티켓북</div>
			<div> 티켓모형그림 
				<div>
				
				</div>
			</div>
		</div>
		
		<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		
		</div>
	</body>
</html>
