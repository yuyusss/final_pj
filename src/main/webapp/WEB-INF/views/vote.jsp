<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
    <link href="<c:url value='/css/vote.css'/>" rel="stylesheet" type="text/css">
</head>
<body>
<div id="wrap">
    <!-- TOP -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>

    <div class="voteAll">
        <%-- 투표 페이지 - 배너(현재 순위) --%>
        <div class="voteBanner">
            현재 뮤지컬 / 배우 순위 알려주는 창
        </div>
        <div class="voteItem">
            뮤지컬 / 배우 투표할 수 있게 함
        </div>
    </div>



    <!-- BOTTOM -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
</body>
</html>