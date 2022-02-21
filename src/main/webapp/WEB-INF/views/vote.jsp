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
                    <div>2등</div>
                    <div>1등</div>
                    <div>3등</div>
                </div>
                <div class="voteItem">
                    <table border="0.5">
                        <tr>
                            <th>순위</th>
                            <th>이름</th>
                            <th>작품</th>
                            <th>득표수</th>
                        </tr>
                        <tr>
                            <td>순위</td>
                            <td>순위</td>
                            <td>순위</td>
                            <td>순위</td>
                            <td><a href="/">투표</a> </td>
                        </tr>

                    </table>
                </div>
            </div>
            <div class="content-vote">
                뮤지컬 랭킹
            </div>
        </div>
    </div>





    <!-- BOTTOM -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>
</body>
</html>