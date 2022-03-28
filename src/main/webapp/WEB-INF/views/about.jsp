<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>MUTRODUCE :: About </title>
    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
    <link href="<c:url value="/css/about.css" />" rel="stylesheet" type="text/css">
</head>
<body>
<!-- TOP -->
<jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>

<div>
    <div class="bannerTitle" style="margin-top: 60px; margin-bottom: 100px;">
        <div class="bannerTitle_1">
            <span>Our</span> 
        </div>
        <div class="bannerTitle_2">
            <span>Story</span>
        </div>
    </div>  

    <div class="background"></div>

    <div class="aboutImage">
        <img src="<c:url value="/images/about1.jpeg" />"/>
    </div>

    <div class="aboutInfo">
        <p>
            뮤지컬을 소개하다. "MUTRODUCE"는 뮤지컬이 처음인 사람들에게는 뮤지컬에 대한 정보를, 뮤지컬에 대해 많이 알고, 즐기는 팬들에게는 소통할 수 있는 커뮤니티 공간을 제공합니다.
        </p>
        <p>
            뮤지컬 소개는 물론, 티켓팅 일정을 알려주는 캘린더 기능, 날씨 정보에 맞춰 뮤지컬 넘버를 추천해주는 넘버 추천 기능, 팬들끼리 소통할 수 있는 게시판 기능, 좋아하는 배우와 뮤지컬에 투표할 수 있는 투표와 랭킹 기능은 물론
            관람한 뮤지컬의 후기를 적고, 별점을 줄 수 있는 티켓북 페이지까지 뮤지컬 덕후를 위한 다양한 정보를 제공하고 있습니다.
        </p>
    </div>
</div>
 
<!-- BOTTOM -->
<jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
</body>
</html>