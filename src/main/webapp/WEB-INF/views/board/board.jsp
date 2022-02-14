<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>과제</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="<c:url value='/css/board.css'/>" rel="stylesheet"
	type="text/css">
<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
<script src="<c:url value='/js/board.js'/>"></script>
<script src="<c:url value='/js/boardmenu.js'/>"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>


<style>
.fakeimg {
	height: 200px;
	background: #aaa;
}
</style>

<script type="text/javascript">


	$(document).ready(
			function() {
				$("#writeBtn").click(function() {
					location.href = "write";
				})
				$.ajax({
					url : "boardList",
					success : function(result) {
						var html = "";
						result.forEach(function(item) {
							html += "<tr> <td>"+item.idx+"</td><td></td><td><a style='text-decoration:none;' href = 'view?idx=" + item.idx
									+ "'>" + item.title + "</a></td><td>"+item.contents+"</td><td>"+item.hits+"</td><td>"+item.writedate+"</td><td><a href='/board/deleteboard/"+item.idx+"' style='text-decoration:none;'>&#10060;</a></td>"
						})
						$("#listArea").append(html)
						$('#example').DataTable();
					}
				});
				$("#deleteBtn").click(function() {
					location.href = "write";
				})
			});
	
</script>
</head>
<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />
<nav id="boardmenu">
		<span style="font-size: 30px; cursor: pointer" onclick="openNav()">&#9776;
			</span>
		<div class="menu-btn">
			<div class="line line--1"></div>
			<div class="line line--2"></div>
			<div class="line line--3"></div>
		</div>
		<div class="nav-links">
			<div id="mySidenav" class="sidenav">
				<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
				<ul id="menuGroup">
					<li class="menu link"><a href="/board">공연 요청</a></li>
					<li class="menu link"><a href="#">장르별 추천</a>
						<ul class="hide">
							<li class="subMenu"><a href="<c:url value='/'/>">배우 별</a></li>
							<li class="subMenu"><a href="<c:url value='/'/>">장르 별</a></li>
							<li class="subMenu"><a href="<c:url value='/'/>">넘버 별</a></li>
						</ul></li>
					<li class="menu link"><a href="#">정보 게시판</a></li>
				</ul>
			</div>
		</div>
	</nav>
<body link="blue" vlink="blue" alink="blue">
	<div class="boardcontainer">
		<div class="row">
			<div class="board">
				<h2>공연 요청</h2>
				<hr><hr>
				<br>
				<table id="example" class="display" style="width: 100%">
					<thead>
						<tr>
							<th>게시글 번호</th><th>작성자</th><th>제목</th><th>내용</th><th>조회 수</th><th>작성일</th><th>삭제</th>
						</tr>
					</thead>
					<tbody id="listArea">
					</tbody>
				</table>
				<br>
				
			</div>
		</div>
		<button type="button" class="writeBtn" id="writeBtn">글쓰기</button>
	</div>
	<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
</body>
</html>