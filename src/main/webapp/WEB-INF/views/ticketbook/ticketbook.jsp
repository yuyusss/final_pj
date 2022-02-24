<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="<c:url value='/css/ticketbook.css'/>" rel="stylesheet" type="text/css">
    <title>티켓북</title>
</head>

<body>
<div id="wrap">
    <!-- 탑 -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true'/>

    <!-- 티켓북 -->

    <div><h1>${ticketbook.memID }님의 티켓북</h1></div>


    <a href="<c:url value='ticketbook/ticketInsertForm'/>">티켓 추가</a>


    <%--티켓 한 개의 이미지 보이는 div -> forEach로 반복 --%>
    <div class="ticketAll">
        <c:forEach items="${pjhTicketList}" var="ticketbook">
            <div class="all">

                <table border="1" class="list">

                    <tr>
                        <td rowspan="3" align="center" id="빈칸">
                            <div>

                            </div>
                        </td>

                        <td id="공연제목">
                            <h2>공연제목 : <strong>${ticketbook.subject } </strong></h2><br>

                        </td>
                    </tr>

                    <tr>
                        <td id="내용">
                            <div>장소 : ${ticketbook.theater } 가격 : ${ticketbook.price} <br></div>
                            <div>좌석 : ${ticketbook.seat } <br></div>
                            <div>캐스팅 : ${ticketbook.casting }<br></div>

                            후기
                        </td>
                    </tr>

                </table>

            </div>

        </c:forEach>

    </div>

    <!-- 바텀 -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true'/>

</div>
</body>
</html>
