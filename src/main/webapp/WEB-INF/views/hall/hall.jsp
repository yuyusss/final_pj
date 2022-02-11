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
				  <tr>
					  <th><a href="/hall2"><img src="./images/블루스퀘어.jpg"> </a></th>
					  <th><a href="/유니버설아트센터"><img src="./images/유니버설아트센터.jpg" width=150 height=50></a></th>
					  <th><img src="./images/샤롯데씨에터.jpg" width=150 height=50></th>
					  <th><img src="./images/동양예술극장.jpg" width=150 height=50></th>
					  <th><img src="./images/드림아트센터.jpg" width=150 height=50></th>
				  </tr>
				  <tr>
				     <th><img src="./images/백암아트홀.jpg" width=150 height=50></th>
				     <th><img src="./images/광화문아트홀.jpg" width=150 height=50></th>
				     <th><img src="./images/예술의전당.jpg" width=150 height=50></th>
				     <th><img src="./images/국립극장.jpg" width=150 height=50></th>
				     <th><img src="./images/워커힐호텔.jpg" width=150 height=50></th>
				  </tr>
				  <tr>
				    <th><img src="./images/LG아트센터.jpg" width=150 height=50></th>
				    <th><img src="./images/유니플렉스.jpg" width=150 height=50></th>
				    <th><img src="./images/광림아트센터.jpg" width=150 height=50></th>
				    <th><img src="./images/두산아트센터.jpg" width=150 height=50></th>
				    <th><img src="./images/세종문화회관.jpg" width=150 height=50></th>
				  </tr>
				</table>
				</div>
			
			<div class="wrap">
				<div id = "지역">경기</div>
				<table border="1" class = "list">
				  <tr>
				    <th><img src="./images/경기아트센터.jpg"></th>
				    <th><img src="./images/수원SK아트리움.jpg" width=150 height=50></th>
				    <th><img src="./images/군포문화예술회관.jpg" width=150 height=50></th>
				    <th><img src="./images/고양아람누리.jpg" width=150 height=50></th>
				    <th><img src="./images/성남아트센터.jpg" width=150 height=50></th>
				  </tr>
				  <tr>
				    <th><img src="./images/용인포은아트홀.jpg" width=150 height=50></th>
				    <th><img src="./images/이천아트홀.jpg" width=150 height=50></th>
				    <th><img src="./images/안산문화예술의전당.jpg" width=150 height=50></th>
				    <th><img src="./images/의정부예술의전당.jpg" width=150 height=50></th>
				    <th><img src="./images/하남문화예술회관.jpg" width=150 height=50></th>
				  </tr>
				  <tr>
				    <th><img src="./images/부천복사골문화센터.jpg" width=150 height=50></th>
				    <th><img src="./images/경기아트센터.jpg" width=150 height=50></th>
				    <th><img src="./images/경기아트센터.jpg" width=150 height=50></th>
				    <th><img src="./images/경기아트센터.jpg" width=150 height=50></th>
				    <th><img src="./images/경기아트센터.jpg" width=150 height=50></th>
				  </tr>
				</table>
				</div>
			
			<div class = "wrap">
				<div id = "지역">그 외 지역들</div>
				<table border="1" class = "list">
				  <tr>
				  <th id = "블루스퀘어"><a href="/bluesquare"> </a></th>
				  <th>예술의 전당</th>
				  <th>세종문화 회관</th>
				  <th>디큐브아트센터</th>
				  <th>유니버셜 아트센터</th>
				  </tr>
				  <tr>
				    <th>두산아트센터</th>
				    <th>경기아트센터</th>
				    <th>성남아트센터</th>
				    <th>의정부문화재단</th>
				    <th>천안예술의전당</th>
				  </tr>
				  <tr>
				    <th>두산아트센터</th>
				    <th>대구오페라하우스</th>
				    <th>통영국제음악재단(TIMF)</th>
				    <th>한국소리문화의전당</th>
				    <th>예울마루</th>
				  </tr>
				</table>
			</div>
		</div>
			
			
		<!-- 바텀 -->
		
	</body>
</html>