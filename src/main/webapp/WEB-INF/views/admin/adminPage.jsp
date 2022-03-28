<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>관리자 전용 - 정보 등록, 삭제 페이지</title>
    <link href="<c:url value='/css/signUp.css'/>" rel="stylesheet">
    <link href="<c:url value='/css/admin.css'/>" rel="stylesheet">
    <link href="<c:url value='/css/index.css'/>" rel="stylesheet">
</head>
<body>
<div id="wrap">
    <!-- TOP -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>

    <div class="bannerTitle">
        <div class="bannerTitle_2">
            <span>Admin Page</span>
        </div>
    </div>
    <div class="adminContent">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Member</h4>
                <p class="card-description">
                    <a href="/adminMember">[ Update Member ]</a>
                </p>
            </div>
        </div>

        <%-- Musical --%>
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Musical</h4>
                <p class="card-description">
                    <a href="/adminMusical">[ Update Musical ]</a>
                </p>
            </div>
        </div>

        <%-- Actor --%>
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Actor</h4>
                <p class="card-description">
                    <a href="/adminActor">[ Update Actor ]</a>
                </p>
            </div>
        </div>

        <%-- Calendar --%>
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Calendar</h4>
                <p class="card-description">
                    <a href="/adminCalendar">[ Update Ticketing Plan ]</a>
                </p>
            </div>
        </div>

        <%-- Theater --%>

        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Theater</h4>
                <p class="card-description">
                    <a href="#">[ Update Theater ]</a>
                </p>
            </div>
        </div>
    </div>

    <!-- BOTTOM -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>

</div>
</body>
</html>