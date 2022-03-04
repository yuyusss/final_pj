<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>뮤지컬 목록 페이지</title>
		
		<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
		
		<style type="text/css">
		.GenreButton {
/* 				display: block; */
			    overflow: hidden;
			    width: 400px;
			    height: 55px;
			    border: 1px solid #ccc;
			    border-radius: 3px;
			    text-align: center;
			    margin-top: 20px;
			    color: black;
			    background-color:white;
			    margin-top: 5px;
			}
			
			.GenreButton:hover {
				/* display: block; */
			    overflow: hidden;
			    width: 400px;
			    height: 55px;
			    border: 1px solid red;
			    border-radius: 3px;
			    text-align: center;
			    margin-top: 20px;
			    color: red;
			    background-color:white;
			    margin-top: 5px;
			    transition: 0.5s;
			}
			
			.GenreButton .text_type {
			    color: black;
			}
			
			b {
				color : rgb(96, 106, 183);
			}
		</style>
	</head>
	<body>
		<!-- Top -->
		<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>
		
		<!-- 뮤지컬 목록 페이지 -->
		<section>
		<div class="content_wrap">
			<div style="background-color: rgb(205, 210, 225);margin-top: 35px;padding-top: 20px;">
			<div class="content_list_title" style="text-align:left;">
							
				<h2 style="margin-left: 50px">${musicalData[0].genreName}</h2>
				<h4 style="text-align: center;">
					<button type="button" class="GenreButton" onclick="location.href='/musicalAllgenre'" style="width: 202px;">
							<span class="text_type">전체</span>
						</button>
					<button type="button" class="GenreButton" onclick="location.href='/musicalAllgenre/1'" style="width: 202px;">
						<span class="text_type">오리지널/내한공연</span>
					</button>
					<button type="button" class="GenreButton" onclick="location.href='/musicalAllgenre/2'" style="width: 202px;">
						<span class="text_type">라이센스</span>
					</button>
					<button type="button" class="GenreButton" onclick="location.href='/musicalAllgenre/3'" style="width: 202px;">
						<span class="text_type">창작뮤지컬</span>
					</button>
					<button type="button" class="GenreButton" onclick="location.href='/musicalAllgenre/4'" style="width: 202px;">
						<span class="text_type">아동/가족</span>
					</button>
					</h4>
				<br><hr>
			</div></div>
			<div class="content_list_main">
				<ul style="text-align:center">
					<c:forEach var="musc" items="${musicalData}">
						<li style="background-color: rgb(233, 233, 240);width:280px;overflow:hidden; text-overflow:ellipsis; white-space:nowrap;display: inline-block;margin-top: 50px;margin-right: 25px;margin-left: 25px;padding: 30px;">
						<a href="/muscDetailView/${musc.muscNo}"><img src="<c:url value='${musc.muscImg}'/>" alt="뮤지컬 포스터" style="width: 280px;"></a><br>
						<a href="/muscDetailView/${musc.muscNo}"><b>${musc.muscName}</b></a><br>
						<p style="color: rgb(145, 152, 204);">${musc.muscStartDate} ~ ${musc.muscEndDate}</p>
					</li>
					</c:forEach>
				</ul>
				<br><br>
			</div>
		</div>
		
		
		</section>
		
		
		<!-- Bottom -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		
	</body>
</html>