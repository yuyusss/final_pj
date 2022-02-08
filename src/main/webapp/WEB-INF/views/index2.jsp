<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>MUTRODUCE</title>
    <link href="<c:url value='/css/menu.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/common.css'/>" rel="stylesheet" type="text/css">
    <link href="<c:url value='/css/index.css'/>" rel="stylesheet" type="text/css">
    <script src="<c:url value='/js/jquery-3.6.0.min.js'/>"></script>
    <script src="js/menu.js"></script>
</head>
<body>

    <!-- 전체 컨텐츠 -->
    <div id="wrap">
        <!-- login/join -->
        <div id="headerMenuBox">
            <div class="headerMenu">
                <ul>
                    <li><a href="/">회원가입</a> </li>
                    <li><a href="/">로그인</a> </li>
                    <li><a href="/">마이페이지</a> </li>
                </ul>
            </div>
        </div>

        <!-- header -->
        <div id="logoBox">
            <a href="/"><img src="images/logo.jpg" id="logoImage"></a>
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
            <div id="RecoNumber">
                <div class="RecogNumberItem">
                    <div class="RecogMain">
                        <div class="RecogMainMenu">
                            추천 main 넘버
                        </div>
                    </div>
                    <div class="RecogSub">
                        <div class="RecogSubMenu">
                            추천 넘버 sub
                        </div>
                        <div class="RecogSubMenu">
                            추천 넘버 sub
                        </div>
                        <div class="RecogSubMenu">
                            추천 넘버 sub
                        </div>
                    </div>
                </div>
            </div>
            <div class="calender">
                캘린더 들어올 곳
            </div>
        </div>
        <div class="lastSection">
            <div class="showMap">
                지도 들어올 부분
            </div>
            <div class="localHotChoice">
                지역별 뮤지컬 HOT Choice
            </div>
        </div>


        <!-- footerBox -->
        <footer class="footerBox">
            <div class="footerMenuWrap">
                <div class="footerInner">
                    <div class="footerMutroduce">
                        <div class="footerInfoTitle">
                            <h3>MUTRODUCE</h3>
                        </div>
                        <address>서욱특별시 강남구 삼성로 512 </address>
                        <div class="footerContact">
                            <h4>DEV</h4>
                            <h4>정현지, 김용휘, 유승희, 손지원, 박재훈</h4>
                        </div>
                    </div>
                    <div class="footerMutroduce">
                        <div class="footerInfoTitle">
                            <h3>고객센터</h3>
                        </div>
                        <address>서울 금천구 벚꽃로 278 SJ테크노빌 빌딩 15층 인터파크 고객센터</address>
                        <div class="footerContact">
                            <h4>고객센터</h4>
                            <h4>02-1111-1111</h4>
                        </div>
                    </div>
                    <div class="footerMutroduce">
                        <div class="footerInfoTitle">
                            <h3>전자금융거래 분쟁처리 담당</h3>
                        </div>
                        <div class="footerContact">
                            <h4>쇼핑 1588-1555 도서 1577-2555</h4>
                            <h4>티켓 1544-1555 팩스 02-6924-9001</h4>
                        </div>
                    </div>
                </div>
            </div>
        </footer>

    </div>

</body>
</html>
