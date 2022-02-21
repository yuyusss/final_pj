<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>MUTRODUCE</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <link href="/fullcalendar-5.10.1/lib/main.css" rel="stylesheet" />
    <link href="<c:url value='/css/menu.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/common.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/index.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/calendar.css'/>" rel="stylesheet" type="text/css">
    <script src="/fullcalendar-5.10.1/lib/main.js"></script>
    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
    <script src="<c:url value="/js/calendar.js" />"></script>
    <script src="<c:url value="/js/menu.js" />"></script>

</head>
<body>

<!-- 전체 컨텐츠 -->
<div id="wrap">
    <!-- login/join -->
    <div id="headerMenuBox">
        <div class="headerMenu">
            <ul>
                <li><a href="/signUp">회원가입</a> </li>
                <li><a href="/login">로그인</a> </li>
                <li><a href="/">마이페이지</a> </li>
            </ul>
        </div>
    </div>

    <!-- header -->
    <div id="logoBox">
        <a href="/"><img src="images/logo.jpeg" id="logoImage"></a>
    </div>
    <div id="topMenuBox">
        <div class="topMenu">
            <ul id="topMenuItem">
                <li class="menu1">
                    <a href="/">ΞΞ 전체 카테고리</a>
                    <ul class="sub">
                        <li><a href="/">오리지널/내한공연</a></li>
                        <li><a href="/">라이센스</a></li>
                        <li><a href="/">창작뮤지컬</a></li>
                        <li><a href="/">아동/가족</a></li>
                    </ul>
                </li>
                <li>
                    <a href="/">뮤지컬</a>
                    <ul class="sub">
                        <li><a href="/">오리지널/내한공연</a></li>
                        <li><a href="/">라이센스</a></li>
                        <li><a href="/">창작뮤지컬</a></li>
                        <li><a href="/">아동/가족</a></li>
                    </ul>
                </li>
                <li><a href="/">미디어</a></li>
                <li><a href="/">베스트</a></li>
                <li><a href="/">커뮤니티</a>
                    <ul class="sub">
                        <li><a href="/borad">배우별</a> </li>
                        <li><a href="/borad">뮤지컬별</a> </li>
                        <li><a href="/borad">정보게시판</a> </li>
                    </ul>
                </li>
                <li><a href="/">문의사항</a></li>
            </ul>
        </div>
    </div>

</body>
</html>
