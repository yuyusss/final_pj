<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="<c:url value='/css/hall2.css'/>" rel="stylesheet" type="text/css">
		<title>공연장 안내</title>
	</head>
	
	<body>
		<!-- 탑 -->
		<!-- 공연장안내 -->
		<div class = "all">
			<div class="hall2"></div>
			<div class="A1">공연장안내 > <strong>블루스퀘어</strong></div> 
			  <div><h2>블루스퀘어소개</h2></div>
					<div class = "A2"></div>
						
						<table border = 1 class = "list">
							  <tr>
								  <th>위치</th>
								  <td colspan = "2">서울 용산구</td>
							  </tr>
							  <tr>
							     <th>좌석</th>
							     <td>신한카드홀</td>
							     <td>마스터카드홀</td>
							  </tr>
							  <tr>
							     <th>편의시설</th>
							     <td>레스토랑</td>
							     <td>카페</td>
							  </tr>
							  <tr>
							     <th id = "고객센터번호">고객센터번호</th>
							     <td colspan = "2">1234</td>
							  </tr>
							 
							</table>
			  <div><h3>오시는길</h3></div>
				<div>
				<img src = http://ticketimage.interpark.com/TicketImage/bluesquare/map2.gif border = 1 >
				  <div><form action="https://map.kakao.com/?URLX=500326&URLY=1121841&URLLEVEL=3&srcid=14529813&q=%BA%ED%B7%E7%BD%BA%C4%F9%BE%EE&map_type=TYPE_MAP" target = '_blank'>
				  <button type="submit" class = submit>지도보기</button></form></div>	
				 </div>
			  	<div>
			    	<table class = "list2">
							  <tr>
								  <th><img src = http://ticketimage.interpark.com/TicketImage/bluesquare/map_txt1.gif></th>
							  </tr>
							  <tr>
							     <th><img src = http://ticketimage.interpark.com/TicketImage/bluesquare/map_txt2.gif></th>
							  </tr>
					          <tr>
						 	    <th><img src="./images/블루스퀘어 주차안내.jpg" width=645px height=100px></th>
							  </tr>
						</table>
 				</div>
 			</div>
			
		<!-- 바텀 -->
	</body>
</html>