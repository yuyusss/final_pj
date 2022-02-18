<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/hall.css'/>" rel="stylesheet" type="text/css">
		<title>공연장 안내</title>
	</head>
	
	<body>
		<!-- 탑 -->
		<!-- 공연장안내 -->
		<div class="hall"><h1 id = "공연장">공연장</h1>
				
			<div class = "wrap">
			<div id = "지역">서울</div>
           	<table border="1" class = "list">
			 
				   <c:forEach items="${seoulHallList}" varStatus="status" var="hall">
                        	<c:if test="${status.index % 5 == 0 }"><tr></c:if>
			              	 	 <th>
			              	 	 	<a href="<c:url value='/hall/detailView/${hall.no}'/>">
			              	 	 		<img src="./images/${hall.name }.jpg">
			              	 	 	</a>
			              	 	 </th>
                            <c:if test="${status.index % 5 == 4 }"></tr></c:if>
                      </c:forEach>
			
			</table>
			
			<div id = "지역">경기</div>
           	<table border="1" class = "list">
			 
				   <c:forEach items="${ggHallList}" varStatus="status" var="hall">
                        	<c:if test="${status.index % 5 == 0 }"><tr></c:if>
			              	 	 <th>
			              	 	 	<a href="<c:url value='/hall/detailView/${hall.no}'/>">
			              	 	 		<img src="./images/${hall.name }.jpg">
			              	 	 	</a>
			              	 	 </th>
                            <c:if test="${status.index % 5 == 4 }"></tr></c:if>
                      </c:forEach>
			
			</table>
			
			<div id = "지역">그 외 지역들</div>
           	<table border="1" class = "list">
			 
				   <c:forEach items="${etcHallList}" varStatus="status" var="hall">
                        	<c:if test="${status.index % 5 == 0 }"><tr></c:if>
			              	 	 <th>
			              	 	 	<a href="<c:url value='/hall/detailView/${hall.no}'/>">
			              	 	 		<img src="./images/${hall.name }.jpg">
			              	 	 	</a>
			              	 	 </th>
                            <c:if test="${status.index % 5 == 4 }"></tr></c:if>
                      </c:forEach>
			
			</table>			
			</div>
		</div>

		<!-- 바텀 -->
		
	</body>
</html>