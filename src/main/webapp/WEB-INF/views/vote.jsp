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

    <div class="voteMain">
        <input type="radio" id="tab1" name="show" checked/>
        <input type="radio" id="tab2" name="show" />

        <div class="tab">
            <label for="tab1">배우</label>
            <label for="tab2">뮤지컬</label>
        </div>

        <div class="voteContent">
            <div class="content-vote">
                <div class="voteResult">
                    <table>
                        <c:forEach items="${actorList}" var="act" varStatus="status" begin="0" end="2">
                            <tr>
                                <td>${status.count}</td>
                                <td>${act.actorName}</td>
<%--                                <td><img src="<c:url value='${act.actorProfile}' /> "></td>--%>
                                <td>${act.actorVote}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="voteItem">
                    <table border="1" class="tableItem">
                        <tr>
                            <th>순위</th>
                            <th>프로필 사진</th>
                            <th>이름</th>
                            <th>출연작품</th>
                            <th>득표수</th>
                            <th></th>
                        </tr>
                        <c:forEach items="${actorList}" var="act" varStatus="status">
                            <tr>
                                <td>${status.count}</td>
                                <td style="width: 110px"><div class="profileBox"><img class="profile" src="<c:url value='${act.actorProfile}' /> "></div></td>
                                <td>${act.actorName}</td>
                                <td>${act.actorName}의 출연작품이름과 배역 이름</td>
                                <td>${act.actorVote}</td>
                                <td><a href="/">투표</a> </td>
                            </tr>
                        </c:forEach>

                    </table>
                </div>
            </div>
            <div class="content-vote">
                <div class="voteResult">
                    <table>
                        <c:forEach items="${actorList}" var="act" varStatus="status" begin="0" end="2">
                            <tr>
                                <td>${status.count}</td>
                                <td>${act.actorName}</td>
                                    <%--                                <td><img src="<c:url value='${act.actorProfile}' /> "></td>--%>
                                <td>${act.actorVote}</td>
                                <td><a href="/">투표</a> </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <div class="voteItem">
                    <table border="1" class="tableItem">
                        <tr>
                            <th>순위</th>
                            <th>뮤지컬 포스터</th>
                            <th>감독 이름</th>
                            <th>출연진 이름</th>
                            <th>득표수</th>
                            <th></th>
                        </tr>
                        <c:forEach items="${actorList}" var="act" varStatus="status">
                            <tr>
                                <td>${status.count}</td>
                                <td style="width: 110px"><div class="profileBox"><img class="profile" src="<c:url value='${act.actorProfile}' /> "></div></td>
                                <td>${act.actorName}</td>
                                <td>${act.actorName}의 출연작품이름과 배역 이름</td>
                                <td>${act.actorVote}</td>
                                <td><a href="/">투표</a> </td>
                            </tr>
                        </c:forEach>

                    </table>
                </div>
            </div>
        </div>
    </div>





    <!-- BOTTOM -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
</body>
</html>