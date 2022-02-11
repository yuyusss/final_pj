<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>MUTRODUCE</title>

    <script>

        document.addEventListener('DOMContentLoaded', function() {
            // var calendarEl = document.getElementById('calendar');
            var calendarEl = $('#calendar')[0];

            var calendar = new FullCalendar.Calendar(calendarEl, {
                expandRows: true,
                /* Day 캘린더에서 시작 시간과 종료 시간 설정 */
                slotMinTime: '09:00',
                slotMaxTime: '20:00',
                headerToolbar: {
                    right: 'listWeek, dayGridMonth'
                },
                initialView: 'dayGridMonth',
                timeZone: 'UTC',
                navLinks: true, // 날짜 누르면 해당 날짜의 일정 보여주게
                navLinkDayClick: function(date, jsEvent){
                    console.log("day",date.toISOString());
                    console.log('coords',jsEvent.pageX, jsEvent.pageY)
                },
                dayMaxEvents: true, // 일정이 많을 경우 + more로 표기됨
                locale: 'ko',
                eventClick: function (info) {
                    var eventObj = info.event;

                    if(eventObj.url){
                        alert(
                            eventObj.title + '\n' +
                            '해당 일정의 에매 페이지로 이동합니다.'
                        );

                        window.open(eventObj.url);

                        info.jsEvent.preventDefault();
                }
                    else{
                        alert(eventObj.title);
                    }
            },
                events: [
                    $.ajax({
                        type: "GET",
                        url: "/monthPlan", // mapper 이름
                        dataType: 'json',
                        events: [
                            {
                                title: '지킬앤하이드',
                                start: '2022-02-09T14:00',
                                URL: 'http://ticket.interpark.com/'
                            },
                            {
                                title: '지킬앤하이드',
                                start: '2022-02-09T14:00',
                                URL: 'http://ticket.interpark.com/'
                            },
                            {
                                title: '지킬앤하이드',
                                start: '2022-02-24T14:00',
                                URL: 'http://ticket.interpark.com/'
                            }
                        ]
                    }),
                ]
            });

            calendar.render();
        });

    </script>
    <style>
        #calendar{
            border: 1px solid gold;
            height: 100%;
            width: 400px;
        }
    </style>
</head>
<body>

<!-- 전체 컨텐츠 -->
<div id="wrap">

    <!-- TOP -->
    <jsp:include page="/WEB-INF/views/layout/top.jsp" flush='true' />

    <!-- 배너 -->
    <section>
        <!-- section -->
        <div class="bannerMenu">
            <div class="bannerInfo">
                <div id="bannerName"><h2>Editor's Pick</h2></div>
                <div id="bannerViewItem">
                    <div class="bannerContent">
                        <div class="bannerPoster">
                            <img src="https://image.yes24.com/themusical/fileStorage/ThemusicalAdmin/Play/Image/20180731125240467854511c5f46d8a5eaae24a239ae6e.jpg" />
                        </div>
                        <div class="bannerPosterTitle">
                            지킬앤하이드
                        </div>
                    </div>
                    <div class="bannerContent">
                        <div class="bannerPoster">
                            <img src="https://image.yes24.com/themusical/fileStorage/ThemusicalAdmin/Play/Image/20180731125240467854511c5f46d8a5eaae24a239ae6e.jpg" />
                        </div>
                        <div class="bannerPosterTitle">
                            지킬앤하이드
                        </div>
                    </div>
                    <div class="bannerContent">
                        <div class="bannerPoster">
                            <img src="https://image.yes24.com/themusical/fileStorage/ThemusicalAdmin/Play/Image/20180731125240467854511c5f46d8a5eaae24a239ae6e.jpg" />
                        </div>
                        <div class="bannerPosterTitle">
                            지킬앤하이드
                        </div>
                    </div>
                    <div class="bannerContent">
                        <div class="bannerPoster">
                            <img src="https://image.yes24.com/themusical/fileStorage/ThemusicalAdmin/Play/Image/20180731125240467854511c5f46d8a5eaae24a239ae6e.jpg" />
                        </div>
                        <div class="bannerPosterTitle">
                            지킬앤하이드
                        </div>
                    </div>
                    <div class="bannerContent">
                        <div class="bannerPoster">
                            <img src="https://image.yes24.com/themusical/fileStorage/ThemusicalAdmin/Play/Image/20180731125240467854511c5f46d8a5eaae24a239ae6e.jpg" />
                        </div>
                        <div class="bannerPosterTitle">
                            지킬앤하이드
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <div class="secondSection">
        <div class="RecoNumber">
            <div class="RecogNumberItem">
                <div class="RecogMain">
                    <div class="RecogMainMenu">
                        <iframe width="440" height="350" src="https://www.youtube.com/embed/4rqI5F5Gra8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                </div>
                <div class="RecogSub">
                    <div class="RecogSubMenu">
                        <iframe width="200px" height="110px" src="https://www.youtube.com/embed/Zx4IwAVNKOw?showinfo=0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                    <div class="RecogSubMenu">
                        <iframe width="200px" height="110px" src="https://www.youtube.com/embed/Zx4IwAVNKOw?showinfo=0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                    <div class="RecogSubMenu">
                        <iframe width="200px" height="110px" src="https://www.youtube.com/embed/Zx4IwAVNKOw?showinfo=0" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                    </div>
                </div>
            </div>
        </div>
        <div class="calendar">
            <div id="calendar"></div>
        </div>
        <%-- <script src="js/calendar.js"></script>--%>
    </div>
    <div class="lastSection">
        <div class="showMap">
            지도 들어올 부분
        </div>
        <div class="localHotChoice">
            지역별 뮤지컬 HOT Choice 들어올 곳
        </div>
    </div>

    <!-- BOTTOM -->
    <jsp:include page="/WEB-INF/views/layout/bottom.jsp" flush='true' />

</div>
</body>
</html>
