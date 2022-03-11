<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="<c:url value='/css/ticketBook.css'/>" rel="stylesheet" type="text/css">
	<title>My page</title>
</head>
	
	<body>
	<div id = "wrap">
		<!-- 탑 -->
		 <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>

		<div class="bannerTitle">
			<div class="bannerTitle_2">
				<span>My Page</span>
			</div>
		</div>

		<!-- 티켓북 -->
		<div class="ticketBookMain">
			<div class="MyPage">
				<div class="MyPageContent">
					<div class="userInfo">
						<table class="admin_table">
							<tr>
								<td>프로필 사진</td>
								<td>${sid.memId}님</td>
								<td><button>회원정보 수정</button></td>
							</tr>
							<tr>
								<td>티켓북 N권</td>
								<td>티켓 N개</td>
								<td>총 공연시간 N시간</td>
							</tr>
						</table>
					</div>
				</div>
				<div class="ticketBook">
					<c:forEach begin="0" end="0">
						<div class="ticketBookContent" >
							<img src="<c:url value="/images/ticketBook.png" />">
							<h3><a href="<c:url value="/ticketDetailView/${ticketbook.no }"/>">티켓북${ticketbook.no}</a></h3>
						</div>
					</c:forEach>
					<%--상세 티켓 들어올 자리
                    <c:forEach begin="0" end="4">
                        <div class="ticket">
                            <img src="<c:url value='/images/ticket.png' /> ">
                        </div>
                    </c:forEach>--%>
				</div>
			</div>
			<div class="RecogMusical" style="text-align: left;">
				<!-- 공연 추천 (지원님 완성하신 부분 들어올 자리)<br> -->
				<div id="reframe" style="width: 100%">
				<a href=""></a><iframe src="<c:url value='/favorRecommand/${sid.memId}'/>" style="position: absolute; width: 30%; height: 70%; border: hidden;"></iframe>
				</div>
			</div>
		</div>
		
		<!-- 바텀 -->
		<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
		
		</div>
	</body>
</html>
