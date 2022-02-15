<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>MUTRODUCE</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="<c:url value='/css/board.css'/>" rel="stylesheet"
	type="text/css">
<script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
<script src="<c:url value='/js/board.js'/>"></script>
<script src="<c:url value='/js/boardmenu.js'/>"></script>
<script src="<c:url value='/js/boardSearch.js'/>"></script>

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
	<div class="searchcontainer">
	<form method="post" name="search" id="boardSearchFrm">
				<table class="pull-right">
				<tbody class="searchtable">
					<tr>
						<td><select class="form-control" name="searchField" name="searchType" id="searchType"

>
								<option value="0">선택</option>
								<option value="bbsTitle">제목</option>
								<option value="userID">작성자</option>
						</select></td>
						<td><input type="text" class="form-control"
							placeholder="검색어 입력" name="searchText" maxlength="100"></td>
						<td><button type="submit" class="btn searchbtn" name="btnSearch" id="btnSearch">검색</button></td>
					</tr>
				</tbody>
				</table>
			</form>
	</div>
		<div class="row">
			<div class="board">
				<h2>공연 요청</h2>
				<hr><hr>
				<br>
				<table id="example" class="display" style="width: 100%">
					<thead>
						<tr>
							<th>게시글 번호</th><th>작성자</th><th>제목</th><th>내 용</th><th>조회 수</th><th>작성일</th><th>삭제</th>
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
	<!-- pagination{s} -->

	<%-- <div id="paginationBox">

		<ul class="pagination">
			<c:if test="${pagination.prev}">
				<li class="page-item"><a class="page-link" href="#" onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
			</c:if>

				
			<c:forEach begin="${pagination.startPage}" end="${pagination.endPage}" var="idx">
				<li class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> "><a class="page-link" href="#" onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')"> ${idx} </a></li>
			</c:forEach>

				

			<c:if test="${pagination.next}">

				<li class="page-item"><a class="page-link" href="#" onClick="fn_next('${pagination.range}', 

 '${pagination.range}', '${pagination.rangeSize}')" >Next</a></li>

			</c:if>

		</ul>

	</div> --%>

	<!-- pagination{e} -->

	<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />
</body>
<script type="text/javascript">
//이전 버튼 이벤트

function fn_prev(page, range, rangeSize) {

		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
	
		var url = "${pageContext.request.contextPath}/board/getBoardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;	

		location.href = url;

	}

  //페이지 번호 클릭

	function fn_pagination(page, range, rangeSize, searchType, keyword) {

		var url = "${pageContext.request.contextPath}/board/getBoardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;

		location.href = url;	

	}

	//다음 버튼 이벤트

	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;	

		var url = "${pageContext.request.contextPath}/board/getBoardList";
		url = url + "?page=" + page;
		url = url + "&range=" + range;

		location.href = url;

	}

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
	
	$(document).on('click', '#btnSearch', function(e){

		e.preventDefault();

		var url = "${pageContext.request.contextPath}/board/getBoardList";

		url = url + "?searchType=" + $('#searchType').val();

		url = url + "&keyword=" + $('#keyword').val();

		location.href = url;

		console.log(url);

	});	
	
</script>
</html>